package day11;

public class CardPack {
	/*
	 * 52장의 card 객체를 배열로 저장 pack
	 * 
	 */
	/*
	 * 멤버변수 : 52장의 Card 객체를 담을수 있는 배열 + 번지
	 * - 생성자 : Pack의 초기값을 52장의 카드로 초기화
	 * - 메서드
	 * 
	 * 1. 카드를 섞는 기능
	 * 2. 플레이어에게 한장씩 나눠주는 기능
	 * 3. 카드를 초기화 기능 (나눠진 카드 회수)
	 * 
	 */

	private int cardNum 	= 52;
	private int playerNum 	= 4;
	private int gameCards 	= 5;
	
	private Card[] 		cards 	= new Card[cardNum];
	private Card[][] 	player 	= new Card[playerNum][gameCards];
	
	public CardPack() {};
	
	public void makeCardPack() {
		for (int i=0; i<4; i++) {
			// 모양 : ♠ ◆ ♥ ♣ 
			String shape = (i == 0) ? "♠" : (i == 1) ? "♦" : (i == 2) ? "♥" : "♣";
			
			// 숫자
			for (int num=1; num<=13; num++) {
				int pos = (i*13) + (num-1); 
				cards[pos] = new Card(shape, num);
			}
		}
	}
	
	public void shuffleCardPack() {
		for (int i = 0; i < cardNum; i++ ) {
			// 랜덤으로 번지를 선택해서 섞음
			int index = (int)(Math.random()*cardNum);
			
			// 교환
			Card cardRandom = cards[index];
			Card cardTemp = cards[i];
			cards[i]= cardRandom; 
			cards[index]= cardTemp; 
		}
	}
	
	public void displayCardPack() {
		for (int i=0; i<4; i++) {
			for (int num=1; num<=13; num++) {
				int pos = (i*13) + (num-1); 
				cards[pos].printCard();
			}
			System.out.println();
		}
	}
	
	public void distributeCard() {
		int pos = 0;
		for (int i=0; i<gameCards; i++) {
			for (int j=0; j<playerNum; j++) {
				player[j][i] = cards[pos++];
			}
		}
	}
	
	public void displayPlayerCard() {
		for (int i=0; i<playerNum; i++) {
			System.out.print("Player[" + (i+1) + "] ");
			for (int j=0; j<gameCards; j++) {
				player[i][j].printCard();
			}
			System.out.println();
		}
	}
	
}
