package Day03;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. while loop
		int i = 0;
		
		while(i < 10) {
			if(i == 7) {
				System.out.println("Lucky");
			}
			else if(i == 9) {
				System.out.println("End");
			}
			else {
				System.out.println(";;");
			}
			i++;
		}
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("행동을 선택하세요(1.공격, 2.도망) : "); 
//			i = sc.nextInt();
//			if(i == 1 || i == 2) {
//				break;
//			}
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		if(i==1) {
//			System.out.println("몬스터가 화가나서 1000000000데미지를 주었습니다!");
//		}
		
		// 2. for loop
		for(int j=0; j<10; j++) {
			for(int k =0; k<=j; k++) {
				System.out.print("*");
			}
			System.out.println("");
			j++; // for변수에 사용자의 개입으로 가능   cf) 파이썬은 불가능
		};
		
		// for infinite loop
//		for(;;){
//			System.out.println("집에나 쳐가");
//		}
		
		// 3. do while
		i = 100;
		
		do {
			System.out.println(i);
		} while(i<10);
		
		// 4. break, continue
		// 1에서부터 10까지의 숫자 ㅏ중 3의 배수만 출력하지 않는다.
		i = 1;
		
		while(true) {
			if(i==11) 
				break;
			else {
				if(i%3 == 0) {
					i++;
					continue;
				}
				System.out.println(i);
			}
			i++;
		}
		
	}
}