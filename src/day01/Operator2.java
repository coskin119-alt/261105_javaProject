package day01;

public class Operator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kor, eng, math 점수를 변수에 저장하고 
		// 세 점수의 합과 평균 출력
		
		int kor = 80;
		int eng = 82;
		int math = 91;
		
		int   sum = kor + eng + math;
		double avr = sum / 3.0;
		
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avr);
		
		System.out.println(avr > 85.0 ? "합격" : "불합격");
		
		

	}

}
