package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.MemberDTO;
import service.MemberUpdatePService;
import service.MemberViewService;


@WebServlet("/memberupdateprocess")
public class MembeUpdatePController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MembeUpdatePController() {
        super();
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	HttpSession session = request.getSession();
    	String mid2 = (String) session.getAttribute("loginResult");
    	MemberUpdatePService mUpdatePService = new MemberUpdatePService();
     	int joinResult = mUpdatePService.memberUpdateProcess(request, response,mid2);
    	//회원가입 성공이면 MemberLogin.jsp 출력
    	//실패면 MemberLogin.jsp 출력
    	if(joinResult >0) {
    		response.sendRedirect("MemberLogin.jsp");
    	}else {
    		response.sendRedirect("MemberUPfail.jsp");
    	}
    	
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