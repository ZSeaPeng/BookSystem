package com.seapeng.BookSystem.model;

import java.util.Date;

/**
 * Created by zseapeng on 2016/9/5.
 */
public class SaleBookInfo {
    private int id;
    private String bookName;
    private double sumPrice;
    private Date date;
    private int sum;

    public SaleBookInfo() {
    }

    public SaleBookInfo(int id, String bookName, double sumPrice, Date date, int sum) {
        this.id = id;
        this.bookName = bookName;
        this.sumPrice = sumPrice;
        this.date = date;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(double sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "SaleBookInfo{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", sumPrice=" + sumPrice +
                ", date=" + date +
                ", sum=" + sum +
                '}';
    }
}
