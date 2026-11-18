package day10;

import java.text.DecimalFormat;

public class Report {

	// 한사람 성적 클래스
	// 멤버변수 : 이름, 국어, 영어, 수학, 합계, 평균, 등수
	// 생성자 : 이름, 국어, 영어, 수학 => 매대변수로 등록
	// 기본생성도 같이 오버로딩 해서 생성
	// 합계, 평균 계산
	
	/* DecimalFormat
	 * # : 선택 해당 자리수가 있으면 출력 없으면 안함.
	 * 0 : 필수 해당 자리수 
	 * 
	 * import java.text.DecimalFormat;
	 * 		DecimalFormat df2 = new DecimalFormat("##.00");
	 *		System.out.println(df2.format(number));
	 * 
	 */

	private	String	name;
	private	int		kor;
	private	int		eng;
	private	int		math;
	private	int		sum;
	private	double	avg;
	private	int		rank;
	
	// 기본 생성자
	public Report() {}
	
	// 매개변수로 초기값을 제공
	public Report(String name, int kor, int eng, int math) {
		this.name   = name;
		this.kor	= kor;
		this.eng	= eng;
		this.math	= math;
		this.sum	= kor + eng + math;
		this.avg	= this.sum / 3.0;
		this.rank 	= 1;
	}

	@Override
	public String toString() {
        DecimalFormat df2 = new DecimalFormat("##.00");
		String avgStr = df2.format(avg);
		return "Report [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg="
				+ avgStr + ", rank=" + rank + "]";
	}

	
	public void printReport() {
        DecimalFormat df2 = new DecimalFormat("##.00");

		System.out.print(name + "\t");
		System.out.print(kor  + "\t");
		System.out.print(eng  + "\t");
		System.out.print(math + "\t");
		System.out.print(sum  + "\t");

//		System.out.printf("%.2f\t", avg);
        System.out.print(df2.format(avg) + "\t");
    	
		System.out.println(rank);
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
