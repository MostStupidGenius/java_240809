package day06.classTask;

public class Citizen {
	String name;
	String regNum;
	String address;
	int issuedNum;
	
	public Citizen() {;}
	
	public Citizen(String name, String registerNumber) {
		this.name = name;
		this.regNum = registerNumber;
		return;
	}
	
	public static void main(String[] args) {
		Citizen person1 = new Citizen();
//		System.out.println(person1.name);
//		System.out.println(person1.issuedNum);
		// 객체의 값에 접근하는 방법
		// 마침표(.)를 이용하여
		// 해당 객체의 속성(멤버변수), 기능(메서드)에 접근할 수 있다.
		person1.name = "홍길동";
		System.out.println(person1.name);
		
		Citizen goGilDong = new Citizen("고길동", "1324");
		System.out.println(goGilDong.name);
		
		Citizen person1Clone = person1;
		System.out.println(person1Clone.name);
		
	}
	
}
