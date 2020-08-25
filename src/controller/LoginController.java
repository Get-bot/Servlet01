package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.MemberLoginService;

@WebServlet("/memberlogin")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
    }


    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	MemberLoginService mloginService = new MemberLoginService();
    	String loginResult = mloginService.memberLogin(request, response);

    	HttpSession session = request.getSession();
    	if(loginResult !=null) {
    		//로그인 성공
    		// 세션 객체에 아이디 저장
    		session.setAttribute("loginResult", loginResult);
    		response.sendRedirect("MemberLoginOK.jsp");
    	}else {
    		response.sendRedirect("MemberLoginFail.jsp");
    	}
    	/*세션(session)영역
    	 *세션영역에 파라미터를 저장하면
    	 *브라우저를 닫거나
    	 *로그아웃등 세션 영역에 저장된 값을 지우기 전가지
    	 *파라미터값이 유지
    	 *주로 로그인 아이디를 저장하는데에 많이 사용됨 
    	 */
    	
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
}