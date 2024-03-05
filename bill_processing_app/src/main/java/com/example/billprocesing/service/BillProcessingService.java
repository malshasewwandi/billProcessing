/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  complete
 *  *  Created Date        -  2/14/2024 4:54 PM
 * *******************************************************
 */
package com.example.billprocesing.service;

import com.example.billprocesing.dto.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

public class BillProcessingService {

    Logger logger = LoggerFactory.getLogger("Bill Processing Service");

    public ResponseEntity processingBill(FinancialRequest financialRequest) throws Exception {
        logger.info("Starting the process bill" + financialRequest.getAccountNo());
        try {
            //get financial details
            FinancialResponse financialResponse = getFinanceDetails(financialRequest);

            //generating the bill by finance details
            ProcessedBillRequest processedBillRequest = processedBill(financialResponse);

            //get invoiced Bill
            InvoicedBill invoicedBill = getInvoicedBill(processedBillRequest);

            //Distribution the bill
            billDistribution(invoicedBill);

            return new ResponseEntity(invoicedBill, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Bad Request", HttpStatus.BAD_REQUEST);
        }


    }

    private void billDistribution(InvoicedBill invoicedBill) throws Exception {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private InvoicedBill getInvoicedBill(ProcessedBillRequest pbr) throws Exception {
        logger.info("getInvoicedBill " + pbr.getAccountNo());
        InvoicedBill responseBody = null;
        try {
            // Send an HTTP GET request
            URI url = new URI("http://localhost:8080/bill");

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            HttpEntity<ProcessedBillRequest> requestEntity = new HttpEntity<>(pbr, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<InvoicedBill> responseEntity = restTemplate.postForEntity(url, requestEntity, InvoicedBill.class);
            // Process the response
            if (responseEntity.getStatusCode().is2xxSuccessful()) {
                responseBody = responseEntity.getBody();
                logger.info("Response: " + responseBody);
            } else {
                logger.error("Unexpected HTTP status: " + responseEntity.getStatusCode());
            }
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode().is4xxClientError()) {
                logger.error("Client error: " + e.getStatusCode() + " - " + e.getStatusText());
                logger.error("Response Body: " + e.getResponseBodyAsString());
            } else {
                logger.error("Unexpected HTTP status: " + e.getStatusCode());
            }
        } catch (Exception e) {
            logger.error("An error occurred: " + e.getMessage());
            throw e;
        }

        return responseBody;
    }

    private ProcessedBillRequest processedBill(FinancialResponse fr) throws Exception {
        logger.info("processedBill " + fr.getAccountNo());
        ProcessedBillRequest processedBillRequest = new ProcessedBillRequest(
                fr.getPathwaySequenceNo(), fr.getBillId(), fr.getBranch(),
                fr.getCsc(), fr.getTransformerCode(), fr.getPoleCode(),
                fr.getAccountNo(), fr.getConnectionCapacity(), fr.getInverterCapacity(), fr.getPanelCapacity(),
                fr.getGenerationDebitAccount(), fr.getCustomerName(), fr.getAddress(), fr.getSmsNumber(), fr.getEmailAddress(),
                fr.getTariffCategory(), fr.getSecurityDeposit(), fr.isSmsSubscribed());
        try {
            processedBillRequest.setBill(createBill(fr));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }

        return processedBillRequest;
    }

    private Bill createBill(FinancialResponse fr) throws Exception {
        logger.info("createBill " + fr.getAccountNo());
        Bill bill = new Bill();
        try {
            bill.setNoOfDays(30);
            bill.setTotalPayable(122000.00f);
            bill.setBillBreakDown(new BillBreakDown());
//            bill.setBroughtForwards(new BroughtForwards());
//            bill.setCarryForwards();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return bill;
    }


    public FinancialResponse getFinanceDetails(FinancialRequest financialRequest) throws Exception {
        logger.info("getFinanceDetails " + financialRequest.getAccountNo());
        FinancialResponse responseBody = null;
        try {
            // Send an HTTP GET request
            URI url = new URI("http://localhost:8080/financial-info");

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);

            HttpEntity<FinancialRequest> requestEntity = new HttpEntity<>(financialRequest, headers);
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<FinancialResponse> responseEntity = restTemplate.postForEntity(url, requestEntity, FinancialResponse.class);
            // Process the response
            if (responseEntity.getStatusCode().is2xxSuccessful()) {
                responseBody = responseEntity.getBody();
                logger.info("Response: " + responseBody);
            } else {
                logger.error("Unexpected HTTP status: " + responseEntity.getStatusCode());
            }
        } catch (HttpClientErrorException e) {
            if (e.getStatusCode().is4xxClientError()) {
                logger.error("Client error: " + e.getStatusCode() + " - " + e.getStatusText());
                logger.error("Response Body: " + e.getResponseBodyAsString());
            } else {
                logger.error("Unexpected HTTP status: " + e.getStatusCode());
            }
        } catch (Exception e) {
            logger.error("An error occurred: " + e.getMessage());
            throw e;
        }

        return responseBody;
    }
}
