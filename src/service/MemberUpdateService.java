package service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberUpdateService {

	public MemberDTO memberUpdate(String mid) {
		MemberDAO mDAO = new MemberDAO();
		mDAO.dbConnection();
		MemberDTO memberUpdate = new MemberDTO();
		memberUpdate= mDAO.memberUpdate(mid);
		mDAO.dbClose();
		return memberUpdate;
	}

}
