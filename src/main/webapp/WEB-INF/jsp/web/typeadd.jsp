<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/1
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加图书种类</title>
</head>
<body>
<div class="container text-center">
    <form:form role="form"  method="post" class="form-horizontal" modelAttribute="TBookType">
    <fieldset>
        <legend ><span class="glyphicon glyphicon-book"></span><span>&nbsp;&nbsp;图书种类信息</span></legend>
        <div class="form-group" id="usernameDiv">
            <label class="col-md-offset-2 col-md-3 text-right" >种类名称：</label>
            <div class="col-md-4">
                <form:input class="form-control" type="text"  placeholder="请输入图书种类名称" path="typeName"/>
            </div>
            <div class="col-md-2 text-left">
                <span><form:errors path="typeName"/> </span>
            </div>
        </div>
        <div class="form-group ">
            <label class="col-md-offset-2 col-md-3 text-right">简介  ：</label>
            <div class="col-md-4">
                <form:textarea class="form-control" path="typeIntro" placeholder="请输入图书种类简介"/>
            </div>
            <div class="col-md-2 text-left">
                <span><form:errors path="typeIntro"/> </span>
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
