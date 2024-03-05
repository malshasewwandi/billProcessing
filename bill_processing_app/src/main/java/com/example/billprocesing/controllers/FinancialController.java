/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 10:49 AM
 * *******************************************************
 */
package com.example.billprocesing.controllers;


import com.example.billprocesing.dto.FinancialRequest;
import com.example.billprocesing.proxy.impl.HttpBinProxyImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialController {

    @PostMapping("/financial-info")
    public String getFinancialDetails(@RequestBody FinancialRequest financialRequest) {
        HttpBinProxyImpl httpBinProxyimpl = new HttpBinProxyImpl();
        return httpBinProxyimpl.getFinancialDetails(financialRequest);
    }

}
