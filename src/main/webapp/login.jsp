<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>资费管理系统</title>
        <link type="text/css" rel="stylesheet" media="all" href="/styles/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="/styles/global_color.css" />s
        <script type="text/javascript" src="/js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript">

            function checkLoginInput(){
                var loginInput = "请输入用户名和密码";
                var code = $('input[name="code"]').val();
                var password = $('input[name="password"]').val();
                var validateCode = $('input[name="validateCode"]').val();
                if(code == null || code ==''){

                }if(password == null || password ==''){

                }if(validateCode == null || validateCode ==''){

                }

                return true;
            }
            $(function(){
                $("#login").click(function () {
                    var flag = checkLoginInput();
                    if(!flag){
                        return;
                    }
                    $.ajax({
                        url:"/admin/login",
                        type:"post",
                        data:$("#login_form").serialize(),
                        dataType:"json",
                        success:function (result) {
                            if(result.code){
                                //进入管理主页面
                            }
                        }

                    });
                });
            });

        </script>
    </head>
    <body class="index">
        <form action="/admin/login" method="post" id = "login_form">
            <div class="login_box">
                <table>
                    <tr>
                        <td class="login_info">账号：</td>
                        <td colspan="2"><input name="code" type="text" class="width150" /></td>
                        <%--<td class="login_error_info"><span class="required">30长度的字母、数字和下划线</span></td>--%>
                    </tr>
                    <tr>
                        <td class="login_info">密码：</td>
                        <td colspan="2"><input name="password" type="password" class="width150" /></td>
                        <%--<td><span class="required">30长度的字母、数字和下划线</span></td>--%>
                    </tr>
                    <tr>
                        <td class="login_info">验证码：</td>
                        <td class="width70"><input name="validateCode" type="text" class="width70" /></td>
                        <td><img src="images/valicode.jpg" alt="验证码" title="点击更换" /></td>
                        <%--<td><span class="required">验证码错误</span></td>            s  --%>
                    </tr>
                    <tr>
                        <td></td>
                        <td class="login_button" colspan="2">
                            <a href="javascript:void(0)"  id ="login"><img src="images/login_btn.png" /></a>
                        </td>
                        <%--<td><span class="required">用户名或密码错误，请重试</span></td>                --%>
                    </tr>
                </table>
            </div>
        </form>
    </body>
</html>
