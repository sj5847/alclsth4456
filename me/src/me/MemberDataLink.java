package me;

import java.util.Scanner;

public class MemberDataLink implements MemberDataSet{
Scanner sc = new Scanner(System.in);
BookStoreData data = new BookStoreData();
memberData mdata = new memberData();

@Override
	public void booksearch() {
		System.out.println("검색하실 도서명");
		String bookName = sc.nextLine();
		BookStoreDto dto = BookStoreData.blist.get(bookName);
		if(dto.equals(null)) {
			System.out.println("해당 도서는 존재하지 않습니다.");
		}else {
			BookStoreDto d =data.blist.get(bookName);
			System.out.println(d.getBookName() + "도서는 재고가 있습니다.");
		}
	}

	@Override
	public void charge() {
		System.out.println("회원명");
		String memberName = sc.nextLine();
		MemberDto dto = memberData.mlist.get(memberName);
		if(dto.equals(null)) {
			System.out.println("회원명이 존재하지 않습니다.");
		}else {
			System.out.println("회원님의 현재잔고");
		MemberDto d = memberData.mlist.get(memberName);
		System.out.println(d.getCharge() +"원 있습니다.");
		}
	}

	@Override
	public void bookbuy() {
		System.out.println("회원명");
		String memberName = sc.nextLine();
		MemberDto mdto = memberData.mlist.get(memberName);
		System.out.println("구매하실 도서명");
		String bookName = sc.nextLine();
		BookStoreDto dto = BookStoreData.blist.get(bookName);
		int total = dto.getPrice()-mdto.getCharge();
		if(mdto.equals(null)) {
			System.out.println("회원님이 존재하지 않습니다.");
		}else {
		if(dto.equals(null)) {
			System.out.println("현재 이 도서는 재고가 없습니다.");
		}else {
			int money = mdto.getCharge();
			if(total< 0) {
				System.out.println("잔액이 부족하여 구매하실 수 없습니다.");
			}else {
			System.out.println("구매가 완료되었습니다.");
			}
	}
	}
}
	@Override
	public void charging() {
		System.out.println("회원명");
		String memberName = sc.nextLine();
		
	}

}
