package day07.solution;


public class Solution120808 {

	public static void main(String[] args) {
		for (int e : solution(1, 2, 3, 4)) {
			System.out.println(e);
		}
		for (int e : solution(9, 2, 1, 3)) {
			System.out.println(e);
		}
	}
	
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		/*
		 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 
		 * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
		 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 
		 * 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		 * */
		int[] answer = {};
		
		int gongtong = 1;
		// 분자1과 분모2를 곱한 값과 분자2와 분모1을 곱한 값을 더해서 -> 통분
		int numer = numer1 * denom2 + numer2 * denom1;
		// 분모끼리의 곱을 나눈 다음
		int denom = denom1 * denom2;
		
		// 분모와 분자의 최대공약수를 구하는 부분
		for (int i = 1; i < denom; i++) {
			if (numer % i == 0 && denom % i == 0) {
				// 1부터 분모-1까지의 값을 분자와 분모가 각각 나눴을 때
				// 그 값이 0이라면 해당 i의 배수라는 의미이므로
				// 분자와 분모가 i의 공통배수라면
				// i는 공약수가 된다는 의미이고
				// 1에서 분모-1까지 진행되므로
				// 최대 공약수를 구하는 코드인 것이다.
				gongtong = i;
			}
		}
		// 최대공약수로 나눠주는 부분 -> 약분
		numer /= gongtong;
		denom /= gongtong;
		
		// 분자가 분모의 배수인 경우
		if(numer%denom==0){
			// 분모와 분자를 모두 분모로 나누어 준다.
			numer /= denom;
			denom /= denom;
		} else if(denom%numer==0) {
			numer /= numer;
			denom /= numer;
		}
		answer = new int[] { numer, denom };
		return answer;
	}

}
