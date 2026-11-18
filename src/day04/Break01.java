package day04;

public class Break01 {

	public static void main(String[] args) {
		// break : 반복문에서 빠져나오는 키워드 (조건문 동반)
		// continue : 반복문의 처음으로 이동
		// for, while에 이름(Label)을 붙이면 break label; 에서 해당 label이 사용된 for, while에 대한 break가 수행된다.
		
		int i=0, j=0, k=0;
		a: for (;;) {
			i++;
			b: for (;;) {
				j++;
				c: for (;;) {
					k++;
					
					if (k > 10) break c;
				}
				if (j > 10) break b;
			}
			if (i > 10) break a;
		}

	}

}
