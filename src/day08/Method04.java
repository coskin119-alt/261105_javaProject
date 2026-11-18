package day08;

public class Method04 {

 
	public int[] getNumArr() {
		
		int[] num = new int[5];
		
		for(int i=0; i<5; i++) {
			num[i] = (int)(Math.random()*101);
		}
		
		return num;
	}
	
	
	public double getAvgArr(int[] arr) {
		if (arr == null || arr.length == 0)
		{
			System.out.println("배열이 비어 있습니다.");
			return -999999;
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}

		return sum/(double)arr.length;
	}
	
	
	public void printNumArr(int[] arr) {
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
		// 메서드 활용
		
		/*
		 * 1. 랜덤수 (0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드
		 * 2. 정수 배열을 받아 평균값을 리턴하는 메서드
		 * 	  - 단 정수 배열이 없거나, 갯수가 0이면 처리불가 (평균을 처리할 수 없습니다)
		 * 3. 정수 배열을 받아 출력하는 메서드
		 *    - 78 77 77 77 77 
		 */

		Method04 tester = new Method04();
		
		int[] arr = tester.getNumArr();

		tester.printNumArr(arr);

		double avg = tester.getAvgArr(arr);
		
		if (avg == -999999)	{
			System.out.println("평균을 처리할 수 없습니다");
		}else {
			System.out.println("평균 = " + avg);
		}

		
		
	}

}
