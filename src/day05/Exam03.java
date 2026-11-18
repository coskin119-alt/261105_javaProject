package day05;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		/* 
		 * 가위, 바위, 보 게임
		 * 
		 * 컴퓨터와 나와의 게임
		 * 컴퓨터는 랜덤으로 지정 (0, 1, 2)
		 * 0 : 가위, 1 : 바위, 2 : 보
		 * 
		 * 결과 : 무승부, 패배, 승리
		 *  
		 * */

		Scanner scan = new Scanner(System.in);
		
		String[] item = {"가위","바위","보"};
		String[] result = {"무승부", "패배", "승리"};

		// 결과 판정표 만들기
		int resultTable[][] = new int[3][3]; 

		// COM(가위)
		resultTable[0][0] = 0;	// 가위 => 무승부
		resultTable[0][1] = 2;	// 바위 => 승리
		resultTable[0][2] = 1;	// 보  => 패배
		
		// COM(바위)
		resultTable[1][0] = 1;	// 가위 => 패배
		resultTable[1][1] = 0;	// 바위 => 무승부
		resultTable[1][2] = 2;	// 보  => 승리
		
		// COM(보)
		resultTable[2][0] = 2;	// 가위 => 승리
		resultTable[2][1] = 1;	// 바위 => 패배
		resultTable[2][2] = 0;	// 보  => 무승부
		
		while (true) {
			
			// 컴퓨터 랜덤 값
			int inCom = (int)(Math.random()*3); 

			// 나의 값
			System.out.print("0-가위, 1-바위, 2-보, 3-종료 : 선택하세요. > ");
			int inMe = scan.nextInt();

			// 잘못된 선택 => 처음부터 다시
			if (inMe < 0 || inMe > 3) {
				System.out.println("잘못된 숫자를 선택하셨습니다.  다시하세요.");
				continue;
			}

			// 종료 
			if (inMe == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			System.out.println("COM(" + item[inCom] + ") / " + "ME(" + item[inMe] + ") = " + 
			                    result[resultTable[inCom][inMe]]);
			System.out.println("----------------------------------");
		}
		
		
		scan.close();
	}

}
