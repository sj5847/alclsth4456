package Board;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class MemberService {
//	List<MemberDto> blist = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
			MemberDto dto = new MemberDto();
	public void getboardInsert() {
			
		List<MemberDto> blist = dto.getBoardList();
			System.out.println("제목작성");
			String title = sc.nextLine();
			System.out.println("글작성");
			String content = sc.nextLine();
			System.out.println("작성자");
			String id = sc.nextLine();
		//	 System.out.println("번호입력");
		//	 dto.setNo(blist.size());
			MemberDto dto = new MemberDto(id,title,content);
			dto.setNo(blist.size()+1);
			 dto.setTitle(title);
			 dto.setContent(content);
			 dto.setId(id);
			 blist.add(dto);
		// for(MemberDto dto: blist) {
		//			System.out.printf("%d\t%s\t%s\t%s\n",
		//			blist.indexOf(dto)+1,dto.getTitle(),dto.getContent(),dto.getId());
		System.out.println("게시글이 저장되었습니다.\n");
	}
//	}
	

	void boardDetail() {
	//	dto= blist.get(no-1);
	//	System.out.printf("%d\t%s\t%s",dto.getNo(),dto.getContent(),dto.getContent());
		List<MemberDto> blist = dto.getBoardList();
		if(blist.isEmpty()) {
			System.out.println("게시글이 존재하지 않습니다.");
		}	
		for(MemberDto dto: blist) {
			System.out.println("============================");
			System.out.println("번호    ||제목    ||작성자    ");
			System.out.println("============================");
			System.out.printf("%d\t%s\t%s\n",
			blist.indexOf(dto)+1,dto.getTitle(),dto.getId());
			System.out.println("============================");
			System.out.printf("%s",dto.getContent());
			System.out.println();
			
		}
		}
		
	//	}else {
	//		dto = blist.get(no-1);
	//		System.out.println(dto.getBoardList());
			//for(MemberDto Dto: blist) {
			//			System.out.printf("%s\t%s\t%s\n",
			//	Dto.getTitle(),Dto.getContent(),Dto.getId());


	void boardUpdate() {
		System.out.println("제목");
		String title = sc.nextLine();
		if(title.equals(null)) {
			System.out.println("게시글이 존재하지 않습니다.");
		}else {
			System.out.println("제목");
			title = sc.nextLine();
			System.out.println("게시글");
			String content = sc.nextLine();

			dto.setTitle(title);
			dto.setContent(content);
		}
		System.out.println("게시글이 수정되었습니다.");		
	}
	void boardDelete() {
		System.out.println("삭제할 게시글");
		String title = sc.nextLine();
		if(title.equals(null)) {
			System.out.println("게시글이 존재하지 않습니다.");
		}else {
			List<MemberDto> blist = dto.getBoardList();
			blist.remove(title);
			System.out.println("게시글이 삭제되었습니다.");
		}
	}
	
}
