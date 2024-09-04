package day09.review;

public class ObjectTask {
	// 클래스를 만드는 이유
	// 관련있는 정보를 클래스라는 보따리를 통해 통합관리하기 위해서
	// 같은 클래스라는 틀을 쓰는 객체들을 다룰 때
	// 같은 속성(멤버변수, 메서드,...)에 같은 이름으로 접근할 수 있기 때문이다.
	// -> 일괄 처리가 가능하다.
	
	// 멤버 변수
	String name;
	int age;
	
	
	
	public static void main(String[] args) {
		ObjectTask obj = new ObjectTask();
		obj.name = "홍길동";
		
		// obj에 담긴 주소값을 obj2에 복사하여 전달한다.
		ObjectTask obj2 = obj;
		
		// obj가 바라보는 대상과 obj2가 바라보는 대상이 같기 때문에
		// 그 속성값도 동일하다.
		System.out.println(obj2.name);
		
		
		
		
		
		
		
		// 원시 자료형
		// 참조 자료형
		
		int[] arr = {1, 2, 3};
		int[] arr2 = arr;
		
		arr[0] = 5; // {5, 2, 3}
		
//		System.out.println(arr2[0]); // 1? 5?
		
		
		
		
	}
	
	
	
	
}
