package day07.solution;


public class Solution181929 {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
		System.out.println(solution(new int[]{5, 7, 8, 3}));
		
		
		
	}
	
	public static int solution(int[] num_list) {
        int answer = 0;
//        정수가 담긴 리스트 num_list가 주어질 때, 
//        모든 원소들의 곱이
        int gop = 1, hap = 0;
        
        for (int i : num_list) {
			gop *= i;
		}
//        모든 원소들의 합의 제곱보다 작으면 1을
        for (int i : num_list) {
			hap += i;
		}
//        hap = Arrays.stream(num_list).sum();
        
        // 제곱 메서드 pow(밑수, 지수)
        hap = (int)Math.pow(hap, 2);
        answer = gop < hap ? 1 : 0;
//        크면 0을 return
        return answer;
    }

}
