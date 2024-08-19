package day03.whileTask;

import java.util.Scanner;

public class WhileTask1 {

	public static void main(String[] args) {
		// while문
		// 몇번을 반복해서 코드를 실행할지 모를 때
		// 조건식이 만족하는 동안(while)에 코드를 반복적으로 실행한다.
		Scanner sc = new Scanner(System.in);
		
		int num1 = 10;
		
//		while(num1 <= 100) {
//			num1 += 1;
//			if(num1 % 2 == 0) { // num1이 짝수이면
//				continue;
//			}
//			System.out.println(num1); // 11, 13, 15,..., 99, 101 출력
//		}
		
		while(true) {
			// 탈출 조건식
			if(num1 > 100) break;
			num1++;
			// 짝수라면 건너뛰기
			if(num1 % 2 == 0) {
//				System.out.println("짝수");
				continue;
			}
			// 홀수라면 출력
			System.out.println(num1);
		}
		
//		do-while문
//		do {실행할코드} while(조건식)
//		최초 1회는 조건식과 무관하게 반드시 1회는 실행이 된다.
		// 선택지를 입력받는 변수
		int choice = -1;
		do { // 최초 1회는 조건식을 검사하지 않고 실행된다.
			// 입력 안내문
			System.out.print("0이상의 숫자 입력 >> ");
			// 선택값을 입력받는다.
			choice = sc.nextInt();
			// 만약 선택값이 0이 아니라면
			// 선택값을 출력한다.
			if(choice != 0) System.out.println(choice);
		} while (choice >= 0); // 선택값이 0 이상인 경우에는 계속 반복한다.
		// 선택값이 0 미만이면 반복종료
		System.out.println("시스템 종료");
		
	}

}
