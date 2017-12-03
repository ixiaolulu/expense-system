<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>资费管理系统</title>
    <%@ include file="/base.jsp" %>
    <script language="javascript" type="text/javascript">
        function deleteRole() {
            var r = window.confirm("确定要删除此角色吗？");
            document.getElementById("operate_result_info").style.display = "block";
        }

        //查询
        $(function () {
            //分页插件，默认10条
            var totalCnt = ${pagination.totalCnt};
            var totalPage = Math.ceil(totalCnt / 10);
            var page = $("#page").val();
            $("#pages").pagination({
                currentPage: 1,
                totalPage: totalPage,
                isShow: true,
                count: 5,
                homePageText: "首页",
                endPageText: "尾页",
                prevPageText: "上一页",
                nextPageText: "下一页",
                callback: function (current) {
                    //获取第几页
                    $("#page").val(current);
                    //清空<tbody/>
                    $('#datalist > tbody tr').remove();
                    //发送ajax
                    $.ajax({
                        url: "/expense/role/queryList",
                        type: "post",
                        data: $("#queryList_form").serialize(),
                        dataType: "json",
                        success: function (result) {
                            var roleInfo1 = result.data.dataList[0];
                            for (var i = 0; i < result.data.dataList.length; i++) {
                                var roleInfo = result.data.dataList[i];
                                var tr_ = "<tr>" +
                                    "<td>" + roleInfo.id + "</td>" +
                                    "<td>" + roleInfo.name + "</td>" +
                                    "<td>" + roleInfo.moduleNameStr + "</td>" +
                                    "<td>" + roleInfo.timeCreated + "</td>" +
                                    "<td>" +
                                    " <input type='button' value='修改' class='btn_modify' onclick='location.href='role_modi.html;'/>" +
                                    "<input type='button' value='删除' class='btn_delete' onclick='deleteRole();'/>" +
                                    " </td>" +
                                    " /tr>";
                                $("#datalist tbody").append(tr_);
                            }
                        }

                    });

                }
            });


        });
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
    <form id="queryList_form" action="" method="post">
        <!--查询-->
        <div class="search_add">
            <input type="hidden" name="page" id="page" value="1"/>
            <input type="hidden" name="rowsPerPage" id="rowsPerPage" value="10"/>
            <input type="button" value="增加" class="btn_add" onclick="location.href='/expense/role/add';"/>
        </div>
        <!--删除的操作提示-->
        <div id="operate_result_info" class="operate_success">
            <img src="../images/close.png" onclick="this.parentNode.style.display='none';"/>
            删除成功！
        </div> <!--删除错误！该角色被使用，不能删除。-->
        <!--数据区域：用表格展示数据-->
        <div id="data">
            <table id="datalist">
                <thead>
                <tr>
                    <th>角色 ID</th>
                    <th>角色名称</th>
                    <th class="width500">拥有的权限</th>
                    <th>创建时间</th>
                    <th class="td_modi"></th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${pagination.dataList}" var="roleInfo" varStatus="status">
                    <tr>
                        <td>${roleInfo.id}</td>
                        <td>${roleInfo.name}</td>
                        <td>${roleInfo.moduleNameStr}</td>
                        <td>${roleInfo.timeCreated}</td>
                        <td>
                            <input type="button" value="修改" class="btn_modify"
                                   onclick="location.href='role_modi.html';"/>
                            <input type="button" value="删除" class="btn_delete" onclick="deleteRole();"/>
                        </td>
                    </tr>

                </c:forEach>
                </tbody>
            </table>
        </div>
        <!--分页-->
        <div id="pages">

        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">
    <p>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</p>
    <p>版权所有(C)加拿大达内IT培训集团公司 </p>
</div>
</body>
</html>
