package com.seapeng.BookSystem.model;

import java.util.Date;
import java.util.List;

public class TSaleRecord {
    private Integer id;

    private Date recordDate;

    private List<TBookSaleRecord> bookSaleRecordList;

    private List<TBook> bookList;

    public TSaleRecord(Integer id, Date recordDate, List<TBookSaleRecord> bookSaleRecordList, List<TBook> bookList) {
        this.id = id;
        this.recordDate = recordDate;
        this.bookSaleRecordList = bookSaleRecordList;
        this.bookList = bookList;
    }

    public TSaleRecord() {
        super();
    }

    public List<TBookSaleRecord> getBookSaleRecordList() {
        return bookSaleRecordList;
    }

    public void setBookSaleRecordList(List<TBookSaleRecord> bookSaleRecordList) {
        this.bookSaleRecordList = bookSaleRecordList;
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

    public List<TBook> getBookList() {
        return bookList;
    }

    public void setBookList(List<TBook> bookList) {
        this.bookList = bookList;
    }



    @Override
    public String toString() {
        return "TSaleRecord{" +
                "id=" + id +
                ", recordDate=" + recordDate +
                ", bookSaleRecordList=" + bookSaleRecordList +
                ", bookList=" + bookList +
                '}';
    }
}