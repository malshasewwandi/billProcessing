/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  complete
 *  *  Created Date        -  2/15/2024 10:25 PM
 * *******************************************************
 */
package com.example.billprocesing.dto;

import java.util.List;

public class FinancialResponse {

    private int pathwaySequenceNo;
    private String transformerCode;
    private String billId;
    private double outstandingBalance;
    private String branch;
    private String csc;
    private String poleCode;
    private String accountNo;
    private String connectionCapacity;
    private float securityDeposit;
    private String inverterCapacity;
    private String panelCapacity;
    private String generationDebitAccount;
    private String tariffCategory;
    private String customerName;
    private String address;
    private boolean smsSubscribed;
    private String smsNumber;
    private String emailAddress;
    private PreviousBill previousBill;
    private List<PreviousPayments> previousPayments;
    private List<Notice> notice;

    public int getPathwaySequenceNo() {
        return pathwaySequenceNo;
    }

    public void setPathwaySequenceNo(int pathwaySequenceNo) {
        this.pathwaySequenceNo = pathwaySequenceNo;
    }

    public String getTransformerCode() {
        return transformerCode;
    }

    public void setTransformerCode(String transformerCode) {
        this.transformerCode = transformerCode;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public double getOutstandingBalance() {
        return outstandingBalance;
    }

    public void setOutstandingBalance(double outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCsc() {
        return csc;
    }

    public void setCsc(String csc) {
        this.csc = csc;
    }

    public String getPoleCode() {
        return poleCode;
    }

    public void setPoleCode(String poleCode) {
        this.poleCode = poleCode;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getConnectionCapacity() {
        return connectionCapacity;
    }

    public void setConnectionCapacity(String connectionCapacity) {
        this.connectionCapacity = connectionCapacity;
    }

    public float getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(float securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public String getInverterCapacity() {
        return inverterCapacity;
    }

    public void setInverterCapacity(String inverterCapacity) {
        this.inverterCapacity = inverterCapacity;
    }

    public String getPanelCapacity() {
        return panelCapacity;
    }

    public void setPanelCapacity(String panelCapacity) {
        this.panelCapacity = panelCapacity;
    }

    public String getGenerationDebitAccount() {
        return generationDebitAccount;
    }

    public void setGenerationDebitAccount(String generationDebitAccount) {
        this.generationDebitAccount = generationDebitAccount;
    }

    public String getTariffCategory() {
        return tariffCategory;
    }

    public void setTariffCategory(String tariffCategory) {
        this.tariffCategory = tariffCategory;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isSmsSubscribed() {
        return smsSubscribed;
    }

    public void setSmsSubscribed(boolean smsSubscribed) {
        this.smsSubscribed = smsSubscribed;
    }

    public String getSmsNumber() {
        return smsNumber;
    }

    public void setSmsNumber(String smsNumber) {
        this.smsNumber = smsNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public com.example.billprocesing.dto.PreviousBill getPreviousBill() {
        return previousBill;
    }

    public void setPreviousBill(com.example.billprocesing.dto.PreviousBill previousBill) {
        this.previousBill = previousBill;
    }

    public List<PreviousPayments> getPreviousPayments() {
        return previousPayments;
    }

    public void setPreviousPayments(List<PreviousPayments> previousPayments) {
        this.previousPayments = previousPayments;
    }

    public List<Notice> getNotice() {
        return notice;
    }

    public void setNotice(List<Notice> notice) {
        this.notice = notice;
    }
}
