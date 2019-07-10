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
        <h1>超市订单管理系统-<a href="${pageContext.request.contextPath }/main.html">首页</a> </h1>
    </header>
    <section>
        歡迎:${addressLogin.addressName}
    </section>
</section>
<div>
    <a href="${pageContext.request.contextPath }/address/add.html">新增</a>
    <table>
        <tr>
            <td>联系人姓名</td>
            <td>收货地址明细</td>
            <td>邮编</td>
            <td>联系人电话</td>
            <td>操作</td>
        </tr>
        <c:forEach var="address" items="${addressList}">
            <tr>
                <td>${address.contact}</td>
                <td>${address.addressDesc}</td>
                <td>${address.postCode}</td>
                <td>${address.tel}</td>
                <td><a href="${pageContext.request.contextPath }/address/view.html?id=${address.id}">详细</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/address/update.html?id=${address.id}">修改</a>&nbsp;&nbsp;<a href="${pageContext.request.contextPath }/address/del.html?id=${address.id}">删除</a>&nbsp;&nbsp; </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
