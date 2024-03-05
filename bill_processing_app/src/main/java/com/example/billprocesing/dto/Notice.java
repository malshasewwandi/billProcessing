/*
 * ******************************************************
 *  *  Created by          -  malshas
 *  *  Project             -  complete
 *  *  Created Date        -  2/15/2024 10:38 PM
 * *******************************************************
 */
package com.example.billprocesing.dto;

import java.util.Date;

public class Notice {
    private Date dueDate;
    private String noticeNo;
    private float amount;

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(String noticeNo) {
        this.noticeNo = noticeNo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
