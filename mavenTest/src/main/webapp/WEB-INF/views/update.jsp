<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 수정</title>
</head>
<body>
	<form method="post" action="/update">
		이메일 : <input type="email" name="email"> <br>
		비밀번호 : <input type="password" name="pin"> <br>
		<button>회원정보 입력</button>
		
		이름 : <input type="text" name="name"> <br>
		연락처 : <input type="text" name="tel"> <br>
		비밀번호 : <input type="password" name="pin"> <br>
		<button>회원정보 수정</button>
	</form>

	
</body>
</html>