package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.MemberJoinService;

@WebServlet("/memberjoin")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberController() {
        super();
    }
    /*
     * Controller의 역할
     * 	1. 주소 요청을 받아줌(여기선 memberjoin 주소요청)
     * 	2. Service 클래스 객체선언하여 Service 클래스의 메소드 호출
     * 		- 호출할 때 request, response 넘김.
     * 	3. Service의 리턴 값을 가지고 성공, 실패 여부를 판단 후
     * 		성공했을 때 출력 페이지, 실패했을 때 출력 페이지 들을 결정
     *  4. 페이지 이동시 가져갈 파라미터를 담는 역할도 함.
     */
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	MemberJoinService mjoinService = new MemberJoinService();
    	int joinResult = mjoinService.memberJoin(request, response);
    	//회원가입 성공이면 MemberLogin.jsp 출력
    	//실패면 MemberLogin.jsp 출력
    	if(joinResult >0) {
    		response.sendRedirect("MemberLogin.jsp");
    	}else {
    		response.sendRedirect("MemberJoinFail.jsp");
    	}
    	
//    	System.out.println("doProcess 호출 확인!");
//    	String mid = request.getParameter("mid");
//    	String mpassword = request.getParameter("mpassword");
//    	int mage = Integer.parseInt(request.getParameter("mage"));
//    	
//    	System.out.println(mid);
//    	System.out.println(mpassword);
//    	System.out.println(mage);
//    	// MemberLogin.jsp로 이동
////    	response.sendRedirect("MemberLogin.jsp");
//    	
//    	// MemberLogin.jsp로 이동하면서 mid 변수에 담긴 값 가져가기.
//    	// 가져갈 때 파라미터 이름은 idid로 지정
//    	request.setAttribute("idid", mid);
//    	request.setAttribute("pppp", mpassword);
//    	// dispatch 방식으로 화면이동
//    	RequestDispatcher dispatcher = 
//    			request.getRequestDispatcher("MemberLogin.jsp");
//    	dispatcher.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 호출 확인!");
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost 호출 확인!");
		doProcess(request, response);
	}

}
