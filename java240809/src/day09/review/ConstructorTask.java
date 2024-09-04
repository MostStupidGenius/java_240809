package day09.review;

public class ConstructorTask {
	String name;
	int age;
	
	// 기본 생성자
	public ConstructorTask() {
		this("", 0);
	}
	
	// 생성자
	// 특수한 메서드
	// 특징1: 반환 타입을 적을 수 없다.
	// -> 왜냐하면 반환할 값이 이미 정해져있기 때문이다.
	// 특징2: 메서드 이름은 소속된 클래스 이름으로 고정이다(대문자로 시작한다)
	
	// 생성자를 쓰는 이유
	// 생성자는 객체를 생성하면서 그 주소값을 반환하는 역할
	// 객체의 정보의 초기값과 여러가지 설정을 세팅하는 역할을 합니다.
	
	// 멤버 변수에 값을 세팅하는 생성자 만들기
	// 생성자의 오버로딩(overloading)
	// 메서드의 이름이 같더라도, 그 매개변수의 타입, 개수, 순서(시그니처)가 다르다면
	// 서로 다른 메서드로 인식하기 때문에
	// 같은 이름으로라도 선언할 수 있다.
	public ConstructorTask(String name, int age) {
		// 객체의 주소값을 가리키는 예약어 -> this
		this.name = name;
		this.age = age;
	}
	
	public ConstructorTask(String name) {
		this(name, 0);
	}
	
	public ConstructorTask(int age) {
		this("", age);
	}
	
	// 이름과 나이를 출력하는 기능
	public void printInfo() {
//		int age = 0; // 지역변수
		System.out.printf("이름: %s\n나이: %d", 
				name, age); // 지역변수에 같은 이름으로 만들어진 변수가 없기 때문에
		// this.을 명시하지 않아도 멤버변수를 가져온다.
		
		// scope(변수의 영역)
		// 메서드 안에서 선언된 변수는
		// 지역변수라고 부르며, 이 변수는 메서드 안에서만 통용된다.
		
		// 하지만 메서드 밖, 즉 클래스의 필드에 선언된 변수는
		// 클래스 내의 어디서든 접근할 수 있다.
		// 필드에 선언된 변수와 같은 이름으로 지역변수를 만들었다면
		// 해당 메서드 내에서 변수를 사용할 때는
		// 가장 가까운 변수를 가져온다.
	}
	
	public static void main(String[] args) {
		ConstructorTask p1 = new ConstructorTask();
		p1.name = "";
		p1.age = 3;
		
//		System.out.println(p1.name);
//		System.out.println(p1.age);
		
		ConstructorTask p2 = new ConstructorTask("철수", 20);
		p2.printInfo();
		System.out.println();
		p1.printInfo();
		
		
		
		
		
	}
}







