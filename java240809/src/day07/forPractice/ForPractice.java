package day07.forPractice;

public class ForPractice {

	public static void main(String[] args) {
//		for (int i = 10; i >= 0; i--) {
//			System.out.println(i);
//		}
//		System.out.println("발사");
		
//		for (int i = 0; i < 10; i++) {
//			System.out.println("*".repeat(i+1));
//		}
		
		
		/*
		 
		  *
		  **
		  ***
		  ****
		  ***
		  **
		  *
		  
		 */
		int height = 7;
		int half = height / 2;
		for (int i = 0; i <= half; i++) {
			System.out.println("*".repeat(i+1));
		}
		for (int i = half; i > 0; i--) {
			System.out.println("*".repeat(i));
		}
		
		
		/*
		  
		      *
	         ***
		    *****
		     ***
		      *
		  
		 * */
		
//		for (int i = 0; i < half+1; i++) {
//			System.out.printf("%-"+height+"s\n", " ".repeat(half-(i+1)) + "*".repeat((i+1)*2-1));
//		}
//		for (int i = half+1; i > 0; i--) {
//			System.out.printf("%-"+height+"s\n", " ".repeat(half-i) + "*".repeat(i));
//		}
		
		
		
		
		
		
		
		
	}

}
