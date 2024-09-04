package day09.instanceBlock;

public class Task {
	// 멤버 변수
	private String name;
	private int age;
	private int id; // 생성자가 호출된 순서를 저장할 변수
	
	// 공유 변수, 클래스 변수
	static int index;
	
	// static 블록
	// 생성자 호출과 무관하게
	// 프로그램이 실행되면 최초 1회 실행되는 코드 블록이다.
	static {
		index++; // 1
		System.out.println("스태틱 블록 " + index);
	}
	
	// 인스턴스 블록
	// 생성자를 호출할 때마다
	// 생성자의 코드보다 먼저 실행되는 코드블록으로
	// 모든 생성자에 공통으로 적용할 내용을 적는 공간이다.
	{
		this.id = index;
		System.out.println("인스턴스 블록 " + index);
		index++;
	}
	
	public Task(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("생성자 호출");
	}
	
	// getter, setter
	// 외부(클래스 밖)에서 접근하는 것을 제한하기 위해
	// 사용하는 메서드다.
	// 게터와 세터를 사용하는 경우,
	// 일반적으로 변수는 모두 private으로 선언해준다.
	// (protected를 적을 때도 있다.)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public static void main(String[] args) {
		Task t1 = new Task("홍", 30);
		Task t2 = new Task("홍", 30);
		Task t3 = new Task("홍", 30);
		Task t4 = new Task("홍", 30);
		
		System.out.println(t4.id);
	}
	
}












