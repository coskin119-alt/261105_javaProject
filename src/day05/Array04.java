package day05;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		System.out.println(Arrays.toString(arr));
		System.out.println("------------------------------------");

		// 합계 계산
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		// 합계와 평균 출력
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + sum / (double)arr.length);
		System.out.println("------------------------------------");
		
		// 최소값, 최대값
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) min = arr[i];
			if (arr[i] > max) max = arr[i];
		}
		System.out.println("최소 = " + min);
		System.out.println("최대 = " + max);
		System.out.println("------------------------------------");
		
		// 최소값, 최대값
		min = arr[0];
		max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}
		System.out.println("최소 = " + min);
		System.out.println("최대 = " + max);
		System.out.println("------------------------------------");
		
	}

}
