package day10;

public class Product {
	// 제품 클래스
	// 판매 제품명, 가격

	private	String	menu;
	private int		price;
	
	public Product(){ }

	public Product(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
