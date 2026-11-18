package day09;

import java.util.Scanner;

public class Class03 {

	public static void main(String[] args) {
		// 클래스 생성
		// 학생이름, 국어점수, 영어점수, 수학점수르 객체로 하는 클래스 생성
		// 이름 (국어, 영어, 수학) => 출력메서드
		// 메서드를 호출하면 국어+영어+수학 리턴되는 합계메서드
		// 메서드를 호출하면 합계/3 평균이 리턴되는 평균 메서드
		// 각각 매개변수의 getter/setter 생성

		Scanner scan = new Scanner(System.in);

		// 인원수 입력
    	System.out.print("전체 인원수를 입력하시오. > ");
    	int member = scan.nextInt();
		System.out.println("---------------------------------------------------");

		// 인원수 만큼 객체 생성 
		StudentClass[] members = new StudentClass[member];
		for(int i=0; i<members.length; i++) {
			members[i] = new StudentClass();

			// 학생 정보 입력
	    	System.out.print("이름 국어 영어 수학 입력하시오. > ");
	    	String 	name	= scan.next();
	    	int 	kor		= scan.nextInt();
	    	int 	eng		= scan.nextInt();
	    	int 	math	= scan.nextInt();
	
	    	// 학생 정보 입력
	    	members[i].makeMember(name, kor, eng, math);
		}

		// 전체 학생 성적표 출력
		System.out.println("---------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		System.out.println("---------------------------------------------------");

		for(int i=0; i<member; i++) {
			// 등수 계산
			for(int j=0; j<member; j++) {
				if(members[i].getAvg() < members[j].getAvg()) {
					members[i].setRank(members[i].getRank()+1);
				}
			}
			

			// 성적표 출력
			members[i].printMember();
		}
		System.out.println("---------------------------------------------------");
		
		scan.close();
	}

}


class StudentClass {
	
	// 멤버변수
	private String	name;
	private int    	kor;
	private int    	eng;
	private int    	math;
	private int    	sum;
	private double 	avg;
	private int    	rank;

	// 생성자
	
	// Getter
	public String 	getName() 	{	return this.name;	}
	public int 		getKor()  	{	return this.kor;	}
	public int 		getEng()  	{	return this.eng;	}
	public int 		getMath()	{	return this.math;	}
	public int 		getSum()	{	return this.sum;	}
	public double	getAvg()	{	return this.avg;	}
	public int 		getRank()	{	return this.rank;	}

	// Setter
	public void 	setName(String name) 	{	this.name = name;	}
	public void 	setKor(int kor)  		{	this.kor  = kor;	}
	public void 	setEng(int eng)  		{	this.eng  = eng;	}
	public void 	setMath(int math)		{	this.math = math;	}
//	public void 	setSum(int sum)			{	this.sum  = sum;	}
//	public void 	setAvg(double avg)		{	this.avg  = avg;	}
	public void 	setRank(int rank)		{	this.rank = rank;	}

	// 멤버메서드
	public void makeMember(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor  = kor;
		this.eng  = eng;
		this.math = math;
		this.sum  = kor + eng + math;
		this.avg  = this.sum / 3.0;
		this.rank = 1;
	}
	
	public void printMember() {
		System.out.print(name + "\t");
		System.out.print(kor  + "\t");
		System.out.print(eng  + "\t");
		System.out.print(math + "\t");
		System.out.print(sum  + "\t");
    	System.out.printf("%.2f\t", avg);
    	System.out.println(rank);
	}
	
}
