package day06;

import java.util.Arrays;

public class Array07 {

	public static void main(String[] args) {
		// String 배열
		
		String strArr[] = new String[5];
		
		strArr[0] = "홍길동0";
		strArr[1] = "홍길동1";
		strArr[2] = "홍길동2";
		strArr[3] = "홍길동3";
		strArr[4] = "홍길동4";
		
		System.out.println(Arrays.toString(strArr));

		// 배열의 단점 : 배열의 길이는 고정
		// 배열의 데이터를 늘리는 경우 > 더 큰 배열을 만들어서 데이터를 옮겨줘야 함
		String strArr2[] = new String[strArr.length+3];
		System.out.println(Arrays.toString(strArr2));
		
//		// 배열 복사 : System.arraycopy(구배열, 구배열_시작번지, 신배열, 신배열_시작번지)
//		for (int i = 0; i < strArr.length; i++) {
//			strArr2[i]= strArr[i]; 
//		}
		System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(strArr2));
		
		// 원래 배열의 시작 주소를 새로 만든 배열의 주소로 변경
		strArr = strArr2; 
		strArr[5] = "홍길동5";
		System.out.println(Arrays.toString(strArr));
		System.out.println(Arrays.toString(strArr2));
		
	}

}
