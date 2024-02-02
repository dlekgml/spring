<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 로그인 페이지 </title>
</head>
<body>
	
	<form method="post" action="/signin">
		이메일 : <input type="email" name="email"> <br>
		비밀번호 : <input type="password" name="pin"> <br>
			<button>로그인</button>
	</form>

</body>
</html>