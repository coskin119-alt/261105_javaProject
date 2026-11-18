package day09;

import java.util.Arrays;
import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		// 초기 생성자
//		TvClass tv = new TvClass();
		TvClass tv = new TvClass(5);
		System.out.println("-------------------------------------------------------------");
		
		// 메뉴 출력
		eXit : while(true) {
			tv.printInfo();
			System.out.println("-------------------------------------------------------------");
	    	System.out.println("[0]전원  [1]채널▲  [2]채널▼  [3]볼륨▲  [4]볼륨▼  [5]즐겨찾기  [9]종료");
			System.out.println("-------------------------------------------------------------");
			System.out.print("버튼을 선택하시오. > ");
	    	int button = scan.nextInt();

	    	// 버튼 기능 실행
	    	switch (button) {
	    	case 0:
	    		tv.powerButton();
	    		break;
	    	case 1:
	    		tv.upDownChannel(true);
	    		break;
	    	case 2:
	    		tv.upDownChannel(false);
	    		break;
	    	case 3:
	    		tv.upDownVolume(true);
	    		break;
	    	case 4:
	    		tv.upDownVolume(false);
	    		break;
	    	case 5:
	    		tv.setChoice();
	    		break;
	    	case 9:
	        	System.out.println("프로그램이 종료되었습니다.");
	    		break eXit;
	    	default:
	    		System.out.println("등록되지 않은 버튼을 선택하셨습니다.");
	    		break;	
	    	}

			System.out.println("-------------------------------------------------------------");
		}
		
		scan.close();
	}

}


class TvClass {
	// brand, power, ch, vol, 즐겨찾기(5개)
	
	/*
	 * 건호채널 등록
	 * 5개까지만 등록
	 * 1. 선호채널 등록 메서드 : 현재 채널 번호를 선호채널 배열에 넣기
	 * 2. 선호채널 리스트 보기 : 등록된 선호 채널을 리스트로 출력
	 * 
	 */

	private int		maxCh 		= 30;
	private int		maxVol		= 10;
	
	private final 	String 	BRAND = "LG";
	private boolean power;
	private int    	ch;
	private int		vol;
	private int[]	choice;
	private int		choicePos;
	
	@Override
	public String toString() {
		return "TvClass [maxCh=" + maxCh + ", maxVol=" + maxVol + ", BRAND=" + BRAND + ", power=" + power + ", ch=" + ch
				+ ", vol=" + vol + ", choice=" + Arrays.toString(choice) + ", choicePos=" + choicePos + "]";
	}

	// 기본 생성자
	public TvClass() {}
	
	// 매개변수로 초기값을 제공
	public TvClass(int maxChoice) {
		this.ch     = 3;
		this.vol    = 3;
		this.choice = new int[maxChoice];
	}
	
	public void printInfo() {
		System.out.println("브랜드명 : " + BRAND);
		System.out.println("전원상태 : " + (power ? "ON" : "OFF"));
		System.out.println("현재채널 : " + ch  + " / 범위 (0 ~ " + maxCh  + ")");
		System.out.println("현재볼륨 : " + vol + " / 범위 (0 ~ " + maxVol + ")");
		System.out.println("즐겨찾기 : " + Arrays.toString(choice));
	}
	
	public void powerButton() {
		this.power = !this.power;
		System.out.println(this.power ? "TV 전원을 켰습니다." : "TV 전원을 껐습니다.");
	}
	
	public void upDownChannel(boolean up) {
		if (!power) {
			System.out.println("SORRY : TV 전원이 꺼져있습니다");
			return;
		}
		
		if (up) {
			if (ch == maxCh)
			{
				ch = 0;
			}else {
				ch++;
			}
		}else {
			if (ch == 0)
			{
				ch = maxCh;
			}else {
				ch--;
			}
		}
		System.out.println("현재채널 : " + ch  + " / 범위 (1 ~ " + maxCh  + ")");
	}
	
	public void upDownVolume(boolean up) {
		if (!power) {
			System.out.println("SORRY : TV 전원이 꺼져있습니다");
			return;
		}

		if (up) {
			if (vol < maxVol) {
				vol++;
			}else {
				System.out.println("SORRY : 볼륨이 최대 상태입니다.");
			}
		}else {
			if (vol > 0) {
				vol--;
			}else {
				System.out.println("SORRY : 볼륨이 묵음 상태입니다.");
			}
		}
		System.out.println("현재볼륨 : " + vol + " / 범위 (0 ~ " + maxVol + ")");
	}
	
	public void setChoice() {
		if (!power) {
			System.out.println("SORRY : TV 전원이 꺼져있습니다");
			return;
		}

		// 채널 0 등록불가 한것으로 설정함.
		if (ch == 0) {
			System.out.println("SORRY : 채널 0는 즐겨찾기 등록불가 입니다.");
			return;
		}

		// 즐겨찾기 갯수 점검 => 꽉 찬 상태이면 등록불가
		if (choicePos >= choice.length) {
			System.out.println("SORRY : 채널 즐겨찾기가 꽉 찼습니다.");
			return;
		}

		// 기등록된 채널인지 확인
		for (int i=0; i<choice.length; i++) {
			if (choice[i] == ch) {
				System.out.println("SORRY : 이미 등록된 채널 입니다.");
				return;
			}
		}
		
		// 즐겨찾기 등록
		choice[choicePos++] = ch;
	}
	
}
	
	
