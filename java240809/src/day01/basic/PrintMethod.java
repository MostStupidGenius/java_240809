package day01.basic;

public class PrintMethod {

	public static void main(String[] args) {
		// 출력문
		// System.out.println();
		System.out.println("Hello, World!");
		// 클래스를 대문자로 시작하는 이유
		// 행동(메서드)을 하는 주체(클래스)가
		// 영어 문법에서 가장 먼저 오기 때문에
		// 클래스는 대문자로 작성한다.
		
//		출력문의 종류
//		println
//		전달된 값의 마지막에 줄바꿈을 추가하여 출력하는 출력문이다.
//		값을 전달하지 않으면, 콘솔에 줄바꿈을 출력한다.
		System.out.println("줄바꿈이 포함된 println");
		System.out.println(); // 줄바꿈만 출력한다.
		
//		print
//		전달된 값을 줄바꿈없이 출력하는 출력문이다.
		System.out.print("줄바꿈이 없는 출력문");
		System.out.print("그래서 이어서 출력된다.");
		
//		printf
//		전달된 텍스트의 포맷에 맞게 값을 배치하여
//		출력해준다.
//		서식문자를 활용하여 넣고자 하는 값을 서식문자가 위치한
//		자리에 입력되게끔 할 수 있다.
//		서식문자의 종류
//		- %s : String(문자열)
//		- %c : char(문자)
//		- %d : int(정수)
//		- %f : float, double(실수)
		System.out.println("\n============");
		System.out.printf(
				"%-5s는\tString값\n"
				+ "%c는\tchar값\n"
				+ "%3d는\tint값\n"
				+ "%.2f는\tfloat값\n"
				, "문자열"
				, 'c'
				, 30
				, 3.5);
		
		System.out.printf("%d원%d\n", 3000, 2000+1000);
		System.out.println(3000 + "원" + (2000+1000));
		
	}

}





