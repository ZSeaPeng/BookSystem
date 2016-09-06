package com.seapeng.BookSystem.model;

import java.util.List;

public class TBookSaleRecord {
    private Integer id;

    private Integer bookIdFk;

    private Integer tSaleRecordIdFk;

    private Integer tradeSum;

    private List<TBook> bookList;


    public TBookSaleRecord(Integer id, Integer bookIdFk, Integer tSaleRecordIdFk, Integer tradeSum, List<TBook> bookList) {
        this.id = id;
        this.bookIdFk = bookIdFk;
        this.tSaleRecordIdFk = tSaleRecordIdFk;
        this.tradeSum = tradeSum;
        this.bookList = bookList;
    }



    public TBookSaleRecord() {
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

    public Integer gettSaleRecordIdFk() {
        return tSaleRecordIdFk;
    }

    public void settSaleRecordIdFk(Integer tSaleRecordIdFk) {
        this.tSaleRecordIdFk = tSaleRecordIdFk;
    }

    public Integer getTradeSum() {
        return tradeSum;
    }

    public void setTradeSum(Integer tradeSum) {
        this.tradeSum = tradeSum;
    }

    public List<TBook> getBookList() {
        return bookList;
    }

    public void setBookList(List<TBook> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "TBookSaleRecord{" +
                "id=" + id +
                ", bookIdFk=" + bookIdFk +
                ", tSaleRecordIdFk=" + tSaleRecordIdFk +
                ", tradeSum=" + tradeSum +
                ", bookList=" + bookList +
                '}';
    }
}