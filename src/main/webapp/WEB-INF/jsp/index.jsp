<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/8/18
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="/static/css/login.css">
    <title>登录</title>
</head>
<body>
<div class="container text-center">
    <form:form role="form"  method="post" class="form-horizontal" modelAttribute="TUser">
        <fieldset>
            <legend ><span class="glyphicon glyphicon-user"></span><span>&nbsp;&nbsp;用户登录</span></legend>
        <div class="form-group" id="usernameDiv">
            <label class="col-md-offset-2 col-md-3 text-right" for="username">用户名：</label>
            <div class="col-md-4">
                <form:input class="form-control" type="text" name="username" id="username" placeholder="请输入用户名" path="userName"/>
            </div>
            <div class="col-md-2 text-left">
                <span id="usernameSpan"></span>
            </div>
        </div>
            <div class="form-group " id="passwordDiv">
                <label class="col-md-offset-2 col-md-3 text-right" for="password">密码：</label>
                <div class="col-md-4">
                    <form:input class="form-control" type="text" name="password" id="password" placeholder="请输入密码" path="userPassword"/>
                </div>
                <div class="col-md-2 text-left">
                    <span id="passwordSpan"></span>
                </div>
            </div>
            <div class="form-group">
            <button class="btn btn-default btn-success" type="submit" id="submitBtn">登录</button>
            <button class="btn btn-default btn-warning" type="reset" value="重置">重置</button>
            </div>
        </fieldset>
    </form:form>

</div>

<script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/static/js/login.js"></script>
</body>
</html>
