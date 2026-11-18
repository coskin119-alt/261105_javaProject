package day07;

import java.util.Scanner;

public class Exam01 {

	public int arrSum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) sum += a[i];
		return sum;
	}

	
	public double arrAvr(int[] a) {

		return arrSum(a)/(double)a.length;
	}
	
	
	public void printAvr(String head, Double a) {
		System.out.print(head);
		System.out.printf("%.2f\n", a);
	}

	
	/*
	 * 문자 배열을 숫자 배열로 변환
	 */
	public int[] strArrToIntArr(String[] chrArr) {
		
		int[] numArr = new int[chrArr.length];
		for(int i=0; i<chrArr.length; i++) {
			numArr[i] = Integer.parseInt(chrArr[i]);
		}
		
		return numArr;
	}
	
	
	/*
	 * 문자 배열, 숫자 배열을 입력받아서 문자 배열을 숫자 배열에 채우는 메서드
	 */
	public void strArrToIntArr2(String[] str, int[] num) {
		// 입력 문자 배열이 비었을때 
		if (str == null || str[0] == null || str.length <= 0) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		
		// 문자 배열보다 숫자 배열이 작을 때
		if (str.length != num.length) {
			System.out.println("배열을 처리할 수 없습니다.");
			return;
		}
		
		for(int i=0; i<str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 * 숫자를 입력받아 입력받은 숫자의 합계와 평균을 출력
		 * 12345 => 1+2+3+4+5
		 * String 으로 입력받아 한자리 수로 분해
		 * 
		 * 반복 (0 또는 음수이면 종료)
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		Exam01 arrCal = new Exam01();

		while(true) {
			// 숫자열 입력
			System.out.print("숫자를 입력하세요. (0 또는 음수이면 종료) > ");
			String numStr = scan.next().trim();
			System.out.println("-------------------------");
			String[] numChr = numStr.split("");
			int[] numArr = new int[numChr.length];
			
			// 종료 조건 확인
			//if (numStr.charAt(0) == '-') break;
			if (numChr[0].equals("-")) break;
			if (numChr[0].equals("0") && numChr.length == 1) break;

			// 숫자로 변환
//			for(int i=0; i<numChr.length; i++) {
//				numArr[i] = Integer.parseInt(numChr[i]);
//			}
//			numArr = arrCal.strArrToIntArr(numChr);
			arrCal.strArrToIntArr2(numChr, numArr);
			
			// 합계 및 평균 출력
			System.out.println("SUM = " + arrCal.arrSum(numArr));
			arrCal.printAvr("AVR = ", arrCal.arrAvr(numArr));
			
			System.out.println("-------------------------");
		}
		System.out.println("프로그램이 종료되었습니다. !! ");
		
		scan.close();
	}

}
