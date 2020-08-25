package service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberViewService {

	public MemberDTO memberView(HttpServletRequest request, HttpServletResponse response) {
		String mid = request.getParameter("mid"); // 리퀘스트로 넘어온 아이디 해체
		MemberDAO mDAO = new MemberDAO();
		mDAO.dbConnection();
		MemberDTO memberView = new MemberDTO();
		memberView= mDAO.memberView(mid);
		mDAO.dbClose();
		
		
		
		return memberView;
	}

}
