/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  billprocessingAPI
 *  *  Created Date        -  2/13/2024 10:51 PM
 * *******************************************************
 */
package com.example.billprocesing.controllers;

import com.example.billprocesing.dto.FinancialRequest;
import com.example.billprocesing.service.BillProcessingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillProcessController {

    Logger logger = LoggerFactory.getLogger("Bill Processing controller");
    private final BillProcessingService billProcessingService = new BillProcessingService();

    @PostMapping("/processbill")
    public ResponseEntity processBill(@RequestBody FinancialRequest financialRequest) {
        logger.info("processBill" + financialRequest.getAccountNo());
        try {
            return billProcessingService.processingBill(financialRequest);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("Bad Request", HttpStatus.BAD_REQUEST);
        }
    }


}
