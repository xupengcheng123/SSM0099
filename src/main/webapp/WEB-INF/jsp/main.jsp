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
            <h1>超市订单管理系统</h1>
        </header>
		<section>
			歡迎:${userLogin.userName}
		</section>
    </section>
    <div>
        <a href="${pageContext.request.contextPath }/add.html">新增</a>
        <table>
            <tr>
                <td>用户编码</td>
                <td>用户姓名</td>
                <td>电话</td>
                <td>地址</td>
                <td>角色</td>
                <td>操作</td>
            </tr>
            <c:forEach var="user" items="${userList}">
                <tr>
                    <td>${user.userCode}</td>
                    <td>${user.userName}</td>
                    <td>${user.phone}</td>
                    <td>${user.address}</td>
                    <td>${user.userRole}</td>
                    <td><a href="${pageContext.request.contextPath }/view.html?id=${user.id}">详细</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/update.html?id=${user.id}">修改</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/del.html?id=${user.id}">删除</a>&nbsp;&nbsp; </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
