<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>briup电子商务-注册页</title>
<link rel="stylesheet" href="css/common.css" />
<link rel="stylesheet" href="css/style.css" />
</head>
<body>
	<div class="container2">
		<div class="header2">
			<div>
				<a href="#"><img class="logo" src="images/logon_register.png"></a>
			</div>
			<div>
				<ul class="tabs">
					<li class="phone current"><a href="#">用手机登录</a></li>
				</ul>
			</div>
			<div class="tlg">
				已有账号 <a href="login">登录</a>
			</div>
		</div>
		<div class="content2">
			<form action="register2">
				<ul class="reg_box">
					<li></li>
					<li><span><b>*</b>用户名：</span> <input type="text" name="name" />
					</li>
					<li><span><b>*</b>密码：</span> <input type="password"
						name="password" /></li>
					<li><span><b>*</b>电话：</span> <input type="text"
						name="phone" /></li>
					<li><span><b>*</b>电子邮箱：</span> <input type="text" name="email" />
					</li>
					<li></li>
				</ul>
			
			<p>
				<input type="checkbox" checked /> 我已阅读并同意 <a href="#">用户注册协议</a>
			</p>
			<input class="btn_submit" type="submit" value="立即注册" />
			</form>
		</div>
	</div>
</body>
</html>
