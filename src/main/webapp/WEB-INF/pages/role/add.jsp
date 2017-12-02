<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>资费管理系统</title>
    <%@ include file="/base.jsp" %>
    <script language="javascript" type="text/javascript">
        //保存成功的提示消息
        function showResult() {
            $("div .validate_msg_medium").html("");
            $("div .validate_msg_tiny").html("");

            var reg = /^[a-zA-Z_0-9\u4e00-\u9fa5]+$/;
            var name = $("#name").val();

            var moduleIds = "";
            $('input[name="moduleIds"]:checked').each(function () {
                moduleIds += $(this).val() + ",";
            });
            if (name == null || name == "" || name == undefined || !reg.test(name) || name.length > 20) {
                $("div .validate_msg_medium").html("不能为空，且为20长度的字母、数字和汉字的组合");
                return;
            }
            if (moduleIds == "" || moduleIds == null || moduleIds == undefined) {
                $("div .validate_msg_tiny").html("至少选择一个权限");
                return;
            }
            $.ajax({
                url: "/expense/role/save",
                type: "post",
                data: $("#addRole_form").serialize(),
                dataType: "json",
                success: function (result) {
                    if (result.code == 0) {
                        $("#save_result_info").removeClass("save_fail");
                        $("#save_result_info").addClass("save_success");

                    } else {
                        $("#save_result_info").removeClass("save_success");
                        $("#save_result_info").addClass("save_fail");
                    }
                    $("#save_result_info").html(result.msg);
                    showResultDiv(true);
                    window.setTimeout("showResultDiv(false);", 3000);
                },
                error: function () {
                    $("#save_result_info").removeClass("save_success");
                    $("#save_result_info").addClass("save_fail");
                    $("#save_result_info").html("系统异常");
                    showResultDiv(true);
                    window.setTimeout("showResultDiv(false);", 3000);
                }
            });

        }
        function showResultDiv(flag) {
            var divResult = document.getElementById("save_result_info");
            if (flag)
                divResult.style.display = "block";
            else
                divResult.style.display = "none";
        }
    </script>
</head>
<body>
<!--Logo区域开始-->
<div id="header">
    <img src="../images/logo.png" alt="logo" class="left"/>
    <a href="#">[退出]</a>
</div>
<!--Logo区域结束-->
<!--导航区域开始-->
<div id="navi">
    <ul id="menu">
        <li><a href="../index.html" class="index_off"></a></li>
        <li><a href="/expense/role/list" class="role_on"></a></li>
        <li><a href="/expense/admin/list" class="admin_off"></a></li>
        <li><a href="../fee/fee_list.html" class="fee_off"></a></li>
        <li><a href="../account/account_list.html" class="account_off"></a></li>
        <li><a href="../service/service_list.html" class="service_off"></a></li>
        <li><a href="../bill/bill_list.html" class="bill_off"></a></li>
        <li><a href="../report/report_list.html" class="report_off"></a></li>
        <li><a href="../user/user_info.html" class="information_off"></a></li>
        <li><a href="../user/user_modi_pwd.html" class="password_off"></a></li>
    </ul>
</div>
<!--导航区域结束-->
<!--主要区域开始-->
<div id="main">
    <!--保存操作后的提示信息：成功或者失败-->
    <div id="save_result_info" class="save_success"></div><!--保存失败，角色名称重复！-->
    <form action="" method="post" class="main_form" id="addRole_form">
        <div class="text_info clearfix"><span>角色名称：</span></div>
        <div class="input_info">
            <input type="text" name="name" id="name" class="width200"/>
            <span class="required">*</span>
            <div class="validate_msg_medium"></div>
        </div>
        <div class="text_info clearfix"><span>设置权限：</span></div>
        <div class="input_info_high">
            <div class="input_info_scroll">
                <ul>
                    <c:forEach items="${moduleList}" var="moduleInfo">
                        <li><input type="checkbox" id="${moduleInfo.id} " name="moduleIds"
                                   value="${moduleInfo.id}"/>${moduleInfo.name}</li>
                    </c:forEach>
                </ul>
            </div>
            <span class="required">*</span>
            <div class="validate_msg_tiny"></div>
        </div>
        <div class="button_info clearfix">
            <input type="button" value="保存" class="btn_save" onclick="showResult();"/>
            <input type="button" value="返回" class="btn_save" onclick="history.go(-1)"/>
        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <span>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</span>
    <br/>
    <span>版权所有(C)加拿大达内IT培训集团公司 </span>
</div>
</body>
</html>
