<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/1
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>入库管理</title>
</head>
<body>
<h1 class="text-center">入库管理</h1>
<hr/>
<div class="container table-responsive">
    <a href="inreo/inreoadd"><button class="btn btn-default btn-warning pull-right" style="margin-bottom: 10px">添加信息</button></a>
    <table class="table  table-striped table-hover table-bordered">
        <tr style="background-color: #2aabd2">
            <td>入库书本</td>
            <td>入库时间</td>
            <td>入库数量</td>
        </tr>
        <c:forEach items="${bookAndSumList}" var="bookAndSum">
            <tr>
                <th>${bookAndSum.bookName}</th>
                <th>${bookAndSum.recordDate.month+1}月
                    ${bookAndSum.recordDate.date}日
                    ${bookAndSum.recordDate.hours}时
                    ${bookAndSum.recordDate.minutes}分
                    ${bookAndSum.recordDate.seconds}</th>
                <th>${bookAndSum.sum}</th>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
