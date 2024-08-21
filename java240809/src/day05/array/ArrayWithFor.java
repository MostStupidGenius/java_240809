package day05.array;

public class ArrayWithFor {

	public static void main(String[] args) {
		// 반복문 for문을 이용해 배열의 요소에 접근하는 방법
		int[] arrInt1 = {1, 3, 7, 1, 2};
		
		for (int i = 0; i < arrInt1.length; i++) {
			// 배열 arrInt1의 각 요소에 순차적으로 접근하여
			// 그 값을 출력하는 프로그램
//			System.out.println(arrInt1[i]);
		}
		
		
		// 100개의 방을 가진 배열 생성(배열의 길이가 100이다)
		int[] arrIntLength = new int[100];
		
		// 0부터 99까지(배열의 길이만큼)의 수를 각각의 방에 대입하여
		// 배열을 채워넣는 반복문
		for (int i = 0; i < arrIntLength.length; i++) {
			arrIntLength[i] = i;
		}
		
		// 배열의 값을 출력하는 반복문
		for (int i = 0; i < arrIntLength.length; i++) {
			if(i>0) {
				if(arrIntLength[i-1] % 2 == 0) {
					// 이전 요소가 짝수라면
					continue; // 다음 반복으로 이동
				}
			}
			System.out.println(i);
		}
		
		// foreach문
		// 배열과 같은 여러 값이 나열된 자료구조에 사용할 수 있는 반복문으로
		// 각 요소를 변수 하나에 담아 반복문 내의 코드를 반복적으로 실행하는
		// 요소에 대한 반복문이다.
		// 각 요소에 대해서 독립적으로 코드를 실행해야 할 때 주로 사용된다.
		for (int e : arrIntLength) {
//			System.out.println(e); // 요소의 값 출력
		}
		
		// 반면에 for문으로 배열을 다루는 경우는
		// i번째 반복에서 i-1이나 i+1처럼 앞뒤 요소에 대한 정보가 필요할 때
		// 사용된다.
		
		
		
		
		
	}

}
