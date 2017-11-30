import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Shop shop = new Shop("ケーキ屋さん");
		System.out.println("Shopを店名=" + shop.getName() + "で作成しました。");
		System.out.println("====================================================");
		System.out.println("いらっしゃいませ。" + shop.getName() + "です。\n扱っている商品は、");
		Item i1 = new Item("チョコレート", 990);
		Item i2 = new Item("ショートケーキ", 890);
		Item i3 = new Item("マーブルケーキ", 1180);
		Item i4 = new Item("チーズケーキ", 1200);
		Item i5 = new Item("マロンケーキ", 1050);
		shop.addItem(i1);
		shop.addItem(i2);
		shop.addItem(i3);
		shop.addItem(i4);
		shop.addItem(i5);
		shop.printShop();
		System.out.println("====================================================\r");
		System.out.println("******************************************************");
		Customer customer = new Customer("五郎丸", 3000);
		customer.printCustomer();
		System.out.println("******************************************************");
		System.out.println("購入したい商品を選んでください。");
		Scanner s = new Scanner(System.in);
		while(true) {
			try{
				System.out.print("商品番号(qで終了)?");
				String n = s.next();
				if(n.equals("q")) {
					break;
				}
				if(n.equals("t")) {
					customer.printTotalPrice();
					continue;
				}
				int num = Integer.parseInt(n);
				customer.buyItem(shop, num);
			}catch(IndexOutOfBoundsException e) {
				System.out.println("指定商品はありません");
				s.nextLine();
			}catch(NumberFormatException e) {
				System.out.println("数値を入力してください！");
				s.nextLine();
			}
		}
		System.out.println("\r******************************************************");
		customer.printCustomer();
		System.out.println("******************************************************");
		System.out.println("\r/////////////////////////////////////////////////////////");
		customer.register();
		System.out.println("/////////////////////////////////////////////////////////");
	}
}

