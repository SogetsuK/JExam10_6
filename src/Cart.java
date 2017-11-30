import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Item> items = new ArrayList<Item>();

	void addItems(Item item) {
		items.add(item);
	}
	void printCart() {
		System.out.println("カートに入っている商品は、");
		if(items.size() == 0) {
			System.out.println("ありません。");
		}else {
			for(int i = 0; i < items.size(); i++) {
				items.get(i).printItem();
			}
		}
		System.out.println("商品の合計は" + getTotalPrice() +"円です。");
	}

	int getTotalPrice() {
		int totalprice = 0;
		for(int i = 0; i < items.size(); i++) {
			totalprice += items.get(i).getPrice();
		}
		return totalprice;
	}
}
