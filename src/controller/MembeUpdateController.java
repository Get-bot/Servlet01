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
import service.MemberUpdateService;
import service.MemberViewService;


@WebServlet("/memberupdate")
public class MembeUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MembeUpdateController() {
        super();
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	HttpSession session = request.getSession();
    	//세션에 적용된 로그인 id 가져오기
    	String mid = (String) session.getAttribute("loginResult");
    	MemberUpdateService mUpdateService = new MemberUpdateService();
    	// 회원 한명에 대한 전체 정보를 가지고 MemberView.jsp로 가야됨
    	MemberDTO memberUpdate = new MemberDTO();
    	memberUpdate = mUpdateService.memberUpdate(mid);
    	
    	request.setAttribute("memberUpdate", memberUpdate);
    	RequestDispatcher dispatcher= request.getRequestDispatcher("MemberUpdate.jsp");
    	dispatcher.forward(request, response);
    	
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