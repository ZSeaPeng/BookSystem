package com.seapeng.BookSystem.model;

import java.util.Date;
import java.util.List;

public class TInRecord {
    private Integer id;

    private Date recordDate;

    private List<TBookInRecord> bookInRecordList;

    private List<TBook> bookList;

    public TInRecord(Integer id, Date recordDate, List<TBookInRecord> bookInRecordList, List<TBook> bookList) {
        this.id = id;
        this.recordDate = recordDate;
        this.bookInRecordList = bookInRecordList;
        this.bookList = bookList;
    }

    public TInRecord() {
        super();
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

    public List<TBookInRecord> getBookInRecordList() {
        return bookInRecordList;
    }

    public void setBookInRecordList(List<TBookInRecord> bookInRecordList) {
        this.bookInRecordList = bookInRecordList;
    }

    public List<TBook> getBookList() {
        return bookList;
    }

    public void setBookList(List<TBook> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "TInRecord{" +
                "id=" + id +
                ", recordDate=" + recordDate +
                ", bookInRecordList=" + bookInRecordList +
                ", bookList=" + bookList +
                '}';
    }
}