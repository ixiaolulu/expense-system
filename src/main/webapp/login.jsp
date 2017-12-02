<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<%--%>
    <%--String path = request.getRequestURI();--%>
    <%--String basePath = request.getScheme() + "://"--%>
    <%--+ request.getServerName() + ":" + request.getServerPort()--%>
    <%--+ path;--%>
    <%--%>--%>
    <%--<base href="<%=basePath%>">--%>
    <%@ include file="/base.jsp" %>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>资费管理系统</title>
    <link type="text/css" rel="stylesheet" media="all" href="/styles/global.css"/>
    <link type="text/css" rel="stylesheet" media="all" href="/styles/global_color.css"/>
    <script type="text/javascript">

        function checkLoginInput() {
            var regex_error = "30长度的字母、数字和下划线";
            var code = $('input[name="code"]').val();
            var password = $('input[name="password"]').val();
            var validateCode = $('input[name="validateCode"]').val();
            var reg = /^[a-zA-Z_0-9]+$/;
            if (code == null || code == '') {
                $("#code_error").html("账号不能为空");
                return false;
            } else if (code.length > 30 || !reg.test(code)) {
                $("#code_error").html(regex_error);
                return false;
            }
            if (password == null || password == '') {
                $("#password_error").html("密码不能为空");
                return false;
            } else if (password.length > 30 || !reg.test(password)) {
                $("#code_error").html(regex_error);
                return false;
            }

            if (validateCode == null || validateCode == '') {
                $("#validateCode_error").html("验证码不能为空");
                return false;
            }
            return true;
        };

        function clearErrorMsg() {
            $("#code_error").html("");
            $("#password_error").html("");
            $("#validateCode_error").html("");
            $("#codeOrPwd_error").html("");
        };

        //登录
        $(function () {
            $("#login").click(function () {
                clearErrorMsg();
                var flag = checkLoginInput();
                if (!flag) {
                    return;
                }
                $("#login_form").submit();
//                    $.ajax({
//                        url:"/admin/login",
//                        type:"post",
//                        data:$("#login_form").serialize(),
//                        dataType:"json",
//                        success:function (result) {
//                            if(result.code == 0){
//                                //进入管理主页面
//                                window.location.href = "/admin/loginSuccess";
//                            }else{
//                                $("#codeOrPwd_error").html(result.msg);
//                            }
//                        }
//                    });
            });
        });

    </script>
</head>
<body class="index">
<form action="/expense/admin/login" method="post" id="login_form">
    <div class="login_box">
        <table>
            <tr>
                <td class="login_info">账号：</td>
                <td colspan="2"><input name="code" type="text" class="width150"/></td>
                <td><span id="code_error" class="required">${code_error}</span></td>
            </tr>
            <tr>
                <td class="login_info">密码：</td>
                <td colspan="2"><input name="password" type="password" class="width150"/></td>
                <td><span class="required" id="password_error">${password_error}</span></td>
            </tr>
            <tr>
                <td class="login_info">验证码：</td>
                <td class="width70"><input name="validateCode" type="text" class="width70"/></td>
                <td><img src="images/valicode.jpg" alt="验证码" title="点击更换"/></td>
                <td><span id="validateCode_error" class="required">${validateCode_error}</span></td>
            </tr>
            <tr>
                <td></td>
                <td class="login_button" colspan="2">
                    <a href="javascript:void(0)" id="login"><img src="images/login_btn.png"/></a>
                </td>
                <td><span class="required" id="codeOrPwd_error">${codeOrPwd_error}</span></td>
            </tr>
        </table>
    </div>
</form>
</body>
</html>
