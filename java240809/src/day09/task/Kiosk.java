package day09.task;

import java.util.Random;

public class Kiosk {
	// 키오스크
	// 주문받기: 메뉴를 출력하고 선택할 메뉴 번호를 입력하면
	// 해당 메뉴를 몇 개 주문할지 묻고(개수 > 0)
	// 해당 메뉴의 가격 * 개수를 출력한다.
	// 결제하기: 결제할 금액을 입력하면 거스름돈을 계산하고
	// 만약 결제할 금액이 모자라면 금액이 모자라다고 출력
	
	String[] menuList = {"불고기버거", "치즈버거", "새우버거"};
	int[] menuPrice = {3000, 2000, 2500};
	int menuTotalPrice;
	
	// order()메서드를 실행하면, 메뉴를 주문 받는다.
	// menuNumber 0->불고기버거, 1->치즈버거, 2->새우버거
	// 개수 입력받기
	// 만약 스캐너를 쓴다면, 반드시 .close() 해주어야 한다.
	// + 메인 메서드에서 열려있는 스캐너가 없어야 한다.
	public int order(int menuNumber) {
		this.menuTotalPrice = 0;
		
		
		return this.menuTotalPrice;
	}
	
	// 결제하기 기능
	// 입력받은 금액과 메뉴에 대한 결제해야 할 금액을 비교하여
	// 거스름돈을 출력하거나 금액 부족 알림 내용을 출력
	public void pay(int money) {
		// this.menuTotalPrice <> money
		System.out.println();
	}
	
	// 심화
	// int orderNum
	// 주문번호 활용해보기
	public int getOrderNum() {
		Random r = new Random();
		return r.nextInt(10000);
	}
	
	public static void main(String[] args) {
		
	}
}
