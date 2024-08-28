package day07.forPractice;

import java.util.Scanner;

public class ForPracticeDone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int height = sc.nextInt();
		star(height);
		star2(height);
	}

	public static void star(int height) {
		int half = height;
		for (int i = 1; i <= half; i++) {
			System.out.printf("%s%s\n", 
					" ".repeat(half - i), 
					"*".repeat(i * 2 - 1)
					);
		}
		for (int i = half - 1; i > 0; i--) {
			System.out.printf("%s%s\n", 
					" ".repeat(half - i), 
					"*".repeat((i * 2) - 1)
					);
		}
	}
	
	public static void star2(int height) {
		height *= 2;
		// 상단 삼각형
		for (int i = 1; i <= height / 2 + 1; i++) {
			System.out.print(" ".repeat(height / 2 + 1 - i)); // 공백 출력
			System.out.print("*".repeat(2 * i - 1)); // 별 출력
			System.out.println();
		}

		// 하단 삼각형
		for (int i = height / 2; i >= 1; i--) {
			System.out.print(" ".repeat(height / 2 + 1-i)); // 공백 출력
			System.out.print("*".repeat(2 * i - 1)); // 별 출력
			System.out.println();
		}
	}

}
