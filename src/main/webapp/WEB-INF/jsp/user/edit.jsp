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
        <form action="${pageContext.request.contextPath }/user/save.html" method="post">
            <input type="hidden" name="id" value="${user.id}">
            <table>
                <tr>
                    <td>用户编码</td>
                    <td><input name="userCode" value="${user.userCode}"></td>
                </tr>
                <tr>
                    <td>用户姓名</td>
                    <td><input name="userName" value="${user.userName}"></td>
                </tr>
                <tr>
                    <td>用户电话</td>
                    <td><input name="phone" value="${user.phone}"></td>
                </tr>
                <tr>
                    <td>用户地址</td>
                    <td><input name="address" value="${user.address}"></td>
                </tr>
                <tr>
                    <td>用户角色</td>
                    <td><input name="userRole" value="${user.userRole}"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="保存"/> </td>

                </tr>
            </table>
        </form>
    </div>
</body>
</html>
