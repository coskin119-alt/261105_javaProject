package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		// 배열생성
		// 5명의 점수를 입력받기 (0~100)
		// 합게와 평균을 출력
		// 입력값의 범위가 벗어나면 다시 입력받기
		
	    Scanner scan = new Scanner(System.in);
	    
	    int sum = 0;
	    int score[] = new int[5];
	    
	    for (int i = 0; i < score.length;) {
	    	// 점수입력
	    	System.out.print("점수 입력 > ");
	    	int x = scan.nextInt();

	    	// 입력값 오류 확인 => 재입력
	    	if (x < 0 || x > 100) {
	    		System.out.println("범위를 벗어 났습니다. 다시 입력하세요");
	    		continue;
	    	}
	    	
	    	// 입력값 저장
    		score[i] = x;
    		sum += x;
    		i++;
	    }

		System.out.println(Arrays.toString(score));
	    System.out.println("합계 = " + sum);
	    System.out.println("평균 = " + sum/(double)score.length);
		
	    scan.close();	
    	
		

	}

}
