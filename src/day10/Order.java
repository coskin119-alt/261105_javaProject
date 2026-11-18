package day10;

public class Order {
	// 주문 클래스
	// 상품명, 개수, 가격(단가), 금액
	// 주문 추가
	
	private String 	menu;
	private int		num;
	private int		price;
	private int		amount;
	
	public Order(){ }
	
	public Order(String menu, int num, int price){
		this.menu 	= menu;
		this.num 	= num;
		this.price 	= price;
		this.amount = price * num;
	}

	public void printOrder() {
		System.out.println(menu + "\t" + num + "\t"+ price + "\t"+ amount + "\t");
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
