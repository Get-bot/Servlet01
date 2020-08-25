<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>MemberUpdate.jsp</h2>
<form action="memberupdateprocess" method="post">
아이디 : <input type="text" name="mid" id="mid" value="${memberUpdate.mid }"> 
비번 : <input type="text" name="mpassword" id="mpassword" value="${memberUpdate.mpassword }">
이름 : <input type="text" name="mname" id="mname" value="${memberUpdate.mname}">
이멜 : <input type="text" name="memail" id="memail" value="${memberUpdate.memail }">
성별 : <input type="text" name="mgender" id="mgender" value="${memberUpdate.mgender }">
<input type="submit" value="수정"> <br>
</form>
</body>
</html>