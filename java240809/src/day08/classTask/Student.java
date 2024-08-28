package day08.classTask;

public class Student {
	
	private String name;
	private int age;
	private String studentNumber;
	
	public Student() {;} // 비워둠을 의도했다는 표식
	
	public Student(String name, int age, String stNum) {
		this.name = name;
		this.age = age;
		this.studentNumber = stNum;
	}
	
	// getter / setter
	// 객체의 속성에 직접 접근(.속성명)하는 건
	// 보안상 위협이 될 수 있기 때문에
	// 내부적으로만 직접 접근하도록 하기 위해
	// 메서드를 통해서만 값을 변경, 사용하게 하기 위해
	// 게터와 세터를 사용한다.
	
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

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 20, "NO300");
		st1.getAge();

	}

}
