<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/1
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>出版社管理</title>
</head>
<body>
<h1 class="text-center">出版社管理</h1>
<hr/>
<div class="container table-responsive">
    <a href="publisher/pubadd"><button class="btn btn-default btn-warning pull-right" style="margin-bottom: 10px">添加信息</button></a>
    <table class="table  table-striped table-hover table-bordered">
        <tr style="background-color: #2aabd2">
            <td>出版社名称</td>
            <td>联系电话</td>
            <td>联系人</td>
            <td>简介</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${publishers}" var="pub">
            <tr>
            <th>${pub.pubName}</th>
            <th>${pub.pubTel}</th>
            <th>${pub.pubLinkMan}</th>
            <th>${pub.pubIntro}</th>
            <th><a href="publisher/${pub.id}/delete">删除</a>&nbsp;<a href="publisher/${pub.id}/update">修改</a></th>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
