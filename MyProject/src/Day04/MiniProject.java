//package Day04;
//
//import MyUtil.Colors;
//import java.util.Random;
//import java.util.Scanner;

///*
// * 1. 보물상자에서 무기를 5종류 중 하나 랜덤으로 획득한다.(멤버변수)
// * 2. 길을 가다가 늑대, 산적, 드래곤 중 하나를 만난다.
// * 3. 무기를 가지고 둘 중 하나의 에너지가 0이하가 될 때까지 싸운다.(가장 긴 로직)
// * 4. 승리 또는 패배에 따라 메세지를 출력한다.
// */
//
//public class MiniProject {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Scanner sc = new Scanner(System.in);
////		MiniProject mp = new MiniProject(); // 본인이 본인 인스턴스를 만든다(이런 경우 많음)
//		
//		// 1-0. 게임시작을 알려준다.
//		Colors.p("운명의 데스티니 게임 start");
//		
//		// 1-1. 보물상자를 발견했다는 메시지를 출력하고 아무키 + 엔터를 기달린다.
//		
//		System.out.println("길을 가다가 " + Colors.YELLOW + "[보물상자]" + Colors.END + "를 발견했다.");
//		
//		// 1-2. 보물상자에서 랜덤으로 1개의 무기를 획득한다.
//		//		각 무기는 무기이름, 최소 데미지, 최대 데미지를 가짐
//		String[] weapon_name = {"휴지", "목검", "대검", "대포", "에픽밸붕검"};
//		int[] weapon_min_dam = {1, 3, 5, 0, 50};
//		int[] weapon_max_dam = {3, 5, 10, 50, 100};
//		
//		// Random 로직
//		Random rd = new Random();
//		int sel = rd.nextInt(0, 5);
//		
//		String my_weapon = weapon_name[sel];
//		int my_min_dam = weapon_min_dam[sel];
//		int my_max_dam = weapon_max_dam[sel];
//		System.out.println(my_weapon + "(" + my_min_dam + "-" + my_max_dam + ")"
//				+ "을 획득하였습니다.");
//		float critical_ratio = rd.nextFloat() * 100;
//		System.out.println("Critical Ratio : " + critical_ratio + "%");
//				
////		2. 길을 가다가 늑대, 산적, 드래곤 중 하나를 만난다.
//		String[] my_mon = {"늑대", "산적", "드래곤"};
//		int[] mon_min_dam = {1, 5, 1};
//		int[] mon_max_dam = {3, 10, 100};
//		
////		int cel = rd.nextInt(0,4);
//		sel = rd.nextInt(0, 3);
//		
//		String my_mon_name = my_mon[sel];
//		int my_mon_min_dam = mon_min_dam[sel];
//		int my_mon_max_dam = mon_max_dam[sel];
//		System.out.println("당신은 길을 가다가 " + Colors.YELLOW + my_mon_name + Colors.END + "을 만났습니다.");
//		
////		3. 무기를 가지고 둘 중 하나의 에너지가 0이하가 될 때까지 싸운다.(가장 긴 로직)
////		3-1. 전투를 시작하낟. 초기 양쪽의 에너지는 100이다.
//		int my_energy = 100;
//		int mon_energy = 100;
//		
////		3-2. 무한루프로 전투를 한다. 둘 중 하나의 에너지가 0이하가 되면 탈출
////			유저는 1. 공격 또는 2. 회복을 선택한다.
////			공격인 경우는 최소-최대 데미지로 공격, 회복은 0~30사이의 에너지가 회복된다.
//		int user_input;
//		int damage;
//		
//		while(true) {
//			Scanner sc = new Scanner(System.in);
//			// 유저 입력(무용서 버전)
////			System.out.println("행동을 입력하십시오.(1. 공격, 2. 회복) : ");
////			user_input = sc.nextInt();
//			
//			// 유저 입력(용서 버전)
//			while(true) {
//				System.out.println("행동을 입력하십시오.(1. 공격, 2. 회복) : ");
//				System.out.println("");
//				user_input = sc.nextInt();
//				if(user_input == 1 || user_input == 2)
//					break;
//			}
//			// 1. 공격
//			if(user_input == 1) {
//				damage = cal_damage(my_min_dam, my_max_dam, critical_ratio);
//				mon_energy -= damage;
//				
//				if(mon_energy < 0) {
//					mon_energy = 0;
//				}
//				// 데미지를 입혔다는 메시지와 남은 에너지를 출력한다.
//				System.out.println(my_mon_name + "에게" + Colors.YELLOW + damage + Colors.END + "의 데미지를 입혔습니다.");				
//				System.out.println("당신의 남은 에너지 : " + Colors.YELLOW + my_energy + Colors.END);
//				System.out.println("몬스터의 남은 에너지 : " + Colors.YELLOW + mon_energy + Colors.END);
//				printEnergy(my_energy, mon_energy);
//				System.out.println();
//				
//				if(my_energy == 0) {
//					break;
//				}
//				
//				// 몬스터의 에너지가 0이면 탈출한다.
//				if(mon_energy == 0) {
//					printResult(my_energy);
//					break;
//				}
//			}
//			
//			// 2. 회복
//			else if(user_input == 2) {
//				int heal = rd.nextInt(0, 31);
//				my_energy += heal;
//				
//				if(my_energy > 100) {
//					my_energy = 100;
//					System.out.println(heal + "의 에너지가 회복되어" + Colors.YELLOW + my_energy + Colors.END + "가 되었습니다.");
//					printEnergy(my_energy, mon_energy);
//				}
//			}
//			
//			// 몬스터 공격
//			damage = cal_damage(my_mon_min_dam, my_mon_max_dam, 0);
//			my_energy -= damage;
//			if(my_energy < 0) {
//				my_energy = 0;
//				System.out.println(my_mon_name + "의 공격으로 " + Colors.YELLOW + damage + Colors.END + "의 피해를 입었습니다.");
//				System.out.println("당신의 남은 에너지 : " + Colors.YELLOW + my_energy + Colors.END);
//				System.out.println("몬스터의 남은 에너지 : " + Colors.YELLOW + mon_energy + Colors.END);
//				printEnergy(my_energy, mon_energy);
//			}
//			
//			if(my_energy == 0) {
//				break;
//			}
//		}
//		
//
//		
////		4. 승리 또는 패배에 따라 메세지를 출력한다.
//		
//	}
//	
//	public static int cal_damage(int min_dam, int max_dam, float cri_ratio) {
//		// min - max 사이의 데미지를 랜덤하게 획득
//		Random rd = new Random();
//		int base_dam = rd.nextInt(min_dam, max_dam+1);
//		int final_dam = base_dam;
//		
//		// 크리티컬율에 따라 1.5배 적용 여부 결정
//		if(rd.nextFloat()*100 <= cri_ratio) {
//			final_dam *= 1.5;
//		}
//		return final_dam;
//	}	
//	
////	public static int cal_mon_damage(int my_mon_min_dam, int my_mon_max_dam, float cri_ratio) {
////		// min - max 사이의 데미지를 랜덤하게 획득
////		Random rd = new Random();
////		int base_mon_dam = rd.nextInt(my_mon_min_dam, my_mon_max_dam+1);
////		int final_mon_dam = base_mon_dam;
////		
////		// 크리티컬율에 따라 1.5배 적용 여부 결정
////		if(rd.nextFloat()*100 <= cri_ratio) {
////			final_mon_dam *= 1.5;
////		}
////		return final_mon_dam;
////	}
//	
//	public static void printResult(int my_energy) {
//		if(my_energy == 0) { // 패배
//			System.out.println("몬스터가 말했습니다. \"상대되 안되네 ㅋ\"");
//			System.out.println("내 명품가방을 가져갔습니다.");
//		} 
//		else { // 승리
//			System.out.println("\"당신은 정말 강하군\" 몬스터가 말했습니다.");
//			System.out.println("\"하지만 암슥대륙에는 나보다 강한자가 2314명 더 있다.\"");
//		}
//	}
//	
//	public static void printEnergy(int my_energy, int mon_energy) {
//		// 유저 이미지 
//		if(my_energy > 30) {
//			System.out.print(Colors.GREENBG);	
//		}	
//		else {
//			System.out.print(Colors.REDBG);
//		}
//		for(int i=0; i<my_energy/5; i++) {
//			System.out.print(" ");
//		}
//		System.out.print(Colors.END);
//		
//		for(int i=0; i<(21-my_energy/5); i++)
//			System.out.print(" ");
//		
//		System.out.println();
//		
//		// 몬스터 에너지 
//		if(mon_energy > 30) {
//			System.out.print(Colors.GREENBG);	
//		}	
//		else {
//			System.out.print(Colors.REDBG);
//		}
//		for(int i=0; i<mon_energy/5; i++) {
//			System.out.print(" ");
//		}
//		System.out.print(Colors.END);
//		System.out.println();
//		
//	}
//}
package Day04;

import MyUtil.Colors;
import java.util.Random;
import java.util.Scanner;

/*
 * 1. 보물상자에서 무기를 5종류 중 하나 랜덤으로 획득한다.
 * 2. 길을 가다가 늑대, 산적, 드래곤 중 하나를 만난다.
 * 3. 무기를 가지고 둘 중 하나의 에너지가 0이하가 될 때까지 싸운다.
 * 4. 승리 또는 패배에 따라 메시지를 출력한다.
 */

public class MiniProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"a","b","c"};
        int a = getArrayLength(str);
        System.out.println("str element 개수는 " + a);
        
        // 1-0. 게임시작을 알려준다.
        Colors.p("운명의 데스티니 게임 start");
        
        // 1-1. 보물상자를 발견했다는 메시지를 출력하고 아무키 + 엔터를 기다린다.
        System.out.println("길을 가다가 " + Colors.YELLOW + "[보물상자]" + Colors.END + "를 발견했다.");
        
        // 1-2. 보물상자에서 랜덤으로 1개의 무기를 획득한다.
        //      각 무기는 무기이름, 최소데미지, 최대데미지를 가짐
        String[] weapon_name = {"휴지","목검","대검","대포","에픽밸붕검"};
        int[] weapon_min_dam = {1, 3, 5, 0, 50};
        int[] weapon_max_dam = {3, 5, 10, 50, 100};
        
        Random rd = new Random();
        int sel = rd.nextInt(0,5);
        String my_weapon = weapon_name[sel]; 
        int my_min_dam = weapon_min_dam[sel];
        int my_max_dam = weapon_max_dam[sel];
        System.out.println(my_weapon + "(" + my_min_dam + "-" + my_max_dam + ")"
        		+ "을 획득하였습니다.");
        
        float critical_ratio = rd.nextFloat() * 100;
        System.out.println("Critical Ratio : " + critical_ratio + "%");
        
        // 2. 몬스터를 만난다.
        String[] mon_name = {"늑대","산적","드래곤"};
        int[] mon_min_dam = {1, 5, 1};
        int[] mon_max_dam = {3, 10, 100};
        
        sel = rd.nextInt(0,3);
        
        String my_mon = mon_name[sel];
        int my_mon_min_dam = mon_min_dam[sel];
        int my_mon_max_dam = mon_max_dam[sel];
        
        System.out.println("당신은 길을 가다가 " + my_mon + "을 만났습니다.");
        
        // 3-1. 전투를 시작한다. 초기 양쪽의 에너지는 100이다.
        int my_energy = 100;
        int mon_energy = 100;
        
        // 3-2. 무한루프로 전투를 한다. 둘 중 하나의 에너지가 0이하가 되면 탈출
        //      유저는 1.공격 또는 2.회복을 선택한다.
        //      공격인 경우는 최소-최대 데미지로 공격, 회복은 0~30사이의 에너지가 회복된다.
        //      몬스터는 공격만 하며, 유저와 한 번씩 교대로 행동한다.
        int user_input;
        int damage;
        
        while(true) {
        	Scanner sc = new Scanner(System.in);
        	
        	// 유저 입력(무용서 버전)
//        	System.out.println("행동을 입력하십시오(1.공격, 2.회복) : ");
//        	user_input = sc.nextInt();
        	
        	// 유저 입력(용서 버전)
        	while(true) {
        		System.out.println("행동을 입력하십시오(1.공격, 2.회복) : ");
            	user_input = sc.nextInt();
            	if(user_input == 1 || user_input == 2) break;
        	}
        	
        	// 공격
        	if(user_input == 1) {
        		damage = cal_damage(my_min_dam, my_max_dam, critical_ratio);
        		mon_energy -= damage;
        		if(mon_energy < 0) mon_energy = 0;
        		// 데미지를 입혔다는 메시지와 남은 에너지를 출력한다.
        		System.out.println("당신의 공격으로 " + my_mon + "에게 "
        				+ damage + "의 피해를 입혔습니다.");
        		System.out.println("당신의 에너지 " + my_energy + " "
        				+ my_mon + "의 에너지 " + mon_energy);
        		printEnergy(my_energy, mon_energy);
        		
        		// 몬스터의 에너지가 0이면 탈출한다.
        		if(mon_energy == 0) break;
        	}
        	
        	// 회복
        	else if(user_input == 2) {
        		int heal = rd.nextInt(0, 31);
        		my_energy += heal;
        		if(my_energy > 100) my_energy = 100;
        		System.out.println(heal + "의 에너지가 회복되어 " + my_energy + "가 되었습니다.");
        		printEnergy(my_energy, mon_energy);
        	}
        	
        	// 몬스터 공격
        	damage = cal_damage(my_mon_min_dam, my_mon_max_dam, 0);
        	my_energy -= damage;
        	if(my_energy < 0) my_energy = 0;
        	System.out.println(my_mon + "의 공격으로 " + damage + "의 피해를 입었습니다.");
        	System.out.println("당신의 에너지 " + my_energy + " "
    				+ my_mon + "의 에너지 " + mon_energy);
        	printEnergy(my_energy, mon_energy);
        	if(my_energy == 0) break;
        	
        }
        
        printResult(my_energy);
        
	}

	public static int getArrayLength(String[] str) {
		int result = 0;
		result = str.length;
		return result;
	}
	
	public static int cal_damage(int min_dam, int max_dam, float cri_ratio) {
		// min - max 사이의 데미지를 랜덤하게 획득
		Random rd = new Random();
		int base_dam = rd.nextInt(min_dam, max_dam + 1);
		int final_dam = base_dam;
		// 크리티컬율에 따라 1.5배 적용 여부 결정
		if(rd.nextFloat()*100 <= cri_ratio) {
			final_dam *= 1.5;
		}
		return final_dam;
	}
	
	public static void printResult(int my_energy) {
		if(my_energy == 0) { // 패배
			System.out.println("몬스터가 말했습니다. \"상대도 안되네 ㅋㅋㅋㅋ\"");
			System.out.println("내 명품가방을 가져갔습니다.");
		}
		else { // 승리
			System.out.println("\"당신 정말 강하군.\" 몬스터가 말했습니다.");
			System.out.println("하지만 암흑대륙에는 나보다 강한 자가 2314명 더 있다.");
		}
	}
	
	public static void printEnergy(int my_energy, int mon_energy) {
		if(my_energy > 30)	System.out.print(Colors.GREENBG);
		else System.out.print(Colors.REDBG);
		
		for(int i=0;i<my_energy/5;i++)
			System.out.print(" ");
		
		System.out.print(Colors.END);
		
		for(int i=0;i<(21-my_energy/5);i++)
			System.out.print(" ");
		
		if(mon_energy > 30)	System.out.print(Colors.GREENBG);
		else System.out.print(Colors.REDBG);
		
		for(int i=0;i<mon_energy/5;i++)
			System.out.print(" ");
		
		System.out.print(Colors.END);
		
		System.out.println();
	}
}
