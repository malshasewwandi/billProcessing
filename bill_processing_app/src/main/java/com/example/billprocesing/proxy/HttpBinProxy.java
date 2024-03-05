package com.example.billprocesing.proxy;

import com.example.billprocesing.dto.FinancialRequest;
import com.example.billprocesing.dto.FinancialResponse;
import com.example.billprocesing.dto.ProcessedBillRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "httpbin", url = "${base.url.httpbin}")
public interface HttpBinProxy {

    @PostMapping("/financial")
    String getFinancialDetails(FinancialRequest financialRequest);

    @PostMapping("/invoice")
    String getInvoice(ProcessedBillRequest processedBillRequest);
}
