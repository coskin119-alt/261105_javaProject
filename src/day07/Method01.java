package day07;

public class Method01 {

	/*
	 * 두 정수가 주어지면 두 수의 합을 리턴하는 메서드
	 */
	public int sum1(int a, int b) {
		return a+b;
	}
	
	
	/*
	 * 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 */
	public void sum2(int a, int b) {
		System.out.println(a+b);
	}
	
	
	/*
	 * 매개변수 있고 return 있는 경우
	 */
	public int sum3() {
		int a = 5;
		int b = 6;
		
		return a+b;
	}
	

	/*
	 * 매개변수 없고 return 없는 경우
	 */
	public void sum4() {
		int a = 5;
		int b = 6;
		
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 80;
		
		// main 메서드는 static 이므로 상기의 메서드 직접 호출불가
		// 필요한 메서드를 포함하는 클래스에 대한 객체를 생성한 뒤 호출
		Method01 m = new Method01();
		
		m.sum2(num1, num2);
		
		
	}

}
