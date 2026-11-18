package day08;

import java.util.Arrays;

import day07.Exam01;		// 다른 패키지의 메서드를 참조할 경우

public class Method05 {

	// 배열을 받아 오름차순 정렬하는 메서드
	public void ascendArr(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	// 배열을 받아 내림차순 정렬하는 메서드
	public void descendArr(int[] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[j] > arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}

	// 배열을 받아 최대값을 리턴하는 메서드
	public int minArr(int[] arr) {
		int min = arr[0];

		for (int num : arr) {
			if (num < min) min = num;
		}
		
		return min;
	}

	// 배열을 받아 최대값을 리턴하는 메서드
	public int maxArr(int[] arr) {
		int max = arr[0];

		for (int num : arr) {
			if (num > max) max = num;
		}

		return max;
	}

	// 배열을 받아 합계를 리턴하는 메서드
	public int sumArr(int[] arr) {
		if (arr == null || arr.length == 0)
		{
			System.out.println("배열이 비어 있습니다.");
			return -999999;
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}
	
	// 배열을 받아 합계를 리턴하는 메서드
	public double avgArr(int[] arr) {
		if (arr == null || arr.length == 0)
		{
			System.out.println("배열이 비어 있습니다.");
			return -999999;
		}
		
		return sumArr(arr)/(double)arr.length;
	}
	
	// 배열을 받아 출력하는 메서드
	public void printArr(int[] arr) {
		if (arr == null || arr.length == 0)
		{
			System.out.println("배열이 비어 있습니다.");
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		/* 메서드 생성
		 * 1. 배열을 받아서 출력하는 메서드
		 * 2. 배열을 받아 오름차순 정렬하는 메서드
		 * 3. 배열을 받아 합계, 평균, 최소, 최소 출력 메서드
		 *    - 합계와 평균은 다른 메서드 호출하여 day07.Exam01 
		 */

		Exam01 eXam = new Exam01();		// 다른 패키지의 메서드를 참조할 경우 import 필수
		Method05 method05 = new Method05();

		int[] arr = {99,98,97,96,95,94,93,92,91};

		// 배열을 받아서 출력하는 메서드
		method05.printArr(arr);
		
		// 배열을 받아 오름차순 정렬하는 메서드
		Arrays.sort(arr);
		method05.printArr(arr);
		
		// 배열을 받아 내림차순 정렬하는 메서드
		method05.descendArr(arr);
		method05.printArr(arr);
		
		// 배열을 받아 오름차순 정렬하는 메서드
		method05.ascendArr(arr);
		method05.printArr(arr);
		
		// 배열을 받아 합계, 평균, 최소, 최소 출력 메서드
		int sum = eXam.arrSum(arr);
		System.out.println("SUM = " + sum);
		sum = method05.sumArr(arr);
		System.out.println("SUM = " + sum);
		double avg = eXam.arrAvr(arr);
		System.out.println("AVG = " + avg);
		avg = method05.avgArr(arr);
		System.out.println("AVG = " + avg);
		int min = method05.minArr(arr);
		System.out.println("MIN = " + min);
		int max = method05.maxArr(arr);
		System.out.println("MAX = " + max);

	}

}
