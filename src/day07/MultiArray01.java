package day07;

import java.util.Arrays;

public class MultiArray01 {

	public static void main(String[] args) {
		// 다차원 배열
		/*
		 * 배열타입[행] 배열명 = 1차원 배열 {1, 2, 3}
		 * 배열타입[행][열] 배열명 = 2차원 배열 { {1, 2, 3}, {4, 5, 6} }
		 * 배열타입[면][행][열] 배열명 = 3차원 배열 { { {1, 2, 3}, {4, 5, 6} }, { {1, 2, 3}, {4, 5, 6} }, { {1, 2, 3}, {4, 5, 6} } }
		 * 
		 * 2차원 배열에서 arr.length => 행 갯수  / arr[i].length => i행의 열 갯수
		 * 
		 */
		
		int[][] arr = {
				{1, 2, 3},	// 0번 행
				{4, 5, 6}	// 1번 행
		};
		
		System.out.println(Arrays.toString(arr));
	}

}
