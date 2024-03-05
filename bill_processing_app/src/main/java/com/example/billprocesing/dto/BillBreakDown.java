/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 11:58 AM
 * *******************************************************
 */
package com.example.billprocesing.dto;

import java.util.List;

public class BillBreakDown {

    private List<Consumption> consumptions;
    private List<Generation> generation;
    private List<FixedCharges> fixedCharges;
    private List<Taxes> taxes;
    private List<Deductions> deductions;
    private List<Adjustments> adjustments;
    private double thisBillAmount;

    public List<Consumption> getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(List<Consumption> consumptions) {
        this.consumptions = consumptions;
    }

    public List<Generation> getGeneration() {
        return generation;
    }

    public void setGeneration(List<Generation> generation) {
        this.generation = generation;
    }

    public List<FixedCharges> getFixedCharges() {
        return fixedCharges;
    }

    public void setFixedCharges(List<FixedCharges> fixedCharges) {
        this.fixedCharges = fixedCharges;
    }

    public List<Taxes> getTaxes() {
        return taxes;
    }

    public void setTaxes(List<Taxes> taxes) {
        this.taxes = taxes;
    }

    public List<Deductions> getDeductions() {
        return deductions;
    }

    public void setDeductions(List<Deductions> deductions) {
        this.deductions = deductions;
    }

    public List<Adjustments> getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(List<Adjustments> adjustments) {
        this.adjustments = adjustments;
    }

    public double getThisBillAmount() {
        return thisBillAmount;
    }

    public void setThisBillAmount(double thisBillAmount) {
        this.thisBillAmount = thisBillAmount;
    }
}
