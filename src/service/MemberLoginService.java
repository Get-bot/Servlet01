package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberLoginService {

	public String memberLogin(HttpServletRequest request, HttpServletResponse response) {
		String mid = request.getParameter("mid"); //데이터가져옴
		String mpassword = request.getParameter("mpassword");
		
		MemberDTO member = new MemberDTO();
		member.setMid(mid);
		member.setMpassword(mpassword);

		
		MemberDAO mDAO = new MemberDAO();
		
		//DB 접속
		mDAO.dbConnection();
		
		//insert 를 위한 메소드 호출
		boolean LoginResult = mDAO.memberLogin(member);
		
		String loginid = null;
		if(LoginResult==true) {
			loginid = mid;
		}else {
			loginid =null;
		}
		mDAO.dbClose();
		return loginid;
		
	}
	
}
