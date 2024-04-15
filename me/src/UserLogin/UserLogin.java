package UserLogin;

import java.util.Scanner;

import Shopping.ShoppingMain;

public class UserLogin {

	public static String id;
	public static String pw;
	
		public static boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<ID>>");
		String id = sc.nextLine();
		System.out.println("<<PW>>");
		String pw = sc.nextLine();
		ShoppingUser user = new ShoppingUser();
		if(id.equals("sojin0413")&&pw.equals("1234")) {
				return true;
		}else if(id==null||pw==null){
			System.out.println("확인해주세요");
			return false;		
		}
		System.out.println("아이디와 비밀번호를 확인해주세요");
			return false;
		}
			
		}



