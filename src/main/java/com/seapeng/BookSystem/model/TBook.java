package com.seapeng.BookSystem.model;

public class TBook {
    private Integer id;

    private String bookName;

    private String bookIntro;

    private Double bookPrice;

    private Integer typeIdFk;

    private Integer pubIdFk;

    private String imageUrl;

    private String author;

    private Long repertorySize;

    private TBookType bookType;

    private TPublisher publisher;

    public TBook(Integer id, String bookName, String bookIntro, Double bookPrice, Integer typeIdFk, Integer pubIdFk, String imageUrl, String author, Long repertorySize) {
        this.id = id;
        this.bookName = bookName;
        this.bookIntro = bookIntro;
        this.bookPrice = bookPrice;
        this.typeIdFk = typeIdFk;
        this.pubIdFk = pubIdFk;
        this.imageUrl = imageUrl;
        this.author = author;
        this.repertorySize = repertorySize;
    }

    public TBook() {
        super();
    }

    public TBookType getBookType() {
        return bookType;
    }

    public void setBookType(TBookType bookType) {
        this.bookType = bookType;
    }

    public TPublisher getPublisher() {
        return publisher;
    }

    public void setPublisher(TPublisher publisher) {
        this.publisher = publisher;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public String getBookIntro() {
        return bookIntro;
    }

    public void setBookIntro(String bookIntro) {
        this.bookIntro = bookIntro == null ? null : bookIntro.trim();
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getTypeIdFk() {
        return typeIdFk;
    }

    public void setTypeIdFk(Integer typeIdFk) {
        this.typeIdFk = typeIdFk;
    }

    public Integer getPubIdFk() {
        return pubIdFk;
    }

    public void setPubIdFk(Integer pubIdFk) {
        this.pubIdFk = pubIdFk;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Long getRepertorySize() {
        return repertorySize;
    }

    public void setRepertorySize(Long repertorySize) {
        this.repertorySize = repertorySize;
    }

    @Override
    public String toString() {
        return "TBook{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookIntro='" + bookIntro + '\'' +
                ", bookPrice=" + bookPrice +
                ", typeIdFk=" + typeIdFk +
                ", pubIdFk=" + pubIdFk +
                ", imageUrl='" + imageUrl + '\'' +
                ", author='" + author + '\'' +
                ", repertorySize=" + repertorySize +
                ", bookType=" + bookType +
                ", publisher=" + publisher +
                '}';
    }
}