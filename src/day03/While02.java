package day03;

public class While02 {

	public static void main(String[] args) {
		// 1~50 까지 짝수만 출력 10씩 끊어서
		
		int num = 1;
		
		while (true) {
			
			if ((num % 2) == 0) System.out.print(num + ((num % 10) != 0 ? "\t" : "\n"));
			if (num == 50) break;	else num++;
		}

		System.out.println("------------------------------------------");
		
		num = 1;
		int count = 0;
		while (num <= 50) {
			if ((num % 2) == 0) {
				System.out.print(num + "\t");
				
				if (++count == 5) {
					count = 0;
					System.out.println();
				}
			}
			
			num++;
		}
		
		
		
		
	}

}
