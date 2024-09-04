package day10.sharedVariable;

public class Person {
	String name;
	int age;
	int id; // 각 객체마다 부여될 고유한 번호
	
	// 객체화될 때마다 증가하는 값을 담기 위한 변수
	static int count; // 공유 변수, 클래스 변수
	// 클래스를 객체화하지 않고도 사용할 수 있는 변수.
	
	static {// 스태틱 블록
		System.out.println("static block");
		count = 0;
		
		// static과 this는 공존할 수 없다.
		// static -> 객체화x 사용하는 것
		// this -> 객체.(의) 방식으로 접근, 사용해야 하는 것
//		System.out.println(this.count);
	}
	

	{	// 인스턴스 블록
		// 객체를 호출(new)할 때마다 생성자보다 먼저
		// 실행되는 코드 블록이다.
		System.out.println("instance");
		count++;
		this.id = count;
	}
	
	public Person() {
		System.out.println("constructor : " + this.id);
	}
	
	public void method1() { // 객체를 통해서 사용되는 메서드
		System.out.println("객체를 통해 실행된 메서드");
		System.out.println("ID : " + this.id);
		System.out.println("name : " + this.name);
	}
	
	
	public static void main(String[] args) {
		Person p1 = new Person(); // 1
		p1.name = "hong";
		p1.age = 30;
		
		Person p2 = new Person(); // 2
		
		System.out.println(Person.count); // 2
		System.out.println("=====================");
		
		p2.method1();
		
		
		
		
		
		
		
	}
}
