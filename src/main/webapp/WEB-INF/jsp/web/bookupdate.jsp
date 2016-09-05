<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/3
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息</title>
</head>
<body>
<div class="container">
    <form:form role="form"  method="post" class="form-horizontal" modelAttribute="book" enctype="multipart/form-data">

        <fieldset>
            <legend class="text-center"><span class="glyphicon glyphicon-home"></span><span>&nbsp;&nbsp;图书信息</span></legend>
            <div class="col-md-4 form-group">
                <img <c:choose>
                <c:when test="${book.imageUrl != null}"> src="${book.imageUrl}"</c:when>
                <c:otherwise> src="/static/img/0.JPG"</c:otherwise>
                </c:choose> alt="${book.bookName}封面" class="img-thumbnail img-responsive">
                <input type="file" name="multipartFile"/>
                <p class="help-block">请选择图书封面</p>
            </div>
            <div class="col-md-5">
            <div class="form-group" id="usernameDiv">
                <label class="col-md-offset-2 col-md-3 text-right" >图书名称：</label>
                <div class="col-md-6">
                    <form:input class="form-control" type="text"  placeholder="请输入图书名称" path="bookName"/>
                </div>
                <div class="col-md-2 text-left">
                    <span><form:errors path="bookName"/> </span>
                </div>
            </div>
            <div class="form-group ">
                <label class="col-md-offset-2 col-md-3 text-right" >图书作者  ：</label>
                <div class="col-md-6">
                    <form:input class="form-control" type="text"  placeholder="请输入图书作者" path="author"/>
                </div>
                <div class="col-md-2 text-left">
                    <span><form:errors path="author"/> </span>
                </div>
            </div>
            <div class="form-group ">
                <label class="col-md-offset-2 col-md-3 text-right" >图书种类  ：</label>
                <div class="col-md-6">
                    <form:select path="bookType.id" cssClass="form-control">
                        <c:forEach items="${bookTypeList}" var="type">
                            <form:option value="${type.id}">${type.typeName}</form:option>
                        </c:forEach>
                    </form:select>
                </div>
                <div class="col-md-2 text-left">
                    <span ><form:errors path="bookType.id"/> </span>
                </div>
            </div>

                <div class="form-group ">
                    <label class="col-md-offset-2 col-md-3 text-right" >出版社&nbsp;&nbsp;&nbsp;&nbsp;：</label>
                    <div class="col-md-6">
                        <form:select path="publisher.id" cssClass="form-control">
                            <c:forEach items="${publisherList}" var="pub">
                                <form:option value="${pub.id}">${pub.pubName}</form:option>
                            </c:forEach>
                        </form:select>
                    </div>
                    <div class="col-md-2 text-left">
                        <span ><form:errors path="publisher.id"/> </span>
                    </div>
                </div>
            <div class="form-group ">
                <label class="col-md-offset-2 col-md-3 text-right" >图书价格  ：</label>
                <div class="col-md-6">
                    <form:input class="form-control" type="int"  placeholder="请输入图书价格" path="bookPrice"/>
                </div>
                <div class="col-md-2 text-left">
                    <span ><form:errors path="bookPrice"/> </span>
                </div>
            </div>
            <div class="form-group ">
                <label class="col-md-offset-2 col-md-3 text-right">图书简介  ：</label>
                <div class="col-md-6">
                        <%--<form:input class="form-control" type="text" placeholder="请输入出版社简介" path="pubIntro"/>--%>
                    <form:textarea cssClass="form-control " rows="5" path="bookIntro" placeholder="请输入图书简介"/>
                </div>
                <div class="col-md-2 text-left">
                    <span><form:errors path="bookIntro"/> </span>
                </div>
            </div>
            <div class="col-sm-offset-4 col-md-8">
                <button class="btn btn-default btn-success" type="submit">提交</button>
                <button class="btn btn-default btn-warning pull-right" type="reset">重置</button>
            </div>
            </div>
        </fieldset>
    </form:form>
</div>
</body>
</html>
