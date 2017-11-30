public class Customer {
	String name;
	int money;
	Cart mycart = new Cart();

	Customer(String name,int money) {
		this.name = name;
		this.money = money;
	}

	void buyItem(Shop shop, int itemNo) {
		shop.buyItem(itemNo);
		mycart.addItems(shop.items.get(itemNo));
	}

	void printCustomer() {
		System.out.println("私の名前は、" + this.name + "です。");
		System.out.println("所持金は" + this.money + "円です。");
		mycart.printCart();
	}

	void printTotalPrice() {
		System.out.println("現在カート内の合計金額は" + mycart.getTotalPrice() + "円です。");
	}

	void register() {
		System.out.println("商品を精算します。");
		System.out.println("商品の合計は" + mycart.getTotalPrice() + "円です。");
		if(this.money >= mycart.getTotalPrice()) {
			System.out.println("所持金は" + (this.money - mycart.getTotalPrice()) + "円となりました。");
		}else {
			System.out.println("所持金が不足しています！\n商品を精算することはできませんでした。");
			System.out.println("所持金は" + this.money + "円です。");
		}
	}
}
