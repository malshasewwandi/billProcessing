/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 11:55 AM
 * *******************************************************
 */
package com.example.billprocesing.dto;

public class BroughtForwards {
    private String type;
    private float units;
    private float amount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getUnits() {
        return units;
    }

    public void setUnits(float units) {
        this.units = units;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
