<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<script >
function goLogin() {
	Loginform.submit();
}
</script>
</head>
<body>
	<h1>MemberLogin.jps 파일</h1>
	<form action="memberlogin" method="post" name="Loginform">
		ID: <input type="text" id="mid" name="mid"> <br>
		Password: <input type="password" id="mpassword" name="mpassword"> <br>
				<input type="submit" value="전송">
</form>
 <button onclick="goLogin()">로그인</button>
</body>
</html>