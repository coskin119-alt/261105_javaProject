package day11;

import java.util.Scanner;

public class CardMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		CardPack cardPack = new CardPack();
		
//		int cardNum = 52;
		
//		Card[] cards = new Card[cardNum];

		// 카드 제작
		System.out.println("카드 팩을 만들었습니다.");
		cardPack.makeCardPack();
		cardPack.displayCardPack();
		System.out.println("----------------------------------------------------");

		while (true) {

			// 카드를 섞는다.
			System.out.println("카드를 섞었습니다.");
			cardPack.shuffleCardPack();
			cardPack.displayCardPack();
			System.out.println("----------------------------------------------------");
			
			// 메뉴 선택
	    	System.out.print("[1] 게임 시작   [2] 게임 종료   메뉴를 선택하시오. > ");
	    	String 	menu = scan.next();
			System.out.println("----------------------------------------------------");
	    	if (menu.equals("2")) {
	    		break;
	    	}
			
			// 프레이어 4명에게 5장씩 카드를 나눠준다.
			System.out.println("카드를 나누어줍니다.");
	    	cardPack.distributeCard();
			System.out.println("----------------------------------------------------");
			
			// 카드를 오픈합니다.
			System.out.println("카드를 오픈합니다.");
			cardPack.displayPlayerCard();
			System.out.println("----------------------------------------------------");
			
			// 카드를 회수합니다.
			System.out.println("카드를 회수합니다.");
			System.out.println("----------------------------------------------------");
		}
		System.out.println("카드 게임이 종료되었습니다.");
		System.out.println("----------------------------------------------------");
		
		scan.close();
	}

}
