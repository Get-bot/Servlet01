package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberJoinService {

	public int memberJoin(HttpServletRequest request, HttpServletResponse response) {
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		String mname = request.getParameter("mname");
		String mphone = request.getParameter("mphone");
		String memail = request.getParameter("memail");
		String mgender = request.getParameter("mgender");
		
		MemberDTO member = new MemberDTO();
		member.setMid(mid);
		member.setMpassword(mpassword);
		member.setMname(mname);
		member.setPhone(mphone);
		member.setMemail(memail);
		member.setMgender(mgender);
		
		MemberDAO mDAO = new MemberDAO();
		
		//DB 접속
		mDAO.dbConnection();
		
		//insert 를 위한 메소드 호출
		int joinResult = mDAO.memberJoin(member);
		//Db접속 종료
		mDAO.dbClose();
		
		return joinResult;
	}
	
}
