/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  wiremock-for-testing
 *  *  Created Date        -  2/26/2024 12:04 PM
 * *******************************************************
 */
package com.example.billprocesing.dto;

import java.util.Date;
import java.util.List;

public class Consumption {
    private String type;
    private String meterSerial;
    private String units;
    private String amount;
    private Date from;
    private Date to;
    private List<Slabs> slabs;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMeterSerial() {
        return meterSerial;
    }

    public void setMeterSerial(String meterSerial) {
        this.meterSerial = meterSerial;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public List<Slabs> getSlabs() {
        return slabs;
    }

    public void setSlabs(List<Slabs> slabs) {
        this.slabs = slabs;
    }
}
