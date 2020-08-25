package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import db.DBConnection;
import dto.MemberDTO;
import oracle.net.aso.r;

public class MemberDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public void dbConnection() {
		con = DBConnection.getConnection();
	}
	
	public void dbClose() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void pstmtClose() {
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void rsClose() {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public int memberJoin(MemberDTO member) {
		// id, password, age 정보를 MEMBER0821 테이블에 저장하고
		// 저장됐는지 sql developer 에서 확인		
		String sql ="INSERT INTO MEMBER0821_1(MID,MPASSWORD,MNAME,MPHONE,MEMAIL,MGENDER)"
				+"VALUES(?,?,?,?,?,?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,member.getMid());
			pstmt.setString(2,member.getMpassword());
			pstmt.setString(3,member.getMname());
			pstmt.setString(4,member.getPhone());
			pstmt.setString(5,member.getMemail());
			pstmt.setString(6,member.getMgender());
			result = pstmt.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			pstmtClose();
		}
		return result;
	}
	
	public boolean memberLogin(MemberDTO member) {
		// id, password, age 정보를 MEMBER0821 테이블에 저장하고
		// 저장됐는지 sql developer 에서 확인	
		boolean insertResult = true;
		try {
			String sql ="select MID,MPASSWORD from MEMBER0821_1 where MID = ?"; // login테이블에서 id, pass 조회 id에맞는
			//String sql ="select * from MEMBER0821_1 where MID = ? AND MPASSWORD=?"; // login테이블에서 id, pass 조회 id에맞는
		    pstmt =con.prepareStatement(sql); // id 에맞는 pass불러오기
		    pstmt.setString(1,member.getMid()); // 설정한 id 에 비번 컬럼 호출
			rs=pstmt.executeQuery();  //쿼리 실행
			if(rs.next())  {
			}if(rs.getString("MPASSWORD").equals(member.getMpassword())) { // upass 와 스캔받은 비밀번호가 일치하는지 조회
				insertResult =	true;  // 일치할시 insertResult 값을 true 로변경
			} else {
				insertResult = false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			pstmtClose();
			rsClose();
		}
		return insertResult;
	}

	public List<MemberDTO> memberList() {
		String sql = "SELECT * FROM MEMBER0821_1";
		List<MemberDTO> memberList = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		try {
			pstmt = con.prepareStatement(sql);
			// db에서 조회한 데이터를 rs에 저장
			rs = pstmt.executeQuery();
			//조회 데이터를 모두담기위해 while문사용
			while(rs.next()) {
				//각 회원에 대한 정보를 DTO에 담아서 ArrayList 의 각 인덱스에 저장
				member = new MemberDTO();
				// DB에서 조회한 첫번째 회원의 id를 rkwudha
				String mid = rs.getString("MID");
				String pass = rs.getString("MPASSWORD");
				String name = rs.getString("MNAME");
				String phone = rs.getString("MPHONE");
				String email = rs.getString("MEMAIL");
				String gender = rs.getString("MGENDER");
				//가져온 데이터를 member객체의 mid필드 값으로 저장
				member.setMid(mid);
				member.setMpassword(pass);
				member.setMname(name);
				member.setPhone(phone);
				member.setMemail(email);
				member.setMgender(gender);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
}
