package Shopping;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ShoppingData {
	boolean stop = false;
	ShoppingDto dto = new ShoppingDto();
	ShoppingList slist = new ShoppingList();
	Scanner sc = new Scanner(System.in);
	public void productInsert() {	
		System.out.println("물품명");
		String product = sc.nextLine();
		System.out.println("물품 가격");
		int price = sc.nextInt();
		System.out.println("물품 수량");
		int count = sc.nextInt();
		ShoppingDto dto = ShoppingList.slist.put(product,
				new ShoppingDto(product,price,count));
		ShoppingList.setslist();
		System.out.println("");
		sc.nextLine();
	}
	public void productDelete() {
		System.out.println("삭제할 상품명");
		String product = sc.nextLine();
		ShoppingDto dto = ShoppingList.slist.get(product);
		if(dto==null) {
			System.out.println("상품이 존재하지 않습니다.");
		}else {
			ShoppingList.slist.remove(product);
			productView();
			System.out.println("해당 상품이 삭제되었습니다.");
		}
	}
	public void productView() {
		Set<String> keylist = 
				ShoppingList.slist.keySet();
		Iterator<String> it = keylist.iterator();
		if(it.hasNext()) {
			ShoppingDto dto= ShoppingList.slist.get(it.next());
			System.out.printf("%s\t,%d\t,%d",dto.getProduct(),dto.getPrice()
					,dto.getCount());
			System.out.println("");
		}
		else {
			System.out.println("존재하지 않습니다.");
		}
	}
	public void productSearch() {
		System.out.println("검색할 상품명");
		String product = sc.nextLine();
		ShoppingDto dto = ShoppingList.slist.get(product);
		if(dto==null) {
			System.out.println("해당 상품이 존재하지 않습니다.");
		}else {
	//		ShoppingDto dto = ShoppingList.slist.get(product);
			System.out.printf("%d",dto.getCount());
			System.out.println("개 남았습니다.");
		}
	}
//	public void stop() {
//		stop();
//	}
	
	
}
