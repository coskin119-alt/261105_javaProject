package day01;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;

		switch (number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		default:
			System.out.println("이상한수");
			break;
		}

		// 숫자 만큼 전진
		switch (number) {
		case 1:
			System.out.println("1칸전진");
			break;
		case 2:
			System.out.println("2칸전진");
			break;
		case 3:
			System.out.println("3칸전진");
			break;
		case 4:
			System.out.println("4칸전진");
			break;
		case 5:
			System.out.println("5칸전진");
			break;
		case 6:
			System.out.println("6칸전진");
			break;
		default:
			System.out.println("재입력");
			break;
		}

		switch (number) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			System.out.println(number + "칸전진");
			break;
		default:
			System.out.println("재입력");
			break;
		}

		int month = 11;

		// 3~5 : 봄
		// 6~8 : 여름
		// 9~11 : 가을
		// 12~2 : 겨울

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월 : " + "봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월 : " + "여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월 : " + "가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월 : " + "겨울");
			break;
		default:
			System.out.println("재입력");
			break;
		}

	}

}
