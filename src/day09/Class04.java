package day09;

import java.util.Scanner;

public class Class04 {

	public static void main(String[] args) {
		// 기능 : 시동켜기/끄기, 속도up, 속도down
		// power, speed
		// name, year

		Scanner scan = new Scanner(System.in);

//		CarClass car = new CarClass();
		CarClass car = new CarClass("카니발", 2026);

		car.printInfo();
		
		// 메뉴 출력
		eXit : while(true) {
			System.out.println("---------------------------------------------------");
	    	System.out.println("[0]제한속도  [1]시동  [2]가속10  [3]감속10  [9] 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("버튼을 선택하시오. > ");
	    	int button = scan.nextInt();

	    	// 버튼 기능 실행
	    	switch (button) {
	    	case 0:
	    		int limit = scan.nextInt();
	    		car.setLimit(limit);
	    		break;
	    	case 1:
	    		car.power();
	    		break;
	    	case 2:
	    		car.speedUp();
	    		break;
	    	case 3:
	    		car.speedDown();
	    		break;
	    	case 9:
	        	System.out.println("프로그램이 종료되었습니다.");
	    		break eXit;
	    	default:
	    		System.out.println("등록되지 않은 버튼을 선택하셨습니다.");
	    		break;	
	    	}
		}
    	System.out.println("---------------------------------------------------");
		
		scan.close();
	}
	
}


class CarClass {
	// 기능 : 시동켜기, 시동끄기, 속도up, 속도down
	// power, speed
	// name, year

	private int 	limit = 120;
	
	private String 	name;
	private int 	year;
	private boolean	power;
	private int 	speed;

	// 생성자 : 멤버변수 아래에 위치
	/*
	 * 객체를 생성할 때 (new) 가 초기값을 지정해주는 역할
	 * 기본생성자 : 컴파일러가 자동으로 제공 (컴파일시 생성자가 없는 경우에)
	 * - object = null , 숫자 = 0, boolean = false
	 * - 다른 생성자가 존재하면 자동으로 주지 않음
	 * 기본생성자는 사용자가 직접 생성가능
	 * 
	 */
	
	// 기본 생성자
	public CarClass() {}
	
	// 매개변수로 초기값을 제공
	public CarClass(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	
	public void printInfo() {
		System.out.println(name + "(" + year + "년식)");
	}
	
	// 시동 켜기/끄기
	public void power() {
		if (this.speed == 0)
		{
			this.power = !this.power;
			System.out.println(this.power ? "시동이 켜졌습니다." : "시동이 꺼졌습니다.");
		} else {
			System.out.println("경고 : 주행중에는 시동을 껄 수 없습니다.");
		}
	}
	
	// speed_up
	public void speedUp() {
		if (this.power) {
			if (this.speed < this.limit) {
				this.speed += 10;
				if (this.speed > this.limit) {
					this.speed = this.limit;
				}
				System.out.println("speed : " + speed + "km/h");
			}else {
				System.out.println("경고 : 제한속도 (" + limit + "km/h) 이상으로는 가속 불가합니다.");
			}
		}else {
			System.out.println("경고 : 시동이 꺼져있는 중에는 가속 불가합니다.");
		}
	}
	
	// speed_down
	public void speedDown() {
		if (this.power) {
			if (this.speed > 0) {
				this.speed -= 10;
				if (this.speed < 0) {
					this.speed = 0;
				}
				System.out.println("speed : " + speed + "km/h");
			}else {
				System.out.println("경고 : 정지상태에서는 더이상 감속 불가합니다.");
			}
		}else {
			System.out.println("경고 : 시동이 꺼져있는 중에는 감속 불가합니다.");
		}
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		if (!this.power) {
			System.out.println("경고 : 시동이 꺼져있는 중에는 제한속도 설정이 불가합니다.");
		}else if (this.speed > 0){
			System.out.println("경고 : 주행중에는 제한속도 설정이 불가합니다.");
		}else {
			this.limit = limit;
			System.out.println("제한속도는 " + limit + "km/h로 설정되었습니다.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
	
	
