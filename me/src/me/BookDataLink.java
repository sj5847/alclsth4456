package me;

import java.util.Scanner;

public class BookDataLink implements BookDataSet{
Scanner sc = new Scanner(System.in);
BookStoreMain main = new BookStoreMain();
	@Override
	public void bookinsert() {
		System.out.println("도서넘버");
		int bookstoreNo = sc.nextInt();
		System.out.println("도서명");
		String bookstoreName = sc.nextLine();
		System.out.println("저자");
		String bookstoreWriter = sc.nextLine();
		System.out.println("출판사");
		String bookstorePublish = sc.nextLine();
		System.out.println("금액");
		int bookPrice = sc.nextInt();
		
		BookStoreData.blist.put(bookstoreName, 
				new BookStoreDto(bookstoreName,bookstoreNo,bookstoreWriter
						,bookstorePublish,bookPrice));
	}

	private BookStoreDto bookStoreDto; 
	@Override
	public void bookmodify() {
		System.out.println("수정할 도서");
		String bookstoreName = sc.nextLine();
//		bookStoreDto.getBookName();
		BookStoreDto dto = BookStoreData.blist.get(bookstoreName);
		if(dto.equals(null)) {
			System.out.println("해당 도서는 존재하지 않습니다.");
		}else {
		System.out.println("새로운 도서");
		bookstoreName = sc.nextLine();
		System.out.println("도서저자");
		String bookstoreWriter = sc.nextLine();
		System.out.println("출판사");
		String bookstorepublish = sc.nextLine();
	
		dto.setBookName(bookstorepublish);
		dto.setWriter(bookstoreWriter);
		dto.setPublish(bookstorepublish);
		    
	}
	}
	@Override
	public void bookdelete() {
		System.out.println("삭제할 도서");
		String bookstoreName = sc.nextLine();
		BookStoreDto dto = BookStoreData.blist.get(bookstoreName);
		if(dto.equals(null)) {
			System.out.println("해당 도서는 존재하지 않습니다.");
		}else {
			BookStoreData.blist.remove(dto);
			System.out.println("해당 도서가 삭제되었습니다.");
		}
		System.out.println();
		main.bookview();
	}

	
	@Override
	public void memberinsert() {
		System.out.println("추가할 회원번호");
		int memberNo = sc.nextInt();
		System.out.println("추가할 회원명");
		String memberName = sc.nextLine();
		System.out.println("회원 전화번호");
		String memberPhone = sc.nextLine();
		System.out.println("회원 아이디");
		String memberid = sc.nextLine();
		System.out.println("충전할 금액");
		int membercharge = sc.nextInt();
		MemberDto dto = memberData.mlist.put(memberName,new MemberDto(memberName,
				memberNo,memberPhone,memberid,membercharge));
		
	}

	@Override
	public void membermodify() {
		System.out.println("수정할 회원명");
		String memberName = sc.nextLine();
		MemberDto dto = memberData.mlist.get(memberName);
		if(memberName.equals(null)) {
			System.out.println("해당 회원님은 존재하지 않습니다.");
		}else {
			System.out.println("회원 핸드폰번호");
			String memberPhone = sc.nextLine();
			dto.setMemberPhone(memberPhone);
			System.out.println("회원 충전금액");
			int memberCharge = sc.nextInt();
					dto.setCharge(memberCharge);
		}
	}

	@Override
	public void memberdelete() {
		System.out.println("삭제할 회원명");
		String memberName = sc.nextLine();
		if(memberName.equals(null)) {
			System.out.println("해당 회원님이 존재하지 않습니다.");
		}else {
			memberData.mlist.remove(memberName);
			main.bookview();
		}
	}

}
