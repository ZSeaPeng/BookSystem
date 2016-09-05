package com.seapeng.BookSystem.model;

import java.util.List;

public class TBookInRecord {
    private Integer id;

    private Integer bookIdFk;

    private Integer tInRecordIdFk;

    private Integer inSum;

    private List<TBook> bookList;


    public TBookInRecord(Integer id, Integer bookIdFk, Integer tInRecordIdFk, Integer inSum, List<TBook> bookList) {
        this.id = id;
        this.bookIdFk = bookIdFk;
        this.tInRecordIdFk = tInRecordIdFk;
        this.inSum = inSum;
        this.bookList = bookList;
    }

    public TBookInRecord() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookIdFk() {
        return bookIdFk;
    }

    public void setBookIdFk(Integer bookIdFk) {
        this.bookIdFk = bookIdFk;
    }

    public Integer gettInRecordIdFk() {
        return tInRecordIdFk;
    }

    public void settInRecordIdFk(Integer tInRecordIdFk) {
        this.tInRecordIdFk = tInRecordIdFk;
    }

    public Integer getInSum() {
        return inSum;
    }

    public void setInSum(Integer inSum) {
        this.inSum = inSum;
    }

    public List<TBook> getBookList() {
        return bookList;
    }

    public void setBookList(List<TBook> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "TBookInRecord{" +
                "id=" + id +
                ", bookIdFk=" + bookIdFk +
                ", tInRecordIdFk=" + tInRecordIdFk +
                ", inSum=" + inSum +
                ", bookList=" + bookList +
                '}';
    }
}