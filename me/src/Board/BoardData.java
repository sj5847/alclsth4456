package Board;

import java.util.ArrayList;
import java.util.List;

public class BoardData {

	List<MemberDto> blist = new ArrayList<>();
	MemberDto dto = new MemberDto();
	public void list() {
		System.out.println("--------------게시판-------------");
		System.out.println("[번호     ||제목     ||작성자     ]");
		List<MemberDto> blist = dto.getBoardList();
if(blist.isEmpty()) {
		
			System.out.println("게시글 없음");
		
		}else {
				for(MemberDto dto: blist) {
					System.out.println(dto);
		//		System.out.printf("%d\t%s\t%s\t%s\n",
		//		blist.indexOf(dto)+1,dto.getTitle(),dto.getContent(),dto.getId());
			}
		}
		System.out.println("---------------------------------");
		System.out.println("1.글작성 2.상세보기 3.수정 4.삭제 5.종료");


	}
}
