package day05;

public class String01 {

	public static void main(String[] args) {
		// String Class : 문자열을 다루기 위한 클래스 => 참조자료형 
		// class : 해당 기능을 가지고 있는 정의서
		// 클래스타입 객체명 = new 클래스타입();
		// String : 워낙 자줐는 클래스라서 기본자료형처럼 제공
		// String str = new String(); => 가능하지만 잘 쓰지 않음
		
		String string = "abc d efg h";
		// String은 한 문자열을 배열로 넣었다고 생각
		// length : 총길이 => 공백포함
		System.out.println(string.length());

		// charAt(index) : index 위치의 문자를 반환
		System.out.println(string.charAt(4));
		
		// substring : 원하는 문자열을 추출
		System.out.println(string.substring(6));	// 시작값을 주면 끝까지
		System.out.println(string.substring(6, 9));	// endindex(미포함) 전까지

		// equals() : 두 문자열이 같은지 비교 (대소문자 구분)
		System.out.println(string.substring(0,3).equals("abc"));	// true 리턴
		
		// indexOf() : 문자의 위치 (index)를 찾아주는 기능
		// 한 문자열에서 같은 단어가 여러개라면 처음 일치하는 index를 리턴
		// 찾는 문자가 없으면 -1 리턴
		// 시작 위치를 정할수 있음
		System.out.println(string.indexOf("abc"));
		System.out.println(string.indexOf("abc", 3));	// index 부터 찾는다
		System.out.println(string.indexOf("z"));		// -1 

		// lastIndexOf() : 뒤에서 부터 찾음
		System.out.println(string.lastIndexOf("c"));	// 2
		
		// ex: email 에서 id만 추출
		String email = "coskin119@gmail.com"; 
		int atPos = email.indexOf("@");
		String emailId = email.substring(0,atPos);
		System.out.println(emailId);
		System.out.println(email.substring(0, email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
		
		// compatrTo : str.compareTo("abc");
		// 사전순으로 기준값이 비교값보다 앞에 있으면 -, 같으면 0, 뒤에 있으면 +
		System.out.println("z".compareTo("c"));	// 23 => z는 c보다 23자 뒤에 있다
		
		// contains() : 해당 문자를 포함하고 있는지 확인 => true / false
		System.out.println(string.contains("abc"));	
		
		// concat : 이어붙이기 (+ 연산자와 같은의미)
		System.out.println("abc".concat("def"));	
		System.out.println("abc" + "def");	
		
		// 
		
		
	}

}
