/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 4:00 PM
 * *******************************************************
 */
package com.example.billprocesing.controllers;

import com.example.billprocesing.dto.FinancialRequest;
import com.example.billprocesing.dto.ProcessedBillRequest;
import com.example.billprocesing.proxy.impl.HttpBinProxyImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvoiceController {



    @PostMapping("/bill")
    public String getInvoice(@RequestBody ProcessedBillRequest processedBillRequest) {
        HttpBinProxyImpl httpBinProxyimpl = new HttpBinProxyImpl();
        return httpBinProxyimpl.getInvoice(processedBillRequest);
    }
}
