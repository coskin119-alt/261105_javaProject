package day01;

public class Exam02 {

	public static void main(String[] args) {
		// kor, eng, math 점수 입력하고 합계와 평균을 출력 
		// 각 점수는 0~100 => 벗어나면 "점수가 잘못 입력 되었습니다."
		// Pass : 평균이 60점 이상이면 합격 아니면 불합격 (if문으로)

		boolean verify = true;

		int kor  = 60;
		int eng  = 60;
		int math = 60;
		
		// 과목별 점수가 유효 범위인지를 보고
		if (kor  < 0 || kor  > 100) verify = false;
		if (eng  < 0 || eng  > 100) verify = false;
		if (math < 0 || math > 100) verify = false;

		// 무효 점수가 포함되어 있으면 "점수가 잘못 입력 되었습니다."
		if (verify == false) {
			System.out.println("점수가 잘못 입력 되었습니다.");
		} else {
			// 합계와 평균울 구하고
			int    sum = kor + eng + math;
			double avr = (double)sum / 3;

			// 합계, 평균, 합격여부 표시
			System.out.println("합계 = " + sum);
			System.out.println("평균 = " + avr);
			System.out.println(avr >= 60 ? "합격" : "불합격");
		}
		
	}

}
