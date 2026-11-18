package day07;

public class Method02 {

	/*
	 * 더하기
	 */
	public int sum(int a, int b) {
		return a+b;
	}
	
	
	/*
	 * 빼기
	 */
	public int sub(int a, int b) {
		return a-b;
	}
	
	
	/*
	 * 곱하기
	 */
	public int mul(int a, int b) {
		return a*b;
	}
	
	
	/*
	 * 나누기 (몫)
	 */
	public long div(int a, int b) {
		if (b == 0) return -999999;
		return a/b;
	}
	
	
	/*
	 * 나누기 (나머지)
	 */
	public long rem(int a, int b) {
		if (b == 0) return -999999;
		return a%b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 100;
		int num2 = 0;
		
		// main 메서드는 static 이므로 상기의 메서드 직접 호출불가
		// 필요한 메서드를 포함하는 클래스에 대한 객체를 생성한 뒤 호출
		Method02 m = new Method02();

		int sum = m.sum(num1, num2);
		System.out.println("sum = " + sum);

		int sub = m.sub(num1, num2);
		System.out.println("sub = " + sub);

		int mul = m.mul(num1, num2);
		System.out.println("mul = " + mul);

		long div = m.div(num1, num2);
		if (div == -999999) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println("div = " + div);
		}

		long rem = m.rem(num1, num2);
		if (rem == -999999) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println("rem = " + rem);
		}
		
		
	}
	
}
