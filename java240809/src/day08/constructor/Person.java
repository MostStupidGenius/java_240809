package day08.constructor;

public class Person {
	
	String name;
	int age;
	
	// 생성자
	// 해당 클래스를 객체화할 때, 객체의 속성 정보를 객체화를 하면서
	// 그 값을 입력하기 위해 사용하는 '초기화 함수'이다.
	// 특수한 메서드로 분류된다.
	public Person() { // 매개변수를 받지 않는 -> 기본 생성자
		// 메서드의 일종이지만 생성자의 이름은 클래스의 이름과 동일해야 하고
		// return 타입을 적지 않아야 한다.
		
		// 생성자는 이미 돌려줄 값이 정해져있기 때문에
		// 반환하는 값을 정할 수 없는 것이다.
		// 돌려줄 값이란 바로 주소값을 의미한다.
	}
	
	public Person(String name, int age) {
		this.name = name;
		// this(name); // 현재 클래스의 생성자를 호출하는 this();
		this.age = age;
		// this
		// this는 해당 클래스를 객체화한 인스턴스의 주소를 가리키는 예약어로
		// 해당 객체의 속성이나 메서드(기능)을 사용할 때 쓰인다.
	}
	
	
	// 오버로딩(Overloading)
	// 같은 이름으로 메서드를 선언하는 것을
	// 오버로딩이라고 하며
	// 오버로딩의 조건은 전달하는 매개변수의 타입, 개수, 순서가 다르면
	// 서로 다른 메서드로 인식한다. 타입, 개수, 순서(시그니처)
	public Person(String name) {
		this.name = name;
		System.out.println(this.name);
	}
	
	
	public static void main(String[] args) {
		// 객체화, 인스턴스 호출
		Person hong = new Person();
		Person kim = new Person("김개똥", 30);
		
		System.out.println(kim.name);
		System.out.println(kim.age);
		
//		hong.name = "홍길동";
//		
//		Person hong2 = hong;
//		System.out.println(hong2.name);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
