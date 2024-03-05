/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  complete
 *  *  Created Date        -  2/14/2024 4:41 PM
 * *******************************************************
 */
package com.example.billprocesing.dto;

public class FinancialRequest {
    private String billId;
    private int pathwaySequenceNo;
    private String accountNo;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public int getPathwaySequenceNo() {
        return pathwaySequenceNo;
    }

    public void setPathwaySequenceNo(int pathwaySequenceNo) {
        this.pathwaySequenceNo = pathwaySequenceNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
