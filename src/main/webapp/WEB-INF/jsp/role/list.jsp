<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>系统登录 - 超市订单管理系统</title>

</head>
<body >
<section >
    <header >
        <h1>超市订单管理系统-<a href="${pageContext.request.contextPath }/main.html">首页</a></h1>
    </header>
</section>
<div>
    <a href="${pageContext.request.contextPath }/role/add.html">新增</a>
    <table>
        <tr>
            <td>用户编码</td>
            <td>用户姓名</td>
            <td>电话</td>
            <td>地址</td>
            <td>角色</td>
            <td>操作</td>
        </tr>
        <c:forEach var="role" items="${roleList}">
            <tr>
                <td>${role.roleCode}</td>
                <td>${role.roleName}</td>
                <td><a href="${pageContext.request.contextPath }/role/view.html?id=${role.id}">详细</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/role/update.html?id=${role.id}">修改</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/role/del.html?id=${role.id}">删除</a>&nbsp;&nbsp; </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
