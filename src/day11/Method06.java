package day11;

public class Method06 {

	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public double sum(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// 메서드 오버로딩 : 동일한 이름의 메서드를 여러개 만드는 방법
		// - 동일한 기능을 매개변수의 갯수가 다르거나, 매개변수 타입이 다른 경우에 사용
		// 오버로딩의 조건
		// - 매개변수의 갯수가 다를 것
		// - 매개변수의 타입이 다를 것
		// 리턴은 상과 없음, 매개변수의 이름도 상관 없음
		
		Method06 m = new Method06();
		
		m.sum(0, 0);
		

	}

}
