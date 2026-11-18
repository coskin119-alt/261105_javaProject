package day10;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/*
		 * Product Class : 상품명, 가격
		 * Order Class : 상품명, 개수, 단가, 금액
		 */

		// Product[] menu = new Product[5] // 상품 리스트
		// 임의의 상품 등록
		// 주문 => order 객체 발생 => Order[] order = new Order[5];
		
		/*
		 * 1. 전체 제품 보여주기
		 * 2. 주문 > 제품명, 수량 입력받기
		 * 3. order 객체 생성 => 추가
		 * 4. 반복 주문 => 종료 키워드 생성 반복주문이 가능하도록
		 * 5. order => 배열이 다차면 배열 증가 (배열복사)
		 * 6. 주문 완료시 => 영수증 출력 (전체 주문내역 / 총지불금액)
		 * 
		 * 김밥  2  3000 = 6000
		 * 라면  3  5000 = 15000
		 * 사이다 2  500  = 1000
		 * ----------------------
		 * 총 지불금액 : 22000
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		Product[] 	products	= new Product[5];

		// 제품 등록
		products[0] = new Product("김밥", 		2500);
		products[1] = new Product("라면", 		3000);
		products[2] = new Product("잔치국수", 	2800);
		products[3] = new Product("비빔국수", 	2800);
		products[4] = new Product("콜라", 		900);
		
		// 주문 처리
		eXit: while (true) {
			// 메뉴 출력 : 제품 리스트 출력
			System.out.println("--------------------------------");
			System.out.println("선택\t메뉴\t가격");
			System.out.println("--------------------------------");
			
			for (int i=0; i<products.length; i++) {
				System.out.println("["+ (i+1) + "]\t" + products[i].getMenu() + "\t" + products[i].getPrice());
			}
			System.out.println("--------------------------------");
			System.out.println("[0] 주문 완료	[x] 종료");
			System.out.println("--------------------------------");
			
			// 새로운 손님에 대한 오더 진행
			int count = 0;
			Order[] orders = new Order[5];
			
			done: while (true) {
				
		    	System.out.print("메뉴 번호와 수량을 입력하세오. > ");
		    	String mStr	= scan.next();
		    	if (mStr.equals("0")) {
		    		break done;
		    	}
		    	if (mStr.equals("x")) {
		    		break eXit;
		    	}
		    	int mNum = scan.nextInt();
				
				// 주문 처리
		    	int mCode = Integer.parseInt(mStr) - 1;  // 0 ~ 4 => Menu Index
		    	
		    	// 중복 주문 확인
		    	boolean overlab = false;
		    	for (int i=0; i<count; i++) {
		    		if (orders[i].getMenu().equals(products[mCode].getMenu())) {
		    			overlab = true;
		    			orders[i] = new Order(products[mCode].getMenu(), 
		    					              orders[i].getNum() + mNum,
		    					              products[mCode].getPrice());
		    		}
		    	}
		    	if (!overlab) {
			    	orders[count++] = new Order(products[mCode].getMenu(), mNum, products[mCode].getPrice());
		    	}
			}

			// 주문 완료 => 영수증 출력
			int total = 0;
			System.out.println("--------------------------------");
			System.out.println("메뉴\t수량\t가격\t금액");
			System.out.println("--------------------------------");
			for(int i=0; i<orders.length; i++) {
				if (orders[i] != null) {
					orders[i].printOrder();
					total += orders[i].getAmount();
				}
			}
			System.out.println("--------------------------------");
			System.out.println("총 지불금액 : " + total);
		
		}
		
		// 프로그램 종료
		System.out.println("--------------------------------");
		System.out.println("프로그램이 종료되었습니다.");
		
		scan.close();
	}

}
