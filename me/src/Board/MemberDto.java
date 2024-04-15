package Board;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class MemberDto {
	
	public static List<MemberDto> blist = new ArrayList<>();
	private String id;
	private String title;
	private String content;
	private String date;
	private int no;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public MemberDto(String id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
		
	}
	public MemberDto() {
		// TODO Auto-generated constructor stub
	}
	public static List<MemberDto> getBoardList() {
	    return blist;
	}
	@Override
	public String toString() {
		return "게시판 [번호"+ no+",id=" + id + ", title=" + title + ", "
				+ "content=" + content   
				+ "]";
	}
	
	
}
