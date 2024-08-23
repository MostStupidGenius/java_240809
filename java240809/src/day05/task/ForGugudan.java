package day05.task;

import java.util.Scanner;

public class ForGugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 최종 목표 : 구구단 출력
		// 문제1
		// 1부터 9까지 출력하는 프로그램 작성
		// 제약: for(i=0; i<9; i++) 고정
//		for (int i = 0; i < 9; i++) {
//			System.out.println(i+1);
//		}
		
		// for문 중첩하는 방법
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				System.out.println("i : "+ i + " j : "+ j);
//			}
//			System.out.println();
//		}
		
		// 문제2 기본 구구단 출력하기
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 3 = 6
		// ...
		// 9 x 9 = 81
//		for (int i = 2; i < 10; i++) {
//			for (int j = 0; j < 9; j++) {
//				int current = j+1;
////				System.out.printf("%d x %d = %d\n", i, current, i*current);
//				System.out.println(i + " x " + current + " = " + (i * current));
//			}
//		}
		
		// 문제3-1 정수(2~9)를 입력받아서
		// 해당 정수의 구구단 출력
//		System.out.print("정수(2~9)입력>> ");
//		int inputNum = sc.nextInt();
//		for (int i = 2; i < 10; i++) {
//			System.out.printf("%d x %d = %d\n", inputNum, i, inputNum * i);
//		}
		
		// 문제3-2 정수(2~9)를 입력받아서
		// 2단부터 해당 정수까지의 구구단 출력
//		System.out.print("정수(2~9)입력>> ");
//		int inputNum1 = sc.nextInt();
//		for (int i = 2; i <= inputNum1; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//			}
//		}
		
		
		// 문제4 정수(2~9)를 두 개 입력받아서
		// 두 정수단 사이의 구구단 출력
		// 예) 3, 5 입력받으면 
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 5 x 1 = 5
		// 5 x 2 = 10
		// ...
		// 5 x 9 = 45
		// 단, 먼저 입력되는 정수는 작은 수다.
//		System.out.print("작은 정수 입력>>");
//		int small = sc.nextInt();
//		
//		System.out.print("큰 정수 입력>>");
//		int big = sc.nextInt();
//		
//		for (int i = small; i <= big; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%2d x %2d = %2d\n", i, j, i*j);
//			}
//		}
		
		
		// 심화문제5 정수(2~9)를 두 개 입력받아서
		// 두 정수단 사이의 구구단 출력
		// 입력되는 두 수의 크기 순서는 앞의 수가 클 수 있다.
		// -> 두 수의 크기를 비교해서 작은수부터 큰수까지의 구구단을 출력해야 한다.
		
		System.out.print("정수 입력>>");
		int num1 = sc.nextInt();
		
		System.out.print("정수 입력>>");
		int num2 = sc.nextInt();
		
		int big = 0, small = 0;
		
		big = num1 > num2 ? num1 : num2;
		small = num1 > num2 ? num2 : num1;
		
//		if(num1 > num2) {
//			big = num1;
//			small = num2;
//		} else {
//			big = num2;
//			small = num1;
//		}
		
		for (int i = small; i <= big; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%2d x %2d = %2d\n", i, j, i*j);
			}
		}
		
		
	}

}
