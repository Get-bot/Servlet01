<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인성공</h1>
	로그인 아이디 : ${sessionScope.loginResult}<!--세션 가져오기  --> <br>
	${sessionScope.loginResult} 님 로그인을 환영합니다
	<!--  redirect 방식으로 화면이동을 했을 떄
		1. request, setAttribute 메소드를 활용해서 저장한 데이터는 사용수 없음
		2.session.setAttribue 메소드를 활용해서 저장한 데이터만 사용이가능함 (세션에는 보통 아이디만 저장)
		3. 데이터를 가지고 다른화면으로 이동하고자 할때는 dispatch방식을 사용해야함
	 -->
	 <br>
	 <!--회원목록 조회를 위한 링크
	   -->
	   <a href="memberlist">회원목록조회</a> <br>
	   <!-- 1. memberlist 주소 요청 
	   		 2. MemberListController 호출
	   		 3. MemberListService 호출	
	   		 4. MemberDAO.memberList 호출
	   		 5. DB에서 전체 정보 가져와서 ArrayList에 저장 후 Service로 리턴
	   		 6. Controller로 리턴
	   		 7. ArrayList를 담아서 MemberList.jsp로 이동하여 데이터 출력-->
</body>
</html>