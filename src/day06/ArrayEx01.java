package day06;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 정수배열[5] 생성후
		// 정수(1~5) 저장 출력
		
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; 
		}
		System.out.println(Arrays.toString(arr));
		
		// 섞기 (자리 바꿈) : 기존 자리의 값은 임시공간에 저장해야함.
//		int tmp = arr[0];
//		arr[0] = arr[2];
//		arr[2] = tmp;

		for (int i = 0; i < arr.length; i++ ) {
			// 랜덤으로 번지를 선택해서 섞음
			int index = (int)(Math.random()*arr.length);
			
			// 교환
			int tmp = arr[i];
			arr[i]= arr[index]; 
			arr[index]= tmp; 
		}
		System.out.println(Arrays.toString(arr));

		// 다시 원래대로 정렬 (선택정렬)
		// 오름차순 => 작은것부터 큰것순으로
		// 내림차순 => 큰것부터 작은것 순으로

		// 내림차순
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

		// 오름차순 : sort는 오름차순 정렬만 가능
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		

	}

}
