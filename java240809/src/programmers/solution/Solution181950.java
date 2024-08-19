package programmers.solution;

import java.util.Scanner;

public class Solution181950 {

	public static void main(String[] args) {
		/* 문자열 str과 정수 n이 주어집니다.
		 * str이 n번 반복된 문자열을 만들어
		 * 출력하는 코드를 작성해 보세요.
		 * */
        Scanner sc = new Scanner(System.in);
//        String str = "string";
//        int n = 5;
        String str = sc.next();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
			System.out.print(str);
		}
        
        while(n-->0) {
        	System.out.print(str);
        }
        
//        String 클래스에 있는 메서드
        // 문자열 n번 반복하기
        // str.repeat(n)
        // str문자열을 n번 반복한 새로운 문자열을 생성하는 메서드
        System.out.println(str.repeat(n));
        
        
        
        
        
        
        
//        System.out.println(result.equals("stringstringstringstringstirng"));
    }

}
