package day02.basic;

public class TransForm {

	public static void main(String[] args) {
		// 형변환
		// 주로 숫자형 자료형끼리 일어나는 현상인데
		// 서로 타입이 다른 숫자형 자료형끼리 연산을 하면
		// 하나의 타입으로 바꿔야 한다.
		// 더 큰 범위의 숫자형 자료형으로 바뀌는 것을
		// (자동)형변환이라 한다.
		int num = 'A';
		System.out.println(num);
		
		// 강제 형변환
		// 큰 범위의 자료형에서 작은 범위의 자료형으로
		// 그 값을 옮기고자 할 때,
		// 데이터의 손실이 일어날 가능성이 있기 때문에
		// 이러한 데이터의 손실을 감수하고도
		// 형변환을 할 것인지 묻는다 -> 오류
		// 데이터의 손실을 감수하더라도 형변환하겠다고
		// 도장을 찍는 게 바로 강제 형변환이다.
		int num2 = (int) 4100000000L;
		System.out.println(num2);
	}

}
