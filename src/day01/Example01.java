package day01;

public class Example01 {

	public static void main(String[] args) {
		// % : 나머지를 나타내는 연산자
		// number 의 수가 짝수인 홀수 인지 출럭
		
		int num = 101;
		int mod = 0;
		String ret = "";
		
		mod = num % 2;
		ret = (mod != 0) ? "홀수" : "짝수";
		
		System.out.println(ret);


		
		
	}

}
