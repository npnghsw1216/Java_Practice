package Day01;

public class VarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Variables Example");
		
		// 1. char 자료형 테스트
		char ch = 49; // 49 = 0x31
		System.out.println("1. char ch = " + ch);
		
		// 2. char 자료형을 int에 넣었을 때
		int ch_i = ch;
		System.out.println("2. int ch = " + ch_i);
		
		// 3. char 자료형을 double에 넣을 때
		double ch_d = ch;
		System.out.println("3. double ch = " + ch_d);
		
		// 4. 숫자로 문자 출력해보기
		ch = 74;            // J, A : 0x41 = 65
	    System.out.println("4. char ch = " + ch);
	    
	    // 5. 두 글자 테스트
	    //char ch2 = 'AB';
	    
	    // 6. String 자료형
	    String str = "J.W.Lee";
	    System.out.println("My name is " + str);
	    
	    // 7. String의 초기화
	    String str2 = "aaaa";
	    String str3 = "aaaa";
	    String str4 = new String("aaaa");
	    System.out.println(str2 + "," + str3 + "," + str4);
	    
	    // 8. boolean 변수로 String값 비교
	    boolean b = true;
	    b = (str2 == str3);
	    System.out.println("String Compare : " + b);
	    b = (str2 == str4);
	    System.out.println("String Compare : " + b);
	    
	    // 9. 상수 테스트
	    final double PI = 3.141592; 
	    //PI = 6;   // final 변수는 수정 불가능
	    
	    // 10. 형변환 테스트
	    long num_l = 3;
	    int num_i = (int)num_l;  // cf) python : int(num_l)
	    double num_d = 671.287352873;
	    System.out.println("num_d = " + num_d);
	    float num_f = (float)num_d;
	    System.out.println("num_f = " + num_f);
	    
	    System.out.println(10/3);
	    System.out.println(10/3.);
	}
}