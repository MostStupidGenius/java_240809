package day02.basic;

public class OperatorAlt {

	public static void main(String[] args) {
//		복합 할당 연산자
//		할당 연산자(=)와 사칙연산이 결합된 형태이다.
		
		int num = 3;
//		num = num + 2;
		num += 2;
		num -= 2;
		num *= 3;
		num /= 2;
		num %= 2;
		
//		증감연산자
//		기존 변수에 1을 더하거나 빼는 연산을 한 뒤 대입
//		값의 사용도 된다.
		num = 3;
		num++; // num += 1; // 4
		
//		전위 연산자
//		더한 다음에 사용
		System.out.println(++num);
		// 1이 더해져서 5 출력 후 num에는 5가 들어간다.
		
//		후위 연산자
//		사용 후 더한다
		System.out.println(num++);
		// 4 출력 후 num에 5가 들어있다.
		
		
		
	}

}
