package Day03;

import java.util.Scanner; // Scanner 사용 임포트

public class FiveMinChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pseudo Code(수도 코드)
		// 0. 프로그램을 시작한다.
		p("********************************");
		p("백신접종요일 자동분배 프로그램 시작");
		p("********************************");
		
		// 1.이름입력을 받아서 nam 변수에 저장
		Scanner sc = new Scanner(System.in);
		p("이름을 입력하시오 : ");
		String nam = sc.next();
		
		// 2. 주민번호 맨 뒷자리 입력을 받아 final_num 변수에 저장
		p("주민번호 맨 뒷자리 입력을 받으세요. : ");
		int final_num = sc.nextInt();
		
		// 3. 입력된 값을 출력한다.
		p("입력한 값은 : " + nam + ", " + final_num);
		
		// 4. 뒷자리가 1,6이면 월, 2,7이면 화, 3,8이면 수, 4,9이면 목, 5,0이면 금
		String day = "";
		
		if(final_num == 1 || final_num == 6) {
			day = "월";
		}else if(final_num == 2 || final_num == 7) {
			day = "화";
		}else if(final_num == 3 || final_num == 8) {
			day = "수";
		}else if(final_num == 4 || final_num == 9) {
			day = "목";
		}else {
			day = "금";
			
		// case 1
//		switch(final_num % 5) {
//			case 1:
//				day = "월";
//				break;
//			case 2:
//				day = "화";
//				break;
//			case 3:
//				day = "수";
//				break;
//			case 4:
//				day = "목";
//				break;
//			default:
//				day = "금";
//		}
			
		// case 2
//		switch(final_num) {
//			case 1:
//			case 6:
//				day = "월";
//				break;
//			case 2:
//			case 7:
//				day = "화";
//				break;
//			case 3:
//			case 8:
//				day = "수";
//				break;
//			case 4:
//			case 9:
//				day = "목";
//				break;
//			default:
//				day = "금";
//		}
	}
		
		// 5. ***님의 접종일은 *요일 입니다. 요일 지켜서 오세요. 를 출력한다.
		p(nam + "님의 접종일은 " + day + "요일 입니다. 요일 지켜서 오세요.");
	}
	public static void p(String str) {
		System.out.println(str);
	}	
}