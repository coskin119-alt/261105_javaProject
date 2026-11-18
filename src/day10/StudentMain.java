package day10;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] students = new Student[5];
		
		students[0] = new Student("홍길동1", "010-1111-0001", "인천", "2026-11-11");
		students[1] = new Student("홍길동2", "010-1111-0002", "서울", "2026-11-11");
		students[2] = new Student("홍길동3", "010-1111-0003", "인천", "2026-11-11");
		students[3] = new Student("홍길동4", "010-1111-0004", "서울", "2026-11-11");
		students[4] = new Student("홍길동5", "010-1111-0005", "인천", "2026-11-11");

		System.out.println("---------------------------------------------------");
		System.out.println("학생명\t전화번호\t\t주소\t생년월일");
		System.out.println("---------------------------------------------------");

		students[0].printStudent();
		students[1].printStudent();
		students[2].printStudent();
		students[3].printStudent();
		students[4].printStudent();

		System.out.println("---------------------------------------------------");
		for (int i=0; i<students.length; i++) {
			if (students[i].getAddress() != null && students[i].getAddress().equals("인천")) {
				students[0].printStudent();
			}
		}
		
		
		
		
	}

}
