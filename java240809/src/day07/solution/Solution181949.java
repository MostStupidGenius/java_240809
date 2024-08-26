package day07.solution;

import java.util.Scanner;

public class Solution181949 {
	// 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
	// 각 알파벳을 대문자는 소문자로
	// 소문자는 대문자로 변환해서
	// 출력하는 코드를 작성해 보세요.
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // aBcDeFg
//        solution1(str);
        System.out.println();
//        solution2(str);
        
    }
	
	public static void solution2(String str) {
		// 두번째 방법
        // 대문자로 바꾸는 메서드
        // 소문자로 바꾸는 메서드 활용
        // 두 문자의 아스키코드 상의 거리를 이용하여 코드 작성
        for (int i = 0; i < str.length(); i++) {
        	// 주어진 문자열의 i번째 문자열을 임시로 담을 변수
			char temp = str.charAt(i);
			// char 값은 정수로 표현되기 때문에
			// char끼리 그 크기를 비교해서
			// 범위를 나타낼 수도 있다.
			if('a' <= temp && 'z' >= temp) {
				// 소문자인 경우 대문자로 바꾸기
				// => 모든 문자를 대문자로 바꿔주는 메서드
				System.out.print((temp + "") // 어떤 자료형이든 문자열로 바꿀 때는
						// + "" -> 문자열과 다른 자료형을 더하면
						// 연산이 아니라 연결이 된다-> 문자열로 바뀐다.
						.toUpperCase());
			} else if('A' <= temp && 'Z' >= temp){
				// String.valueOf()메서드는
				// 전달받은 자료형의 값을 문자열로 바꿔주는 기능을 한다.
				System.out.print(String.valueOf(temp).toLowerCase());
			}
		}
	}
	
	public static void solution1(String str) {
        // 아스키코드상 대문자와 소문자 사이의 거리
        int gap = 'a' - 'A'; // 32
        
        // 첫번째 방법
        // 두 문자의 아스키코드 상의 거리를 이용하여 코드 작성
        for (int i = 0; i < str.length(); i++) {
        	// 주어진 문자열의 i번째 문자열을 임시로 담을 변수
			char temp = str.charAt(i);
			// char 값은 정수로 표현되기 때문에
			// char끼리 그 크기를 비교해서
			// 범위를 나타낼 수도 있다.
			if('a' <= temp && 'z' >= temp) {
				System.out.print((char)(temp-gap));
			} else if('A' <= temp && 'Z' >= temp){
				System.out.print((char)(temp+gap));
			}
		}

	}
	

}
