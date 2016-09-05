package com.seapeng.BookSystem.model;

public class TBookSaleRecord {
    private Integer id;

    private Integer bookIdFk;

    private Integer tSaleRecordIdFk;

    private Integer tradeSum;

    private TBook book;

    private TSaleRecord saleRecord;

    public TBookSaleRecord(Integer id, Integer bookIdFk, Integer tSaleRecordIdFk, Integer tradeSum) {
        this.id = id;
        this.bookIdFk = bookIdFk;
        this.tSaleRecordIdFk = tSaleRecordIdFk;
        this.tradeSum = tradeSum;
    }

    public TBook getBook() {
        return book;
    }

    public void setBook(TBook book) {
        this.book = book;
    }

    public TSaleRecord getSaleRecord() {
        return saleRecord;
    }

    public void setSaleRecord(TSaleRecord saleRecord) {
        this.saleRecord = saleRecord;
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

    @Override
    public String toString() {
        return "TBookSaleRecord{" +
                "id=" + id +
                ", bookIdFk=" + bookIdFk +
                ", tSaleRecordIdFk=" + tSaleRecordIdFk +
                ", tradeSum=" + tradeSum +
                ", book=" + book +
                ", saleRecord=" + saleRecord +
                '}';
    }
}