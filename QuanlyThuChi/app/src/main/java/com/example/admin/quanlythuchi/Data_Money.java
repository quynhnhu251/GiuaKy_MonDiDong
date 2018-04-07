package com.example.admin.quanlythuchi;

import java.util.Date;

/**
 * Created by admin on 4/5/2018.
 */

public class Data_Money {

    private boolean form;
    private String content;
    private String date;
    private String amount;
    private String note;

    public Data_Money() {
    }

    public Data_Money(boolean form, String content, String date, String amount, String note) {

        this.form = form;
        this.content = content;
        this.date = date;
        this.amount = amount;
        this.note = note;
    }

    public boolean isForm() {
        return form;
    }

    public void setForm(boolean form) {
        this.form = form;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
