<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: zseapeng
  Date: 2016/9/5
  Time: 20:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加销售信息</title>
</head>
<body>
<div class="container">
    <form:form role="form"  method="post" class="form-horizontal" modelAttribute="TBook">

        <fieldset>
            <legend class="text-center"><span class="glyphicon glyphicon-home"></span><span>&nbsp;&nbsp;添加销售信息</span></legend>
            <div class="form-group ">
                <label class="col-md-offset-2 col-md-3 text-right" >图书种类  ：</label>
                <div class="col-md-3">
                    <form:select path="id" cssClass="form-control" id="jsp_book_id">
                        <c:forEach items="${bookList}" var="book">
                            <form:option value="${book.id}">${book.bookName}</form:option>
                        </c:forEach>
                    </form:select>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-offset-2 col-md-3 text-right" >图书数量  ：</label>
                <div class="col-md-3">
                    <input class="form-control" type="number"  placeholder="请输入图书数量" name="size"/>
                </div>
            </div>
            <div class="form-group ">
                <label class="col-md-offset-2 col-md-3 text-right">单价  ：</label>
                <div class="col-md-3">
                        <%--<form:input class="form-control" type="text" placeholder="请输入出版社简介" path="pubIntro"/>--%>
                    <span id="showprice"></span>
                </div>
                </div>
            <div class="form-group ">
                <label class="col-md-offset-2 col-md-3 text-right">库存  ：</label>
                <div class="col-md-3">
                        <%--<form:input class="form-control" type="text" placeholder="请输入出版社简介" path="pubIntro"/>--%>
                    <span id="showsize"></span>

                </div>
            </div>
            <div class="col-sm-offset-4 col-md-4">
                <button class="btn btn-default btn-success" type="submit">添加</button>
                <button class="btn btn-default btn-warning pull-right" type="reset">重置</button>
            </div>
        </fieldset>
    </form:form>

    <table class="table  table-striped table-hover table-bordered">
        <tr style="background-color: #2aabd2">
            <td>书名</td>
            <td>单价</td>
            <td>数量</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${booklisttemp}" var="temp">
            <tr>
                <th>${temp[0]}</th>
                <th>${temp[1]}</th>
                <th>${temp[2]}</th>
                <th><a href="remove?temp=${temp[4]}">删除</a></th>
            </tr>
        </c:forEach>
    </table>
    <div class="col-md-offset-4 col-md-">
        <a href="out"><button class="btn btn-warning btn-default">出售</button></a>
        <a href="clear"><button class="btn btn-warning btn-default pull-right">清空</button></a>
    </div>
</div>
<script type="text/javascript" src="/static/js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="/static/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#jsp_book_id").on("blur",function () {
            test();
        })
    });
    function test() {
        var jsp_book = $("#jsp_book_id").val();
//        var jsonhttp = new XMLHttpRequest();
//        jsonhttp.onreadystatechange = function () {
//            if (jsonhttp.readyState == 4 && jsonhttp.status == 200){
//                document.getElementById("showsize").innerHTML = jsonhttp.responseText;
//            }
//        };
//        jsonhttp.open("GET","/web/inreo/get?id="+jsp_book,true);
//        jsonhttp.send();
        $.getJSON("/web/inreo/get?id="+jsp_book,function (json) {
            document.getElementById("showsize").innerHTML = json.repertorySize;
            document.getElementById("showprice").innerHTML = json.bookPrice;
        })
    }


</script>
</body>
</html>
