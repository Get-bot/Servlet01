<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- http://192.168.0.xxx:8090/Test0821/Memberjoin.jsp 다른컴퓨터의 사이트 접속 -->
	<h2>MemberJoin.jsp 파일</h2>
	<form action="memberjoin" method="post">
		ID: <input type="text" id="mid" name="mid"> <br>
		Password: <input type="password" id="mpassword" name="mpassword"> <br>
		Name : <input type="text" id="mname" name="mname"> <br>
		Phone: <input type="text" id="mphone" name="mphone"> <br>
		Email: <input type="text" id="memail" name="memail"> <br>
		Gender:   <input type="radio" id="male" name="mgender"  value="남자">
  						<label for="male">남자</label>
  					 <input type="radio" id="female" name="mgender" value="여자">
  						<label for="female">여자</label> <br>
		<input type="submit" value="전송">
	</form>
</body>
</html>