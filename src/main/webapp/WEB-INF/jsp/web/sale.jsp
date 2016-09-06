<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/1
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>销售管理</title>
</head>
<body>
<h1 class="text-center">销售管理</h1>
<hr/>
<div class="container table-responsive">
    <a href="sale/saleadd"><button class="btn btn-default btn-warning pull-right" style="margin-bottom: 10px">添加信息</button></a>
    <table class="table  table-striped table-hover table-bordered">
        <tr style="background-color: #2aabd2">
            <td>购买书本</td>
            <td>总价</td>
            <td>交易日期</td>
            <td>总数量</td>
        </tr>
        <c:forEach items="${saleBookInfoList}" var="salbook">
            <tr>
                <th>${salbook.bookName}</th>
                <th>${salbook.sumPrice}</th>
                <th>${salbook.date.month+1}月
                        ${salbook.date.date}日
                        ${salbook.date.hours}时
                        ${salbook.date.minutes}分
                        ${salbook.date.seconds}</th>
                <th>${salbook.sum}</th>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
