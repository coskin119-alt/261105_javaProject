package day06;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 정수배열[10] : 랜덤수(0~100) 저장 => 출력
		
		int arr[] = new int[10];
		
		// 랜덤수 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*101); 
		}
		System.out.println(Arrays.toString(arr));
		
		// 오름차순으로 정렬 
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j] > arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

		// 오름차순으로 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

	}

}
