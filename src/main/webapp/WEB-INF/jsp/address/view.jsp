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
        <form action="${pageContext.request.contextPath }/address/save.html" method="post">

            <table>
                <tr>
                    <td>联系人姓名</td>
                    <td>${address.contact}</td>
                </tr>
                <tr>
                    <td>收货地址明细</td>
                    <td>${address.addressDesc}</td>
                </tr>
                <tr>
                    <td>邮编</td>
                    <td>${address.postCode}</td>
                </tr>
                <tr>
                    <td>联系人电话</td>
                    <td>${address.tel}</td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
