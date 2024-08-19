package day02.basic;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		if문을 활용해서 아래 문제를 풀어보자.
//		0 ~ 100까지의 점수 중 하나를 입력 받아서
//		Scanner 사용
//		100 ~ 90 -> A를 출력
//		89 ~ 80 -> B를 출력
//		79 ~ 70 -> C를 출력
//		69점 이하는 F출력
//		점수 입력 받기
		System.out.print("정수 입력 >> ");
		int score = sc.nextInt();

		// 1단계
		if (100 >= score && 90 <= score) {
			System.out.println("A");
		} else if (90 > score && 80 <= score) {
			System.out.println("B");
		} else if (80 > score && 70 <= score) {
			System.out.println("C");
		} else if (70 > score) {
			System.out.println("F");
		}

//		2단계
		if (90 <= score) {
			// score가 90이상인 경우
			System.out.println("A");
		} else if (80 <= score) {
			// score가 90미만이고, 80 이상인 경우
			System.out.println("B");
		} else if (70 <= score) {
			// score가 80미만이고, 70 이상인 경우
			System.out.println("C");
		} else {
			// score가 70미만인 경우
			System.out.println("F");
		}
		
		// 학점 알파벳을 담을 변수
		// 점수가 70점 미만인 경우에는
		// 모두 F이기 때문에 미리 넣어둔다.
		// 만약 70점 이상의 다른 알파벳을 받아 변수의 값이 바뀌면
		// F가 아닌 값이 들어갈 것이고
		// 70점 이상이 아니어서 변경이 없다면
		// F가 그대로 남아있을 것이다.
		String scoreStr = "F";
//		3단계
		if (90 <= score) {
			scoreStr = "A";
		} else if (80 <= score) {
			scoreStr = "B";
		} else if (70 <= score) {
			scoreStr = "C";
		}
		
		// 일괄 처리
		System.out.println(scoreStr + "학점입니다.");
		

//		심화(선택) 삼항 연산자를 활용해서 위 문제를 풀어보자.
//		String is70up = (score >= 70 ? "C" : "F");
//		String is80up = (score >= 80 ? "B" : is70up);
//		scoreStr = score >= 90 ? "A" : is80up;
		scoreStr = score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : "F"));
//		System.out.println(score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : "F")) + "학점입니다.");
		System.out.println(scoreStr + "학점입니다.");
		
		switch(scoreStr) {
		case "A":
			System.out.println("상위 10%입니다.");
			break;
		case "B":
			System.out.println("조금만 더 노력하세요.");
			break;
		case "C":
			System.out.println("공부는 했나요?");
			break;
		default:
			System.out.println("재수강");
		}
		
//		switch(score) {
//		case 100: case 99: case 98: // ...
//			scoreStr = "A";
//			break;
//		case 89: case 88: case 87: //...
//			scoreStr = "B";
//			break;
//		default:
//			scoreStr = "F";
//		}
		
		
		
		
		
		
	}

}
