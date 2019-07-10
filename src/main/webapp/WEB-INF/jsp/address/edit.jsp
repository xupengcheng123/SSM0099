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
            <input type="hidden" name="id" value="${address.id}">
            <table>
                <tr>
                    <td>联系人姓名</td>
                    <td><input name="contact" value="${address.contact}"></td>
                </tr>
                <tr>
                    <td>收货地址明细</td>
                    <td><input name="addressDesc" value="${address.addressDesc}"></td>
                </tr>
                <tr>
                    <td>邮编</td>
                    <td><input name="postCode" value="${address.postCode}"></td>
                </tr>
                <tr>
                    <td>联系人电话</td>
                    <td><input name="tel" value="${address.tel}"></td>
                </tr>
              
                <tr>
                    <td colspan="2"><input type="submit" value="保存"/> </td>

                </tr>
            </table>
        </form>
    </div>
</body>
</html>
