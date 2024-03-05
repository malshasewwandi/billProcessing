/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 3:34 PM
 * *******************************************************
 */
package com.example.billprocesing.dto;

public class InvoicedBill {

    private int pathwaySequenceNo;
    private String billId;
    private String billingCycle;
    private String branch;
    private String csc;
    private String transformerCode;
    private String poleCode;
    private String accountNo;
    private String connectionCapacity;
    private String inverterCapacity;
    private String panelCapacity;
    private String generationDebitAccount;
    private String customerName;
    private String address;
    private String smsNumber;
    private String emailAddress;
    private String tariffCategory; // TODO enum
    private float securityDeposit;
    private boolean smsSubscribed;

    private Bill bill;

    public int getPathwaySequenceNo() {
        return pathwaySequenceNo;
    }

    public void setPathwaySequenceNo(int pathwaySequenceNo) {
        this.pathwaySequenceNo = pathwaySequenceNo;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
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

    public String getTransformerCode() {
        return transformerCode;
    }

    public void setTransformerCode(String transformerCode) {
        this.transformerCode = transformerCode;
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

    public String getTariffCategory() {
        return tariffCategory;
    }

    public void setTariffCategory(String tariffCategory) {
        this.tariffCategory = tariffCategory;
    }

    public float getSecurityDeposit() {
        return securityDeposit;
    }

    public void setSecurityDeposit(float securityDeposit) {
        this.securityDeposit = securityDeposit;
    }

    public boolean isSmsSubscribed() {
        return smsSubscribed;
    }

    public void setSmsSubscribed(boolean smsSubscribed) {
        this.smsSubscribed = smsSubscribed;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
