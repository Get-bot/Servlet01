package service;

import java.util.ArrayList;
import java.util.List;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberListService {

	public List<MemberDTO> memberList() {
		MemberDAO mDAO = new MemberDAO();
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		
		mDAO.dbConnection();
		memberList= mDAO.memberList();
		mDAO.dbClose();
		
		return memberList;
	}

}
