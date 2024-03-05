/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 11:54 AM
 * *******************************************************
 */
package com.example.billprocesing.dto;

import java.util.List;

public class Bill {
    private int noOfDays;
    private float totalPayable;
    private List<BroughtForwards> broughtForwards;
    private List<CarryForwards> carryForwards;
    private BillBreakDown billBreakDown;
    private PreviousBill previousBill;
    private PreviousPayments previousPayments;
    private Notice notice;

    public PreviousBill getPreviousBill() {
        return previousBill;
    }

    public void setPreviousBill(PreviousBill previousBill) {
        this.previousBill = previousBill;
    }

    public PreviousPayments getPreviousPayments() {
        return previousPayments;
    }

    public void setPreviousPayments(PreviousPayments previousPayments) {
        this.previousPayments = previousPayments;
    }

    public Notice getNotice() {
        return notice;
    }

    public void setNotice(Notice notice) {
        this.notice = notice;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public float getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(float totalPayable) {
        this.totalPayable = totalPayable;
    }

    public List<BroughtForwards> getBroughtForwards() {
        return broughtForwards;
    }

    public void setBroughtForwards(List<BroughtForwards> broughtForwards) {
        this.broughtForwards = broughtForwards;
    }

    public List<CarryForwards> getCarryForwards() {
        return carryForwards;
    }

    public void setCarryForwards(List<CarryForwards> carryForwards) {
        this.carryForwards = carryForwards;
    }

    public BillBreakDown getBillBreakDown() {
        return billBreakDown;
    }

    public void setBillBreakDown(BillBreakDown billBreakDown) {
        this.billBreakDown = billBreakDown;
    }
}
