package Day02;

import java.util.Scanner;

public class UserInputTest {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      p("User Input Test");
      p("********************************");
      
      // 프로그램 실행할 때 입력받는 경우
      // Run -> Run Configuration -> Arguments -> 내용 입력 -> 띄어쓰기 이후 다음 배열
      // Arguments, Value, Parameter
      // p("Arguments1 : " + args[0]);
      // p("Arguments2 : " + args[1]);
      // p("# of Arguments : " + args.length);
      
      // 아무 때나 필요할 때 입력받는 경우
      Scanner sc = new Scanner(System.in);
      
      p("이름을 입력하시오 : ");
      String name = sc.next(); // next는 문자열로 받는다.
      
      p("나이를 입력하시오 : ");
      int age = sc.nextInt(); // nextInt는 정수(숫자) 받는다.
      
      String str = (age > 20)?"Java 점수를 입력하십시오 : ":"Java 점수를 입력해 : ";
      p(str);
      float score_j = sc.nextFloat();
      str = (age > 20)?"C 점수를 입력하십시오 : ":"C 점수를 입력해 : ";
      p(str);
      float score_c = sc.nextFloat();
      
      p("당신의 이름은 " + name + "입니다.");
      p("당신의 나이는 " + age + "입니다.");
      p("평균 점수는 " + (score_j + score_c)/2 + "이시네요.");
   }
   
   public static void p(String str) {
      System.out.println(str);
   }
}