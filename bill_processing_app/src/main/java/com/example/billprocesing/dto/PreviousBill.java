/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  complete
 *  *  Created Date        -  2/15/2024 10:34 PM
 * *******************************************************
 */
package com.example.billprocesing.dto;

import java.util.Date;

public class PreviousBill {

    private float totalPayable;
    private Date date;
    private boolean isEstimated;

    public float getTotalPayable() {
        return totalPayable;
    }

    public void setTotalPayable(float totalPayable) {
        this.totalPayable = totalPayable;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isEstimated() {
        return isEstimated;
    }

    public void setEstimated(boolean estimated) {
        isEstimated = estimated;
    }
}
