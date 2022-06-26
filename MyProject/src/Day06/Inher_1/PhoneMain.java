package Day06.Inher_1;

import java.util.Scanner;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("폰을 선택하십시오.(1.일반폰, 2.스마트폰) : ");
		Scanner sc = new Scanner(System.in);
		int user_input = sc.nextInt();
		
		if(user_input == 1) {
			Phone p = new Phone();
			System.out.println("메시지를 입력하십시오 : ");
			String str = sc.next();
			p.sendTextMessage(str);
		}
		else {
			Smartphone sp = new Smartphone();
			System.out.println("메시지를 입력하십시오 : ");
			String str = sc.next();
			sp.sendTextMessage(str);
		}
	}

}
