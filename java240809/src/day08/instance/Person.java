package day08.instance;

public class Person {
	
	// 멤버변수, 인스턴스 변수
	String name;
	int age;
	
	// 클래스 변수, 공유 변수(shared)
	static int id;
	
	static { // 스태틱 블록
		// 프로그램이 실행될 때 인스턴스 블록보다
		// 먼저 실행되는 코드 블록이다.
		// 최초 1회 실행 이후에는 실행되지 않는다.
		// static이기 때문에 this 예약어를 사용할 수 없다.
		id = 0;
		System.out.println("static 블록 실행");
	}
	
	
	{ // 인스턴스 블록
		// 생성자를 호출하면, 생성자 내의 코드보다
		// 먼저 실행되는 코드 블록이다.
		// 새로운 객체를 생성할 때마다 호출되는 코드 블록이다.
		id++;
		this.name = "이름없음";
		System.out.println("인스턴스 블록 호출 : " + id);
	}
	
	public Person() {
		System.out.println("기본 생성자");
		}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("name age 생성자");
	}
	
	public static void main(String[] args) {
		Person hong = new Person();
//		System.out.println(Person.id);
		
		System.out.println("============");
		Person hong2 = new Person("홍길동", 30);
//		System.out.println(Person.id);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
