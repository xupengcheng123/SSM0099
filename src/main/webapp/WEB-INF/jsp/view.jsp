<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>编辑用户 - 超市订单管理系统</title>

</head>
<body >
    <section >
        <header >
            <h1>超市订单管理系统</h1>
        </header>
    </section>
    <div>
        <form action="${pageContext.request.contextPath }/save.html" method="post">

            <table>
                <tr>
                    <td>用户编码</td>
                    <td>${user.userCode}</td>
                </tr>
                <tr>
                    <td>用户姓名</td>
                    <td>${user.userName}</td>
                </tr>
                <tr>
                    <td>用户电话</td>
                    <td>${user.phone}</td>
                </tr>
                <tr>
                    <td>用户地址</td>
                    <td>${user.address}</td>
                </tr>
                <tr>
                    <td>用户角色</td>
                    <td>${user.userRole}</td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
