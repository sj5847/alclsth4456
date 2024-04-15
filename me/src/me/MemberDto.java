package me;

public class MemberDto {

	private String memberName;
	private String memberPhone;
	private int charge;
	private int memberNo;
	private String id;
	
	
	public MemberDto(String memberName,int memberNo , String memberPhone,String id ,int charge ) {
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.charge = charge;
		this.memberNo = memberNo;
		this.id = id;
	}
	
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
