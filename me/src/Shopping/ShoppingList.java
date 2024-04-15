package Shopping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingList {
	public static Map<String, ShoppingDto> slist 
	= new HashMap<>();

	public static void setslist() {
		
		slist.put("top", (new ShoppingDto("블라우스", 25000,5)));
		
	}

		
		
	}


