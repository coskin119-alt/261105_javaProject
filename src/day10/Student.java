package day10;

public class Student {
	/*
	 * 학생정보를 관리하기 위한 클래서 생성
	 * 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
	 * 학원정보 : 학원명(final) = "더조은", 지점 = "부평"
	 * 수강정보 : 수강과목[], 기간[](2026.11.02 ~ 27.05.17) : 수강과목은 5개
	 * 
	 * 홍길동, 0101-1111-1111, 인천 000506
	 * 더조은, 인천지점
	 * AI 풀스택 , 26.11.02 ~ 27.05.17
	 * JAVA, 26.11.11 ~ 26.12.11 => 추가되는 정보
	 * 
	 * 과목을 추가하는 메서드
	 * - 수강과목이 5개를 넘어가면 배열을 늘려서 처리 (중복가능)
	 * 각 정보를 출력하는 메서드
	 * - 수강정보 출력시 수강정보가 없다면 => 수강정보가 없습니다.
	 * 
	 * 
	 */
	
	private	String	name;
	private String	phone;
	private String	address;
	private String	birthday;
	
	private final	String	COMPANY = "더조은";
	private String[]	branch;
	private String[] 	subject;
	private String[] 	period;

	// 기본 생성자
	public Student() {}
	
	// 매개변수로 초기값을 제공
	public Student(String name, String phone, String address, String birthday) {
		this.name   	= name;
		this.phone		= phone;
		this.address	= address;
		this.birthday	= birthday;
	}
	
	// 매개변수로 초기값을 제공
	public void insertSubject(String branch, String subject, String period) {
		int size = 0;
		if (branch != null) {
			size = subject.length();
		}
		
		String[] arrBranch 	= new String[size+1];
		String[] arrSubject = new String[size+1];
		String[] arrPeriod 	= new String[size+1];

		System.arraycopy(this.branch,  0, arrBranch,  0, size);
		System.arraycopy(this.subject, 0, arrSubject, 0, size);
		System.arraycopy(this.period,  0, arrPeriod,  0, size);
		
		arrBranch[size]  = branch;
		arrSubject[size] = subject;
		arrPeriod[size]  = period;
		
		this.branch   	= arrBranch;
		this.subject	= arrSubject;
		this.period		= arrPeriod;
	}
	
	// 학생정보 출력
	public void printStudent() {
		System.out.print(name 		+ "\t");
		System.out.print(phone  	+ "\t");
		System.out.print(address 	+ "\t");
		System.out.print(birthday	+ "\t");
		System.out.println();
	}
	
	// 수강정보 출력
	public void printSubject() {
		System.out.println("---------------------------------------------------");
		System.out.println("학원명\t지점명\t강좌명\t수강기간");
		System.out.println("---------------------------------------------------");

		if (subject.length == 0) {
			System.out.println("수강정보가 없습니다.");
		}else {
			for (int i=0; i<subject.length; i++) {
				System.out.print(COMPANY 	+ "\t");
				System.out.print(branch[i]  + "\t");
				System.out.print(subject[i] + "\t");
				System.out.print(period[i]	+ "\t");
				System.out.println();
			}
		}
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String[] getBranch() {
		return branch;
	}

	public void setBranch(String[] branch) {
		this.branch = branch;
	}

	public String[] getSubject() {
		return subject;
	}

	public void setSubject(String[] subject) {
		this.subject = subject;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}
	
	
	

}
