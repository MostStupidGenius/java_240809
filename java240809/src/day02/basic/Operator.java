package day02.basic;

public class Operator {

	public static void main(String[] args) {
//		연산자
//		특정 값에 대해서 연산 혹은 연결을 하는 특수한 문자
		
//		관계 연산자 - 이항연산자
//		any -> boolean
//		두 항(값, 변수, 상수)을 비교하여 그 결과를 반환하는 연산자
//		== 같다
		System.out.println("3 == 5 => " + (3 == 5));
		
//		!= 같지 않다
		System.out.println("3 != 5 => " + (3 != 5));
		
//		초과, 미만 (미포함)
		System.out.println("3 > 5 => " + (3 > 5));
		
//		이상, 이하 (포함)
		System.out.println("3 <= 5 => " + (3 <= 5));
		
		System.out.println("========논리 연산자==========");
//		논리 연산자 : bool -> bool
//		boolean 값을 비교하여 그 결과를 반환하는 연산자
//		부정 연산자 ! : 단항 연산자
		System.out.println(!true);
		
//		AND 연산자
//		두 값이 모두 참일 때 참
		System.out.println("true && true => " + (true && true));
		System.out.println("true && false => " + (true && false));
		
//		OR 연산자
//		둘 중 하나라도 참이면 참
		System.out.println("true || false => " + (true || false));
		
//		XOR 연산자
//		두 boolean 값이 서로 다를 때 참
		System.out.println("true ^ false => " + (true ^ false));
		
		System.out.println("===========사칙연산 + 나머지 연산===============");
//		사칙연산과 나머지 연산자
//		+, -
//		* 곱하기, / 나누기
		int num = 3;
		System.out.println("num * 3.5 => " + (num * 3.5));
		
//		나누기 주의
		System.out.println(10 / 3); // 3
		// 정수 (연산자) 정수 => 정수
		System.out.println(10.0 / 3); // 3.33
		
		System.out.println((int)10.0 / 3); // 3
		
//		0으로 나눌 수 없다.
//		System.out.println(10/0);
		
//		% 나머지
		System.out.println(10 % 3); // 1
		
		
		System.out.println("=============삼항 연산자=============");
		
//		삼항 연산자
//		조건식 ? 참일 경우 반환될 값 : 거짓일 경우 반환될 값
		int big = 3 > 5 ? 3 : 5;
		System.out.println(big);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
