<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/3
  Time: 10:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书详情</title>
</head>
<body>
<div class="container">
    <div class="col-md-4">
        <img<c:choose>
        <c:when test="${book.imageUrl != null}"> src="${book.imageUrl}"</c:when>
        <c:otherwise> src="/static/img/0.JPG"</c:otherwise>
        </c:choose> alt="${book.bookName}封面" class="img-thumbnail img-responsive">
    </div>
    <div class="col-md-4" style="margin-top: 10px">
        <p><label>图书名称：</label><span>${book.bookName}</span></p>
        <p><label>图书作者：</label><span>${book.author}</span></p>
        <p><label>图书种类：</label><span>${book.bookType.typeName}</span></p>
        <p><label>图书出版社：</label><span>${book.publisher.pubName}</span></p>
        <p><label>图书价格：</label><span>${book.bookPrice}</span></p>
        <p><label>图书简介：</label><span>${book.bookIntro}</span></p>
        <a href="update"><button class="btn btn-default btn-warning">修改内容</button></a>
    </div>
</div>
</body>
</html>
