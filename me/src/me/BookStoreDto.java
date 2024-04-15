package me;

public class BookStoreDto {
	private int bookNo;
	private String writer;
	private String publish;
	private int price;

	private String bookName;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookNo() {
		return bookNo;
	}
	
	
	public BookStoreDto(String bookName, int bookNo, String writer, String publish, int price) {
		this.bookName = bookName;
		this.bookNo = bookNo;
		this.writer = writer;
		this.publish = publish;
		this.price = price;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
