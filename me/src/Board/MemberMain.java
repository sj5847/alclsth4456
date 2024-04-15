package Board;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardData bd = new BoardData();
		MemberService ms = new MemberService();
		 while(true) {
			 bd.list();
		int choice = sc.nextInt();
			 switch(choice) {
			 case 1: ms.getboardInsert(); continue;
			 case 2: ms.boardDetail(); continue;
			 case 3: ms.boardUpdate(); continue;
			 case 4: ms.boardDelete(); continue;
			 case 5: break;
			 }
			 if(choice<0 ||choice>5) {
				 System.out.println("잘못입력하였습니다.");
				 break;
			 }
		 }
		
	}
	
}
