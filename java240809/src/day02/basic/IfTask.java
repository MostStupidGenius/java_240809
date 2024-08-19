package day02.basic;

import java.util.Scanner;

public class IfTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		(흐름)제어문 flow control statement
//		조건문
//		주어진 조건식에 따라서 코드를 실행하거나
//		건너뛰는 동작을 하는 문법이다.
		
		System.out.print("정수 입력 >> ");
		int inputNum = sc.nextInt();
		
//		if문
		if(inputNum > 3) {
			System.out.printf("%d는 3보다 크다\n", inputNum);
		}
		
//		if else
		if(inputNum > 3) {
			System.out.printf("%d는 3보다 크다 2트\n", inputNum);
		} else {
			System.out.printf("%d는 3보다 크지 않다\n", inputNum);
		}
		
//		if else if
		if(inputNum >= 5) {
			System.out.println(inputNum);
		} else if(inputNum == 5) {
			System.out.println("값이 같다.");
		} else {
			System.out.println("5보다 작다.");
		}
		
		
		
		
		
		
		
//		switch문
		
		
		
		
		
		
		
		
		
		
		
	}

}
