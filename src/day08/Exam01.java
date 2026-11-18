package day08;

import java.util.Random;

public class Exam01 {

	Random random = new Random();
	
	// 1. 랜덤수를 리턴하는 메서드 (1 ~ 45)
	public int randomNum() {

		//return random.nextInt(45) + 1;	
		return (int)(Math.random() * 45) + 1;
	}
	
	public int randomNum(int begin, int end) {

		//return random.nextInt(end - begin + 1) + begin;		
		return (int)(Math.random() * (end - begin + 1)) + begin;
	}
	
	// 2. 배열과 정수를 매개변수로 받아 중복확인 하는 메서드
	public boolean equalCheck(int[] arr, int num) {
		boolean equal = false;
		
		for(int i=0; i<arr.length; i++) {
			if (num == arr[i]) {
				equal = true;
				break;
			}
		}
		
		return equal;		
	}
	
	// 3. 배열을 매개변수로 받아 랜덤수를 채워주는 (1,2 사용) 메서드
	public void makeLotto(int[] arr) {
		for(int i=0; i<arr.length; ) {
			int num = randomNum();
			if (!equalCheck(arr, num)) {
				arr[i++] = num; 
			}
		}
	}
	
	// 4. 배열을 출력하는 메서드
	//    - 사용자 번호 : 1 2 3 4 5 6
	//    - 당첨 번호  : 1 2 3 4 5 6 [7]
	public void printLotto(int[] arr) {
		boolean me = (arr.length == 6) ? true : false;

		System.out.print((me) ? "나의 번호 : " : "로또 번호 : ");
		for(int i=0; i<arr.length; i++) {
			System.out.print((i < 6) ? arr[i] + " " : "[" + arr[i] + "]");
		}
		System.out.println();
	}
	
	// 5. 당첨번호 확인하는 메서드 (바로 출력 됨)
	//    - 사용자번호, 로또번호를 받아서 등수를 리턴하는 메서드
	public void printLotto(int[] usr, int[] lotto) {

		int num = 0;
		boolean bonus = false;
		
		System.out.println("--------------------------");
		System.out.print("당첨 번호 : ");
		for(int i=0; i<lotto.length; i++) {
			if (equalCheck(usr, lotto[i])) {
				if (i < 6) {
					num++;
					System.out.print(lotto[i] + " ");
				} else {
					bonus = true;
					System.out.print("[" + lotto[i] + "] ");
				}
			}
		}
		if (num == 0) System.out.print("없음");
		
		System.out.print(" >>> ");
		switch (num) {
		case 3 :
			System.out.print(" 5등에 당첨되셨습니다. ");
			break;
		case 4 :
			System.out.print(" 4등에 당첨되셨습니다. ");
			break;
		case 5 :
			System.out.print(bonus ? " 2등에 당첨되셨습니다. " : " 3등에 당첨되셨습니다. ");
			break;
		case 6 :
			System.out.print(" 1등에 당첨되셨습니다. ");
			break;
		default :
			System.out.print(" 낙첨 되었습니다. ");
			break;
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// 로또 만들기

		Exam01 methods = new Exam01();

		int usr[] = new int[6];
		int lotto[] = new int[7];

		// 나의 번호, 로또 번호 만들기
		methods.makeLotto(usr);
		methods.makeLotto(lotto);

		// 나의 번호, 로또 번호 출력
		methods.printLotto(usr);
		methods.printLotto(lotto);
		
		// 당첨내역 출력
		methods.printLotto(usr, lotto);
		System.out.println("--------------------------");
		
	}

}
