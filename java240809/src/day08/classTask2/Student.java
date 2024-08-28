package day08.classTask2;

public class Student {
	String name;
	int math;
	int kor;
	int eng;
	public Student(String name, int math, int kor, int eng) {
		this.name = name;
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}
	
	public int avg() {
		int result = (math + kor + eng)/3;
		return result;
	}
	
	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 60, 70, 90);
		Student[] stList = new Student[] {
				st1,
				new Student("고길동", 75, 85, 90),
				new Student("고희동", 60, 70, 60),
		};
		
		for (Student st : stList) {
			System.out.println(st.avg());
		}
		
		
		
	}
}
