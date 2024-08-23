package day06.access;

public class MethodTask {
	
	//     반환타입 메서드이름(매개변수)
	static void printHello() { // 입력x 반환x 기능o
		// 수행할 기능을 작성할 코드 블록
		System.out.println("Hello world");
		// return
		// 반환할 값을 적어두는 곳이다.
		// 하지만, 반환할 값이 없다면(void)
		// return; -> 이걸 통해서 메서드를 일찍 종료할 수도 있다.
		return;
	}
	
	// 매개변수
	// 메서드를 수행하는 데 있어서 필요한 정보(값, 데이터)를
	// 입력받아서 사용하기 위해 저장하는 저장공간이다.
	static void printText(String text) { // 입력o 반환x 기능o
		System.out.println(text);
		return;
	}
	
	// 입력x 반환o
	static String getName() {
		String name = "이준상";
		return name;
	}
	
	// 입력o 반환o
	static int sum(int num1, int num2) {
		// 두 개의 정수를 받아서 그 합을 반환하는 기능
		int result = 0;
		result = num1 + num2;
		return result;
	}

	public static void main(String[] args) {
		// 입력x 반환x
		MethodTask.printHello();
		
		// 입력o 반환x
		MethodTask.printText("안녕하세요");
		
		// 입력x 반환o
		System.out.println(MethodTask.getName());
		
		// 입력o 반환o
		int a = MethodTask.sum(10, 5);
		System.out.println(a);
		
		
		
		
		
		
	}

}
