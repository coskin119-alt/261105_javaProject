package day03;

public class While01 {

	public static void main(String[] args) {
		// While 문 : while(조건식) { 실행문 }

		for (int i = 1; i <= 10; i++)
		{
			System.out.println(i);
		}
		
		
		int i = 1;
		while (i <= 10) {
			if ((i % 2) == 0)
			System.out.println(i);
			i++;
		}
		
		i = 1;
		while (true) {
			if ((i % 2) == 0)
			System.out.println(i);
			i++;
			
			if (i > 10) break;
		}
		
		
	}

}
