package com.seapeng.BookSystem.model;

import java.util.Date;

/**
 * Created by zseapeng on 2016/9/4.
 */
public class BookAndSum {
    private int id;
    private Date recordDate;
    private String bookName;
    private long sum;

    public BookAndSum() {
    }

    public BookAndSum(int id, Date recordDate, String bookName, long sum) {
        this.id = id;
        this.recordDate = recordDate;
        this.bookName = bookName;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }
}
