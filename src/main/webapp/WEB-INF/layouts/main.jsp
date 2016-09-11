<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/8/31
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/css/bootstrap.css">
    <link rel="stylesheet" href="/static/css/nav.css">
    <title>查看<decorator:title/></title>
    <decorator:head/>
</head>
<body>
<nav class="navbar navbar-default navbar-static-top">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/web/sale">图书进存销系统</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li class="active"><a href="/web/sale"><span class="glyphicon glyphicon-shopping-cart">&nbsp;</span>销售管理</a></li>
                <li><a href="/web/inreo"><span class="glyphicon glyphicon-log-in">&nbsp;</span>入库管理</a></li>
                <li><a href="/web/book"><span class="glyphicon glyphicon-book">&nbsp;</span>书本管理</a></li>
                <li><a href="/web/type"><span class="glyphicon glyphicon-sound-dolby">&nbsp;</span>种类管理</a></li>
                <li><a href="/web/publisher"><span class="glyphicon glyphicon-home">&nbsp;</span>出版社管理</a></li>
            </ul>
            <form method="post" class="navbar-form navbar-right" role="search" action="/web/search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="输入出版社名或图书名进行查询" name="some"/>
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>

        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<decorator:body/>
<div class="container-fluid">
    <hr style="border: 1px solid #e0e0e0"/>
    <div class="text-center">
        <p><span>&copy;&nbsp;版权所有2015-2016</span></p>
        <p><span></span></p>
    </div>
</div>

<script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
</body>
</html>
