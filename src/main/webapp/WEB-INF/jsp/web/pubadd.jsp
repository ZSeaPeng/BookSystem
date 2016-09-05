<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/1
  Time: 16:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>添加出版社</title>
</head>
<body>
<div class="container text-center">
    <form:form role="form"  method="post" class="form-horizontal" modelAttribute="TPublisher">
    <fieldset>
        <legend ><span class="glyphicon glyphicon-home"></span><span>&nbsp;&nbsp;出版社信息</span></legend>
        <div class="form-group" id="usernameDiv">
            <label class="col-md-offset-2 col-md-3 text-right" >出版社名称：</label>
            <div class="col-md-4">
                <form:input class="form-control" type="text"  placeholder="请输入出版社名称" path="pubName"/>
            </div>
            <div class="col-md-2 text-left">
                <span><form:errors path="pubName"/> </span>
            </div>
        </div>
        <div class="form-group ">
            <label class="col-md-offset-2 col-md-3 text-right" >联系人电话  ：</label>
            <div class="col-md-4">
                <form:input class="form-control" type="text"  placeholder="请输入联系人电话" path="pubTel"/>
            </div>
            <div class="col-md-2 text-left">
                <span><form:errors path="pubTel"/> </span>
            </div>
        </div>
        <div class="form-group ">
            <label class="col-md-offset-2 col-md-3 text-right" >联系人姓名  ：</label>
            <div class="col-md-4">
                <form:input class="form-control" type="text"  placeholder="请输入联系人姓名" path="pubLinkMan"/>
            </div>
            <div class="col-md-2 text-left">
                <span ><form:errors path="pubLinkMan"/> </span>
            </div>
        </div>
        <div class="form-group ">
            <label class="col-md-offset-2 col-md-3 text-right">简介  ：</label>
            <div class="col-md-4">
                <%--<form:input class="form-control" type="text" placeholder="请输入出版社简介" path="pubIntro"/>--%>
                <form:textarea class="form-control" rows="5" path="pubIntro" placeholder="请输入出版社简介"/>
            </div>
            <div class="col-md-2 text-left">
                <span><form:errors path="pubIntro"/> </span>
            </div>
        </div>
        <div class="form-group">
            <button class="btn btn-default btn-success" type="submit">提交</button>
            <button class="btn btn-default btn-warning" type="reset" style="margin-left: 30px">重置</button>
        </div>
    </fieldset>
    </form:form>

</body>
</html>
