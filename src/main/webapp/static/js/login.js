/**
 * Created by zseapeng on 2016/8/18.
 */
$(function () {
    $("#username").on("blur",function () {
        verifyUsername();
    });
    $("#password").on("blur",function () {
        verifyPassword();
    });
    $("#submitBtn").on("submit",function () {
        if (verifyUsername() && verifyPassword());
    })


});

function verifyUsername() {
    verifyInput("username","用户名");
}
function verifyPassword() {
    verifyInput("password","密码");
}
function verifyInput(id,val) {
    if ($("#"+id).val()==""){
        $("#"+id+"Div").attr("class","form-group has-error");
        $("#"+id+"Span").attr("class","text-danger").html(val+"不能为空");
        return false;
    }else {
        $("#"+id+"Div").attr("class","form-group has-success");
        $("#"+id+"Span").attr("class","text-danger").html("");
        return true;
    }
}