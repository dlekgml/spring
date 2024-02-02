<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메이븐 테스트</title>
</head>
<body>
	<h1> ${user }</h1>
	<a href="/signup" id="up">회원가입</a> 
	<a href="/signin" id="in">로그인</a>
	
</body>
</html>
<style>
	a{ text-decoration:none; color:white; font-size:40px;
		display:block; width:300px; text-align:center;
		padding:20px 40px; margin:0 auto;
	}
	#up{background:#3498db;}
	#in{background:#27ae60;}
</style>