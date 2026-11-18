package day06;

//import java.util.Arrays;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 야구 게임
		/*
		 * 컴퓨터가 랜덤으로 3자리의 숫자를 생성
		 * 각자리의 숫자는 0~9 중 랜덤숫자 => 중복 불가
		 * 배열로 저장
		 * 
		 * 유저는 3자리를 맞추는 게임
		 * 위치와 숫자가 맞으면 strike
		 * 숫자만 맞으면 ball
		 * 숫자도 안맞으면 out
		 * 
		 * ex) com  : 1 2 3
		 *     user : 1 9 8 => 1s
		 *            7 8 9 => out
		 *            2 3 8 => 2b
		 *            1 2 5 => 2s
		 *            1 2 3 => 정답 and Break
		 */
		
		Scanner scan = new Scanner(System.in);

		// 중복없는 숫자 3개 정의
		int com[] = new int[3];

//		// 1 ~ 9 정수 배열
//		int tmp[] = new int[9];
//		for(int i=0; i<tmp.length; i++) {
//			tmp[i] = i + 1; 
//		}
//		System.out.println(Arrays.toString(tmp));
//
//		// 배열 섞기 9회
//		for(int i=0; i<tmp.length; i++ ) {
//			// 랜덤으로 번지를 선택해서 섞음
//			int index = (int)(Math.random()*tmp.length);
//			
//			// 교환
//			int ttt = tmp[i];
//			tmp[i] = tmp[index]; 
//			tmp[index]= ttt; 
//		}
//		System.out.println(Arrays.toString(tmp));
//
//		// 배열 복사
//		System.arraycopy(tmp, 0, com, 0, com.length);
//		System.out.println(Arrays.toString(com));

		// 중복없는 3개의 랜덤수 생성
		for(int i=0; i<com.length; i++) {
			com[i]= (int)(Math.random()*10);
			for (int j=0; j<i; j++) {
				if(com[i]== com[j]) {
					i--;
				}
			}
		}
		
		// 컴퓨터 랜덤 정수 출력
		System.out.println("----------------------------");
		System.out.println("COM  : " + com[0] + " " + com[1] + " " + com[2]);
		System.out.println("----------------------------");

		// 게임 진행
		int count = 0;
		while(true) {
			// User 숫자 입력 
			int usr[] = new int[3];
			
	    	System.out.print("0 ~ 9 에서 3개를 선택하시오. > ");
	    	usr[0] = scan.nextInt();
	    	usr[1] = scan.nextInt();
	    	usr[2] = scan.nextInt();
			System.out.println("USER  : " + usr[0] + " " + usr[1] + " " + usr[2]);

			// 게임 결과 만들기
			int b=0, s=0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<com.length; j++) {
					if(usr[i] == com[j]) {
						if(i == j) {
							s++;
						}
						else {
							b++;
						}
					}
				}
			}
			
			// 결과 출력
			count++;
			if(b==0 && s==0) {
				System.out.println("결과 : Out !! ");
			}else if(s==3) {
				System.out.println("결과 : 정답 !! " + count + "회 성공");
				break;
			}else {
				System.out.println("결과 : " + s + "s  " + b + "b");
				System.out.println("----------------------------");
			}
		}
		
		scan.close();
	}

}
