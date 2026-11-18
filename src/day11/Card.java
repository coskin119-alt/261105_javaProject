package day11;

public class Card {
	// 카드 한장
	// 모양 : ♠ ♦ ♥ ♣ 
	// 숫자 (1~13) : 1(A), 11(J), 12(Q), 13(K)
	/*
	 * ♥1 => ♥A
	 * ♥11 => ♥J
	 * !10 => ♥10
	 * !14 => ♥A
	 * 
	 * 범위에 없는 모양이면 ♥
	 * 범위에 없는 숫자이면 A
	 */
	
	/*
	 * 멤버변수 : 모양(shape), 숫자(num)
	 * - getter, setter
	 * - toString
	 * - 출력메서드 (숫자가 입력되면 A J Q K 로 변환)
	 */

	private String shape;
	private int num;

	
	public Card() {
		this.shape = "♥";
		this.num = 1;
	}

	
	public Card(String shape, int num) {
		setShape(shape);
		setNum(num);
	}

	
	public void printCard() {
		String card = this.shape;
		
		// 숫자 검색
		switch (this.num) {
		case 1:
			card += "A";
			break;
		case 11: 
			card += "J";
			break;
		case 12: 
			card += "Q";
			break;
		case 13: 
			card += "K";
			break;
		default :
			card += String.valueOf(num);
			break;
		}
		
		System.out.print(card + "  ");
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		// 숫자 검색
		if (num < 1 || num > 13) {
			num = 1;
		}
		
		this.num = num;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		// 모양 검색
		if (!shape.equals("♥") && 
			!shape.equals("♣") && 
			!shape.equals("♠") && 
			!shape.equals("♦")) {
			shape = "♥";
		}
		
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Card [num=" + num + ", shape=" + shape + "]";
	};
	
}
