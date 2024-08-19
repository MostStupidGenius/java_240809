package day03.ifTask;

import java.util.Scanner;

public class IfTask2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 이상 정수 입력 >> ");
		int money = sc.nextInt();
		
		if(money>0) {// 주머니에 돈이 있는 경우
			if(money >= 3000) { // 금액이 만약 3000원 이상이라면
				System.out.println("택시"); // 택시 출력
			} else if(money < 3000) { // 금액이 3000원 미만이라면
				System.out.println("버스"); // 버스 출력
			}
		} else { // 돈이 없는 경우
			System.out.println("도보"); // 도보 이용 출력
		}
		
	}

}
