<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/1
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理</title>
</head>
<body>
<h1 class="text-center">书本管理</h1>
<hr/>
<div class="container table-responsive">
    <a href="book/bookadd"><button class="btn btn-default btn-warning pull-right" style="margin-bottom: 10px">添加信息</button></a>
    <table class="table  table-striped table-hover table-bordered">
        <tr style="background-color: #2aabd2">
            <%--<td>图书封面</td>--%>
            <td>书本名称</td>
            <td>作者</td>
            <td>所属种类</td>
            <td>出版社</td>
            <td>库存</td>
            <td>价格</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <%--<th><img src="/static/img/2.jpg" alt="${book.bookName}" class="img-thumbnail" style="height: 200px"/></th>--%>
                <th><a href="book/${book.id}/information">${book.bookName}</a></th>
                <th>${book.author}</th>
                <th>${book.bookType.typeName}</th>
                <th>${book.publisher.pubName}</th>
                <th>${book.repertorySize}</th>
                <th>${book.bookPrice}</th>
                <th><a href="book/${book.id}/delete">删除</a>&nbsp;<a href="book/${book.id}/update">修改</a></th>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
