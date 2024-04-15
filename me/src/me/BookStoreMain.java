package me;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BookStoreMain {
	Scanner sc = new Scanner(System.in);
	
//	private MemberDataLink bookStoreMain;
	public BookStoreMain() {
		
	}
	public void start() {
		BookStoreData.setbookblist();
		memberData.setmembermlist();
		System.out.println("아이디 입력(user|master)");
		Login.id = sc.nextLine();
		System.out.println("패스워드 입력");
		Login.pw = sc.nextLine();
		if(Login.id.equals("user")&& Login.pw.equals("1234")) {	
			String menu = "1.도서목록 2.도서검색 3.잔액확인 4.도서구매 5.충전 6.종료";
			System.out.println("[" + menu +"]");
		
			    while(true) {
				MemberDataLink mlink = new MemberDataLink();
				int choice = sc.nextInt();
				switch(choice) {
				case 1: bookview();break;
				case 2:try { mlink.booksearch();
				}catch(NullPointerException e) {
					System.out.println("검색하신 도서는 존재하지 않습니다.");
				}
				case 3: mlink.charge();continue;
				case 4: mlink.bookbuy();continue;
				case 5: mlink.charging();continue;
				case 6: break;
				}		
				System.out.println();
			    }
	
			} else if(Login.id.equals("master")&&Login.pw.equals("1234")) {
			String	menu2 = "1.도서목록 2.도서등록 3.도서수정 4.도서삭제 5.회원목록 6.회원등록 7.회원수정 8.회원삭제"
						+ "9.종료";
				System.out.println("[" + menu2 +"]");
				while(true) {
					BookDataLink blink = new BookDataLink();
					int choice = sc.nextInt();
					switch(choice) {
					case 1:bookview();
					case 2:blink. bookinsert();
					case 3:try {blink. bookmodify();}
					catch(NullPointerException e) {
						System.out.println("해당 도서는 존재하지 않습니다.");
					}
					
					case 4:blink. bookdelete();
					case 5:bookview();
					case 6:blink. memberinsert();
					case 7:try {blink. membermodify();}
					catch(NullPointerException e) {
						System.out.println("해단 회원은 존재하지 않습니다.");
					}
					case 8:blink. memberdelete();
					case 9: break;
					}
				}
			}
			else {
		System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
			}
		}
	
	public void bookview() {  //전체반환
		Set<String> keylist = BookStoreData.blist.keySet();
		Iterator<String> it = keylist.iterator();
		while(it.hasNext()) {
		BookStoreDto dto =BookStoreData.blist.get(it.next());
			System.out.printf("%s\t, %d\t, %s\t, %s\t, %d\t\n",dto.getBookName(),dto.getBookNo()
					,dto.getWriter(),dto.getPublish(),dto.getPrice());
	
			System.out.println("");
		}
	}
	//콘솔에서 문자입력받아 리턴하는 메서드
	public String conput(String msg) {
		System.out.println(msg + "=");
		return sc.nextLine();
	}
	//콘솔에서 숫자로 입력받아 리턴하는 메서드
	public int input(int msg) {
		System.out.println(msg +"=");
		return sc.nextInt();
	}
	//시작하는 메서드
	public static void main(String[] args) {
//		BookStoreMain main = new BookStoreMain();
//		main.start();
	new BookStoreMain().start();  //한줄로 요약
	
	}
}
