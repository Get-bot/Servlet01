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
<h2>MemberView.jsp</h2>
<table>
<tr>
<td>아이디 : ${memberView.mid }</td> 
<td>비번 : ${memberView.mpassword }</td> 
<td>이름 : ${memberView.mname} </td>
<td>전번 : ${memberView.phone }</td> 
<td>이멜 : ${memberView.memail }</td>
<td>성별 : ${memberView.mgender }</td> 
</tr>
</table>
</body>
</html>