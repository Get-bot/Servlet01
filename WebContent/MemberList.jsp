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
<table border="1">
<tr>
<th>아이디</th>
<th>비밀번호</th>
<th>이름</th>
<th>전화번호</th>
<th>이메일</th>
<th>성별</th>
<th>조회</th>
</tr>
<c:forEach var = "member"  items = "${memberList }">
<tr>
<td>${member.mid }</td>
<td>${member.mpassword }</td>
<td>${member.mname} </td>
<td>${member.phone }</td>
<td>${member.memail }</td>
<td>${member.mgender }</td>
<!--링크 방식으로 서버에 파라미터 전달하기
	주소: memberview
	파라미터 명 : mid
	데이터 : 해당회원의 mid값  -->

<td><a href = "memberview?mid=${member.mid}">조회</a></td>
</tr><br>
</c:forEach>
</table>
</body>
</html>