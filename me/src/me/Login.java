package me;

public class Login {

	public static String id;
	public static String pw;
	public static int num;
	
	public static boolean login() {
	if(id==null||pw==null) {
		System.out.println("아이디와 비밀번호를 입력바랍니다.");
	return false;
	}else {
		if(id.equals("user")&&pw.equals("1234")) {
			return true;
		}else if(id.equals("master")&&pw.equals("1234")) {
			return true;
		}
	}return false;
	
	}
}
