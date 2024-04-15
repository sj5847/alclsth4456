package UserLogin;

import java.util.Scanner;

import Shopping.ShoppingData;

public class ShoppingUser {
	
	public static void user() {
	Scanner sc = new Scanner(System.in);
			ShoppingData data = new ShoppingData();
			System.out.println("=============================");
			System.out.println("========재고 관리 프로그램=======");
			System.out.println("=============================");
		
//			System.out.println("<<ID>>");
//			String id = sc.nextLine();
//			System.out.println("<<PW>>");
//			String pw = sc.nextLine();
			
			if(UserLogin.login()&&UserLogin.id.equals("sojin0413")
					&&UserLogin.pw.equals("1234")) {
			while(true) {	
			
	System.out.println("1.물품등록 2.물품삭제 3.물품조회 4.물품검색 5.종료");
				int menu = sc.nextInt();
				if(menu <0 ||menu >5) {
				System.out.println("잘못선택하였습니다.");
				}else if(menu==5) {
					System.out.println("종료합니다.");
					break;
				}
				
				switch(menu) {
				case 1: data.productInsert(); continue;
				case 2: data.productDelete(); continue;
				case 3: data.productView(); continue;
				case 4: data.productSearch(); continue;
				case 5: break;
					
				
				}			
				}
				}
			}
	}


				
			
	

