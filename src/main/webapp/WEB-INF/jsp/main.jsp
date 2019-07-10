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
        <a href="${pageContext.request.contextPath }/user/list.html">查询用户列表</a>&nbsp;
        <a href="${pageContext.request.contextPath }/role/list.html">查询角色列表</a>&nbsp;
        <a href="${pageContext.request.contextPath }/address/list.html">查询地址列表</a>&nbsp;
    </div>
</body>
</html>
