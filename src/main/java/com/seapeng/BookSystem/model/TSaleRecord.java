package com.seapeng.BookSystem.model;

import java.util.Date;

public class TSaleRecord {
    private Integer id;

    private Date recordDate;

    private TBookSaleRecord bookSaleRecord;

    public TSaleRecord(Integer id, Date recordDate, TBookSaleRecord bookSaleRecord) {
        this.id = id;
        this.recordDate = recordDate;
        this.bookSaleRecord = bookSaleRecord;
    }

    public TSaleRecord() {
        super();
    }

    public TBookSaleRecord getBookSaleRecord() {
        return bookSaleRecord;
    }

    public void setBookSaleRecord(TBookSaleRecord bookSaleRecord) {
        this.bookSaleRecord = bookSaleRecord;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public String toString() {
        return "TSaleRecord{" +
                "id=" + id +
                ", recordDate=" + recordDate +
                ", bookSaleRecord=" + bookSaleRecord +
                '}';
    }
}