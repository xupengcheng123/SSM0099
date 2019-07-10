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
        <form action="${pageContext.request.contextPath }/role/save.html" method="post">
            <input type="hidden" name="id" value="${role.id}">
            <table>
                <tr>
                    <td>用户编码</td>
                    <td><input name="roleCode" value="${role.roleCode}"></td>
                </tr>
                <tr>
                    <td>用户姓名</td>
                    <td><input name="roleName" value="${role.roleName}"></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="保存"/> </td>

                </tr>
            </table>
        </form>
    </div>
</body>
</html>
