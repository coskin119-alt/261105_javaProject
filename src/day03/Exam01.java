package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up/down page
		// 1~50 까지 중 랜덤 수 하나를 컴퓨터가 생성 => user는 모름
		// user가 그 랜덤수를 맞추는 게임.
		// 컴퓨터가 랜덤수를 생성했습니다. (38)
		// 입력 > 30 => up
		// 입력 > 40 => down
		// 입력 > 38 => 정답 (3회) !! => 종료
		
		Scanner scan = new Scanner(System.in);
		
		int count = 0, number = 0;
		int random = (int)(Math.random()*100) + 1;

		//System.out.println("컴퓨터가 럼덤수를 생성했습니다. => Random = " + random);
		System.out.println("컴퓨터가 럼덤수를 생성했습니다. => Random = ??");
		System.out.println();
		
		do {
			System.out.print("예상하는 랜덤수를 입력하시오 > ");
			number = scan.nextInt();

			count++;
			System.out.println("입력 : " + number + " => " + 
			                   ((random > number) ? " Up " : (random < number) ? " Down " : " 정답 !! [" + count + "회]") );
			
		} while (number != random);
		
		
		scan.close();

	}

}
