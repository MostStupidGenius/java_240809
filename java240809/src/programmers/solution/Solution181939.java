package programmers.solution;

public class Solution181939 {

	public static void main(String[] args) {	
		int a = 9, b = 91;
//		String concat = "" + a + b;
//		int answer = Integer.parseInt(concat);
//		System.out.println(answer);
		
		System.out.println(solution(a, b));
		

	}
	
	public static int solution(int a, int b) {
        int answer = 0;
        String concat = "" + a + b;
        answer = Integer.parseInt(concat);
        return answer;
    }

	
}
