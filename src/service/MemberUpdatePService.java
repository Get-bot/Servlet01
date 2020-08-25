package service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberUpdatePService {

	public int memberUpdateProcess(HttpServletRequest request, HttpServletResponse response,String mid2) {
		String mid = request.getParameter("mid");
		String mpassword = request.getParameter("mpassword");
		String mname = request.getParameter("mname");
		String memail = request.getParameter("memail");
		String mgender = request.getParameter("mgender");
		
		MemberDTO memberUdateP = new MemberDTO();
		memberUdateP.setMid(mid);
		memberUdateP.setMpassword(mpassword);
		memberUdateP.setMname(mname);
		memberUdateP.setMemail(memail);
		memberUdateP.setMgender(mgender);
			
		MemberDAO mDAO = new MemberDAO();
		mDAO.dbConnection();
		int joinResult = mDAO.memberUpdateP(memberUdateP,mid2);
		mDAO.dbClose();		
		
		return joinResult;
	}

}
