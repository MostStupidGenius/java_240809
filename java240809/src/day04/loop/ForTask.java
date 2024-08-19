package day04.loop;

public class ForTask {

	public static void main(String[] args) {
		// For문
		// 반복할 횟수를 개발자가 알고 있거나
		// 컴퓨터가 알고 있을 때 사용하는 반복문이다.
		// for(초기식;조건식;증감식;){}
//		for (int i = 0; i < 10; i+=2) {
//			System.out.println(i);
//		}

		// 문제1. 0부터 99까지의 숫자 중,
		// 짝수만 출력하는 프로그램 작성
		int length = 100;

//		for (int i = 0; i < length; i++) {
//			if (i % 2 == 0 && i != 0) { // 짝수인 경우
//				System.out.println(i);
//			}
//		}
//
//		for (int i = 0; i < length; i++) {
//			System.out.println(i++);
//		}

		for (int i = 0; i < length; i++) {
			System.out.print(i % 3 == 0 && i != 0 ? i + "\n" : "");
		}

//		int i = 0;
//		while(i < length) {
//			if(i%2==0) { // 짝수인 경우
//				System.out.println(i);
//			}
//			i++;
//		}

	}

}
