package me;

import java.util.HashMap;

public class memberData {

	public static HashMap<String, MemberDto> mlist = 
			new HashMap<>();
	public memberData() {
		
	}
	public static void setmembermlist() {
		mlist.put("김수로", new MemberDto("김수로",1,"010-1111-1111","1234",50000));
		mlist.put("장발산", new MemberDto("장발산",1,"010-2222-1111","2345",25000));
		mlist.put("홍두깨", new MemberDto("홍두깨",1,"010-3333-1111","3456",30000));
		mlist.put("홍길동", new MemberDto("홍길동",1,"010-4444-4444","4321",45000));
		mlist.put("나장두", new MemberDto("나장두",1,"010-2222-4444","5678",50000));
		
	}
	

}
