package day01;

public class If {

	public static void main(String[] args) {
		// 조건문 : if, switch
		// 삼항연산자 : 조건 선택 연산자
		//

		// Number 0보다 크면 양수 0보다 작으면 음수 나머지는 0
		int num = 1;

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("Zero");
		}

		System.out.println(num > 0 ? "양수" : num < 0 ? "음수" : "Zero");

		System.out.println();

	}

}
