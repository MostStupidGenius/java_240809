package day03.ifTask;

import java.util.Scanner;

public class SwitchTask2 {

	public static void main(String[] args) {
		// switch문
		// 검사할 변수를 조건으로 하여
		// 그 변수의 값이 특정 값(상수)일 경우(case)
		// 해당 경우의 위치에서 코드를 실행하여 아래로 흘러내린다.
		Scanner sc = new Scanner(System.in);
		
		
		// 멜론등급
		// 1등급 음악듣기 무제한, 다운로드 무제한
		// 2등급은 음악 다운로드 30곡
		// 3등급은 음악 듣기 10곡
		// 무료 등급은 무료듣기 1분
		// 상위 등급은 하위 등급의 혜택을 모두 포함한다.
		
		// 입력 안내
		System.out.print("등급(1~4)입력>>");
		
		// 등급을 담을 변수
		int grade = sc.nextInt();
		
		switch(grade) {
			case 1: case 11: case 21: // grade가 1인 경우
				System.out.println("음악듣기 무제한, 다운로드 무제한");
			case 2: // grade가 2인 경우
				System.out.println("음악 다운로드 30곡");
			case 3: // grade가 3인 경우
				System.out.println("음악 듣기 10곡");
				break; // 흐름을 끊고 소속된 코드블록을 탈출하는 명령어
			default:
				System.out.println("무료 듣기 1분");	
		}
		
		if(grade == 1) {
			System.out.println("음악듣기 무제한, 다운로드 무제한");
		} else if(grade == 2) {
			System.out.println("음악 다운로드 30곡");
		} else if(grade == 3) {
			System.out.println("음악 듣기 10곡");
		}else {
			System.out.println("무료 듣기 1분");	
		}
		
		
		
		
		
		
		
		
	}

}
