<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>系统登录 - 超市订单管理系统</title>
</head>
<body>
    <section>
    	<header>
    		<h1>超市管理系統</h1>
    	</header>
    	<section>
    		<form action="${pageContext.request.contextPath }/dologin.html" method="post">
		<div>${error}</div>
		<div>

			<input name="userCode" required="required" placeholder="請輸入用戶名"/>
		</div>
		<div>

			<input type="password" name="userPassword" required="required" placeholder="請輸入密碼"/>
		</div>
		<div>
			<input type="submit"  name="submit" value="提交"/>
		</div>
	</form>
	</section>
    </section>
</body>
</html>
