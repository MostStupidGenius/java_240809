package day02.basic;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
//		스캐너
//		키보드를 통해 값을 입력 받기 위해 사용하는 도구
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 >>");
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		System.out.print("실수 입력 >>");
//		double numDouble = sc.nextDouble();
//		System.out.println(numDouble);
		
//		문자열 입력받기
//		System.out.print("아무거나 입력 >> ");
//		// 공백 혹은 줄바꿈으로 구분하여 입력받음
//		String inputStr = sc.next();
//		System.out.println(inputStr);
//		String inputStr2 = sc.next();
//		System.out.println(inputStr2);
//		String inputStr3 = sc.next();
//		System.out.println(inputStr3);
		
//		문자열 입력받기 -> 문장 입력받기
//		줄바꿈을 구분자로 하여 입력을 받는다.
		System.out.print("문장 입력 >> ");
		String inputText = sc.nextLine();
		System.out.println(inputText);
		
		sc.close();
	}

}








