package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.MemberDTO;
import service.MemberViewService;


@WebServlet("/memberview")
public class MembeViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MembeViewController() {
        super();
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
    	MemberViewService mViewService = new MemberViewService();
    	// 회원 한명에 대한 전체 정보를 가지고 MemberView.jsp로 가야됨
    	MemberDTO memberView = new MemberDTO();
    	memberView = mViewService.memberView(request, response);
    	
    	request.setAttribute("memberView", memberView);
    	RequestDispatcher dispatcher= request.getRequestDispatcher("MemberView.jsp");
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