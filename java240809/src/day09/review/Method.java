package day09.review;

public class Method {

	public static void main(String[] args) {
		// 메서드를 값으로 볼 줄 알아야 한다.
		int addedNum = add(3, 5);
		System.out.println(addedNum * 2); // 16
	}
	
	// 두 정수를 받아서 그 합(정수)을 반환하는 기능
	public static int add(int num1, int num2) {
		int result = 0;
		result = num1 + num2;
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	

}
