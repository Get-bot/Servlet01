package dto;

public class MemberDTO {
	// 필드 선언하고, getter/setter, toString, 기본생성자, 모든 필드있는 생성자 선언
	private String mid;
	private String mpassword;
	private String mname;
	private String mgender;
	private String memail;
	private String phone;
	
	public MemberDTO(){
		
	}
	
	public MemberDTO(String mid, String mpassword, String mname, String mgender, String memail, String phone) {
		super();
		this.mid = mid;
		this.mpassword = mpassword;
		this.mname = mname;
		this.mgender = mgender;
		this.memail = memail;
		this.phone = phone;
	
	}

	@Override
	public String toString() {
		return "MemberDTO [mid=" + mid + ", mpassword=" + mpassword + ", mname=" + mname + ", mgender=" + mgender
				+ ", memail=" + memail + ", phone=" + phone + "]";
	}

	public String getMid() {
		return mid;
	}

	public String getMpassword() {
		return mpassword;
	}

	public String getMname() {
		return mname;
	}

	public String getMgender() {
		return mgender;
	}

	public String getMemail() {
		return memail;
	}

	public String getPhone() {
		return phone;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public void setMpassword(String mpassword) {
		this.mpassword = mpassword;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public void setMgender(String mgender) {
		this.mgender = mgender;
	}

	public void setMemail(String memail) {
		this.memail = memail;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	}
	

	