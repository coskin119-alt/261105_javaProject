package day06;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// 그림 파일만 출력 => .jpg, .png
		// 없으면 그림파일이 없음니다.


		Scanner scan = new Scanner(System.in);

		String[] fileName = {
				"이것이자바다.java","Java의정석.java","array.txt",
				"array.java","String.txt","StringMethod.Jpg",
				"ArrayMethod.jpg ","method.Png","javaMethod.png "
		};

		// System.out.println(Arrays.toString(fileName));
		for (int i = 0; i < fileName.length; i++) {
			System.out.print(fileName[i] + "  ");
			if ((i % 3) == 2) System.out.println();
		}
		System.out.println("------------------------------------");
		
//		System.out.print("검색어를 입력하세요. > ");
//		String search = scan.next().toLowerCase();
//		System.out.println("");
		
		int count = 0;
		for (int i = 0; i < fileName.length; i++) {
			// 파일 확장자 찾기
			int pos = fileName[i].lastIndexOf(".");
			String suffix = fileName[i].substring(pos+1).toLowerCase().trim();
			if (suffix.equals("jpg") || suffix.equals("png")) {
				System.out.println(fileName[i]);
				count++;
			}
		}
		
		System.out.println("------------------------------------");
		if (count > 0) {
			System.out.println(count + "개의 항목이 검색되었습니다.");
		} else {
			System.out.println("일치하는 항목이 없습니다.");
		}
		
		scan.close();
	}

}
