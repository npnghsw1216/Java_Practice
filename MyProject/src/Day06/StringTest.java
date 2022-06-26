package Day06;

import java.util.Scanner;

import Day06.Inher_1.Phone;
import Day06.Inher_1.Smartphone;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리 주소가 같다.
		String str1 = "abcde";
		String str2 = "abcde";
		System.out.println(str1 == str2); // true 
		
		str1 = "waefasfawefef";
		System.out.println(str1 == str2); // false
		str1 = "abcde";
		System.out.println(str1 == str2); // true
		str2 = "abcdef";
		System.out.println(str1 == str2); // false
		str2 = "ddddd";
		System.out.println(str1 == str2); // false
		str2 = "abcde";
		System.out.println(str1 == str2); // true 
		
		// 메모리 주소가 다르다.(서로 다른 객체이기 때문)
		String str3 = new String("abcde");
		String str4 = new String("abcde");
		System.out.println(str3 == str4); // false
		
		// 1. length() : 문자열의 길이를 반환
		String s1 = "asdfasdfasdfadsfadfadsfadsf";
		String s2 = "한글은 몇글자로 침?";
		System.out.println("s1문자열의 길이 : " + s1.length()); 
		System.out.println("s2문자열의 길이 : " + s2.length());
		
		// 2. charAt() : 인덱스 위치에 있는 글자를 반환
		// ex) 주민등록번호: 위치별 뜻하는 의미등이 있다.
		// 인자는 오로지 하나로만 받는다.
		String s3 = "abcdefghijkl";
		System.out.println(s3.charAt(9));
//		System.out.println(s3.charAt(0, 9));
		
		// 3. equals(), equalsIgnoreCase() : 동일한 값인지 check
		String s4 = new String("aaaaa");
		String s5 = new String("aaaaa");
		String s6 = new String("AaaAA");
		System.out.println("3. " + (s4 == s5)); // false
		System.out.println("3. " + s4.equals(s5)); // true // 메모리 주소는 다름
		System.out.println("3. " + s4.equals(s6)); // false
		System.out.println("3. " + s4.equalsIgnoreCase(s6)); // 대소문자 구분x
		
		// 4. replace() : 특정 문자열을 찾아 원하는 문자열로 대체하여 반환한다.
		String s7 = "Heaven helps those";
		String s8 = "help";
		String s9 = s7.replace(s8, "     ");
		String s10 = s7.replace("t", "23232323");
		System.out.println("4. " + s9);
		System.out.println("4. " + s10);
		
		// 5. substring() : 기존 문자열에서 특정 부분을 잘라내어 반환한다.
		String s11 = s7.substring(1, 4);
		System.out.println("5. " + s11);
		
		// 6. trim() : 문자열 앞 뒤의 공백을 제거한다.
		// trim()은 인자 값을 넣을 수 없다.
		// cf)다른 언어에 경우 A를 제거 해준다. Java에서는 불가능
		// cf) Python : strip("쓰레기글자리스트"); => strip("1234567890") 숫자를 다 날리고 문자열을 만날때 까지
		String s12 = "                npnghsw1216        ";
		String s13 = s12.trim();
		System.out.println("6. " + s13);
		
		String s14 = "AAAAAAAAAAAAAAnpnghsw121AAAAAAAAAA";
//		String s15 = s14.trim("A");  
//		System.out.println("6. " + s15);
		
		// 7. split() : 특정 문자로 앞 뒤를 나누어 반환
		String s16 = "Victory comes from right";
		
		String[] s17 = s16.split("o");
		for(int i=0; i<s17.length; i++) {
			System.out.println("7. " + s17[i]);
		}
		
		String[] s18 = s16.split("[o ]"); // o 또는 space로 구분
		for(int i=0; i<s18.length; i++) {
			System.out.println("7. " + s18[i]);
		}
		System.out.println("7. " + s17);
		
		// 8. matches(정규표현식) : 문자열이 정규표현식 조건에 맞는지 확인
		String s19 = "010-123456789-123456789";
		
		// 숫자와 -으로만 25자리 이내로 구성되었는가?
		System.out.println("8. " + s19.matches("[0-9-]")); // 0-9숫자를 의미 그 이후 -는 빼기를 의미
		System.out.println("8. " + s19.matches("[0-9-]{1,25}")); // [0-9-]로 첫번째부터 25번째 자리까지 확인
		
		// 영대소문자 또는 한글로 5자 이내인가?
//		String nameRule = "";
//		String nameRule = "{1,6}"; // 자리수만 check
		String nameRule = "[A-Za-z가-힣]{6}"; 
		
		System.out.println("8. " + "유미의세포".matches(nameRule));
		
		// 전화번호 로직
		String phoneRule = "[0-9]{1}[0-9]{2}[-]{1}[0-9]{3,4}[-]{1}[0-9]{4}";
		System.out.println("8. " + "010-3422-6323".matches(phoneRule));
		
		// Test
		// 사용자로 부터 전화번호 입력을 받아서 전화번호 조건에 맞으면 마지막 4자리를 ****로 표시
		// 규칙에 어긋나면 "올바른 형식이 아닙니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호를 입력하세요 : ");
		String phone_num = sc.next();
		if(phone_num.matches(phoneRule)) {
			// 1. 첫번째 방법
			phone_num = phone_num.substring(0, phone_num.length()-4) + "****";
			System.out.println(phone_num);
			
			// 2. 두번째 방법
//			String last4 = phone_num.substring(phone_num.length()-4, phone_num.length());
//			phone_num = phone_num.replace(last4, "****"); // 중간번호와 마지막번호가 같을 때 오동작 // 가운데도 ****로 들어간다.
//			System.out.println(phone_num);
		}else {
			System.out.println("올바른 형식이 아닙니다.");
		}
	}
}
