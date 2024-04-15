package me;

import java.util.HashMap;

public class BookStoreData {
	public static HashMap<String, BookStoreDto> blist
	=new HashMap<>();
	
public static void setbookblist() {
//	blist.put("책이름", new BookStoreDto("책이름",1,"저자","출판사",20000 ));
	blist.put("자바가 신이다", new BookStoreDto("자바가 신이다",2,"김작가","한빛",32000 ));
	blist.put("자바의 정석", new BookStoreDto("자바의 정석"   ,3,"남궁성","위키",30000 ));
	blist.put("나홀로 자바", new BookStoreDto("나홀로 자바"   ,4,"정동균","퍼블리셔",15000 ));
	blist.put("코딩테스트", new BookStoreDto("   코딩테스트"  ,5,"홍두깨","도우",25000 ));
	blist.put("야너두", new BookStoreDto("     야너두"      ,6,"신애라","한빛",32000 ));
}
		
		
}
