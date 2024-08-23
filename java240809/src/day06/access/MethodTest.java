package day06.access;

public class MethodTest {
	// 계산기
	// 두 정수를 입력받아서 사칙연산을 하는
	// 메서드 네 개를 작성하라.
	// 덧셈
	static int add(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}
	// 뺄셈
	static int sub(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		return result;
	}
	
	// 곱셈
	static int multi(int num1, int num2) {
		int result = 0;
		result = num1 * num2;
		return result;
	}
	
	// 나눗셈
	static int divide(int num1, int num2) {
		int result = 0;
//		result = num1 / num2;// 나눗셈은 0으로 나눌 때
		// 오류가 발생하므로,
		// 분모가 0인 경우 0을 반환하도록 처리
//		result = num2==0 ? 0 : num1 / num2;
		if(num2 == 0) {
			result = 0;
			return 0;
			// return으로 값을 반환하면
			// 메서드는 반환하는 기능을 수행하고 종료되기 때문에
			// return 아래에 존재하는 코드는 실행되지 않는다.
		} else {
			result = num1 / num2;
			return result;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(add(3, 5)); // 8
		System.out.println(sub(8, 3)); // 5
		System.out.println(multi(5, 5)); // 25
		System.out.println(divide(27, 2)); // 13
		System.out.println(divide(3, 0)); // 0
		
		
		
		
		
		
		
		
		
		
	}

}
