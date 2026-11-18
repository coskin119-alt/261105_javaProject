package day06;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색어를 포함하는 파일이 없으면 => 일치하는 항목이 없습니다.
		// String search = scan.next(); // 한단어 입력

		Scanner scan = new Scanner(System.in);

		String[] fileName = {
				"이것이자바다.java","Java의정석.java","array.txt",
				"array.java","String.txt","StringMethod.jpg",
				"ArrayMethod.jpg","method.png","javaMethod.png"
		};

		// System.out.println(Arrays.toString(fileName));
		for (int i = 0; i < fileName.length; i++) {
			System.out.print(fileName[i] + "  ");
			if ((i % 3) == 2) System.out.println();
		}
		System.out.println("------------------------------------");
		
		System.out.print("검색어를 입력하세요. > ");
		String search = scan.next().toLowerCase();
		System.out.println("");
		
		int count = 0;
		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].toLowerCase().contains(search)) {
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
