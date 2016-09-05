<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/1
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>种类管理</title>
</head>
<body>
<h1 class="text-center">种类管理</h1>
<hr/>
<div class="container table-responsive">
    <a href="type/typeadd"><button class="btn btn-default btn-warning pull-right" style="margin-bottom: 10px">添加信息</button></a>
    <table class="table  table-striped table-hover table-bordered">
        <tr style="background-color: #2aabd2">
            <td>图书种类</td>
            <td>图书简介</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${typeList}" var="type">
            <tr>
                <th>${type.typeName}</th>
                <th>${type.typeIntro}</th>
                <th>
                    <c:if test="${type.typeStatus == 0}">
                    <a href="type/${type.id}/delete">删除</a>&nbsp;
                    </c:if>
                    <a href="type/${type.id}/update">修改</a>
                </th>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
