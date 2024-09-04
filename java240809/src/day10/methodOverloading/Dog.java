package day10.methodOverloading;

public class Dog {
	
	String name;
	int age;
	String type;
	
	public Dog() {;}
	
	// 짖다
	public void bark() {
		System.out.println(this.name + "이(가) 짖는다.");
	}
	
	public void bark(String target) { // 짖을 상대의 명칭
		System.out.println(this.name + "이(가) "+ target + "을(를) 향해 짖는다.");
	}
	
	public static void main(String[] args) {
		Dog badukE = new Dog();
		badukE.name = "바둑이";
		
		badukE.bark(); // 바둑이이(가) 짖는다.
		badukE.bark("도둑"); // 바둑이이(가) 도둑을(를) 향해 짖는다.
		
	}
	
	
	
	
	
	
	
	
	
	
}
