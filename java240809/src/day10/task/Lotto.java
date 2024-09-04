package day10.task;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	static Random r;
	static {
		r = new Random();
	}
	
	public static int[] lottoAlt() {
		int[] resultNums = new int[7];
		int[] lottoNumsAll = new int[45];
		for (int i = 0; i < lottoNumsAll.length; i++) {
			lottoNumsAll[i] = i+1;
		}
		for (int i = 0; i < resultNums.length; i++) {
			int num = r.nextInt(45)+1;
			int temp = lottoNumsAll[num];
			if(temp != 0) {
				resultNums[i] = temp;
				lottoNumsAll[num] = 0;
			} else {
				i--;
			}
		}
		return resultNums;
	}

	public static int[] lotto() {
		// 당첨 번호를 담을 배열 선언
		int[] lottoNums = new int[7];
		for (int i = 0; i < lottoNums.length; i++) {
			// 현재 선택한 로또 번호를 임시로 담을 공간
			int temp = r.nextInt(45) + 1;

			// 임시 로또 번호랑, 이미 담긴 번호 중 겹침 여부를 담을 boolean값
			boolean flag = false;

			// 이전에 담긴 값과 비교
			for (int j : lottoNums) {
				if (j == temp) {
					flag = true;
					break;
				} else if (j == 0) {
					break;
				}
			}
			if (flag == true) {
				i--; // 다음 반복으로 넘어가되
				// i 값은 현재 반복과 동일하게 유지
				continue;
			} else {
				lottoNums[i] = temp;
			}
		}
		for (int i : lottoNums) {
			System.out.println(i);
		}
		return lottoNums;
	}

	public static void main(String[] args) {
//		- 1 ~ 45사이의 번호 중 중복되지 않는 6개의 번호를 선택하여 맞히는 게임입니다.
//		- 로또번호 : 6개의 번호와 1개의 보너스 번호를 가집니다.
//		- 보너스번호를 포함하여 각 번호는 중복되지 않습니다.
//		- 로또번호를 만들때에는 랜덤함수를 이용하여 만들어주세요.
		int[] lottoNums = lottoAlt();
		for (int i : lottoNums) {
			System.out.println(i);
		}
		
//		- 게임유저는 6개의 번호를 선택합니다.
//		- 유저가 선택한 각 번호는 중복되지 않습니다.
//		- 유저번호는 스캐너를 사용하여 직접입력하세요
		Scanner sc = new Scanner(System.in);

	}
}
