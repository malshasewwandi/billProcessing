/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 10:42 AM
 * *******************************************************
 */
package com.example.billprocesing.proxy.impl;

import com.example.billprocesing.dto.*;
import com.example.billprocesing.proxy.HttpBinProxy;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class HttpBinProxyImpl implements HttpBinProxy {

    @Override
    public String getFinancialDetails(FinancialRequest financialRequest) {
        String jsonStr = "";
        try {
            FinancialResponse financialResponse = new FinancialResponse();

            financialResponse.setPathwaySequenceNo(1254);
            financialResponse.setTransformerCode("APLCJSD");
            financialResponse.setBillId("5464623");
            financialResponse.setOutstandingBalance(4505.30);
            financialResponse.setBranch("Colombo");
            financialResponse.setCsc("sdsa");
            financialResponse.setPoleCode("1200");
            financialResponse.setAccountNo("12549498");
            financialResponse.setConnectionCapacity("asadadsad");
            financialResponse.setSecurityDeposit(45000.00f);
            financialResponse.setInverterCapacity("Testing");
            financialResponse.setPanelCapacity("Testing");
            financialResponse.setGenerationDebitAccount("Testing");
            financialResponse.setTariffCategory("Testing");
            financialResponse.setAddress("Testing Address");
            financialResponse.setCustomerName("Testing Customer");
            financialResponse.setSmsSubscribed(true);
            financialResponse.setSmsNumber("Testing");
            financialResponse.setEmailAddress("testing@gmail.com");

            ObjectMapper Obj = new ObjectMapper();

            jsonStr = Obj.writeValueAsString(financialResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonStr;
    }


    @Override
    public String getInvoice(ProcessedBillRequest processedBillRequest) {
        String jsonStr = "";
        try {
            InvoicedBill invoicedBill = new InvoicedBill();

            invoicedBill.setPathwaySequenceNo(processedBillRequest.getPathwaySequenceNo());
            invoicedBill.setTransformerCode(processedBillRequest.getTransformerCode());
            invoicedBill.setBillId(processedBillRequest.getBillId());
            invoicedBill.setBranch(processedBillRequest.getBranch());
            invoicedBill.setCsc(processedBillRequest.getCsc());
            invoicedBill.setPoleCode(processedBillRequest.getPoleCode());
            invoicedBill.setAccountNo(processedBillRequest.getAccountNo());
            invoicedBill.setConnectionCapacity(processedBillRequest.getConnectionCapacity());
            invoicedBill.setSecurityDeposit(processedBillRequest.getSecurityDeposit());
            invoicedBill.setInverterCapacity(processedBillRequest.getInverterCapacity());
            invoicedBill.setPanelCapacity(processedBillRequest.getPanelCapacity());
            invoicedBill.setGenerationDebitAccount(processedBillRequest.getGenerationDebitAccount());
            invoicedBill.setTariffCategory(processedBillRequest.getTariffCategory());
            invoicedBill.setAddress(processedBillRequest.getAddress());
            invoicedBill.setCustomerName(processedBillRequest.getCustomerName());
            invoicedBill.setSmsSubscribed(processedBillRequest.isSmsSubscribed());
            invoicedBill.setSmsNumber(processedBillRequest.getSmsNumber());
            invoicedBill.setEmailAddress(processedBillRequest.getEmailAddress());

            processedBillRequest.getBill().setNotice(new Notice());
            processedBillRequest.getBill().setPreviousPayments(new PreviousPayments());
            processedBillRequest.getBill().setPreviousBill(new PreviousBill());

            invoicedBill.setBill(processedBillRequest.getBill());


            ObjectMapper Obj = new ObjectMapper();

            jsonStr = Obj.writeValueAsString(invoicedBill);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return jsonStr;
    }
}
