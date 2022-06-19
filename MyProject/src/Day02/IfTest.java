package Day02;

import java.util.Random;

public class IfTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      p("********************************");
      p("***If Test***");
      
      int a = 1;
      if( a > 0) {
         p("a is positive");
      }
      
      p("***if-else***");
      
      int b = -1;
      if(a > 0) {
         p("b is postive");   
      }
      else {
         p("b is not postive");
      }
      
      p("***if-else if***");
      int c = 60;
      if(c > 50) {
         p("c is big number");
      }
      else if(c > 0) {
         p("c is postive");
      }
      
      p("***if-else if-else***");
      int d = -30;
      if(d > 0) {
         p("d is postive");
      }
      else if(d == 0) {
         p("d is zero");
      }
      else {
         p("d is negative");
      }
      
      // nested(중첩) if statement
      // else하나만 있을 경우 {} 생략가능
      p("***if-if***");
      int math = 90;
      int eng = 35;
      
      if(math >= 60) 
         if(eng >= 60) 
            p("Pass");
            // p("Pass"); // 두줄이상 될 경우 {}를 포함해야한다.
         else 
            p("Fail");
      else 
         p("Fail");
      
      // 조건을 && 등의 연산자로 묶을 수 있음
      // 실행문이 하나만 있을 때 {} 생략 가능
      if(math >= 60 && eng >= 60) p("Pass");
      else p("Fail");
      
      p("***switch***"); // break에 주의해야 한다. ex) 1이면 밑에 조건까지 쭉내려가며 읽는다.
      
      int i = 1;
      switch(i) {
         case 1:
            p("1인가");
            break;
         case 2:
            p("2였네");
            break;
         case 3:
            p("3맞지");
            break;
         default :
            p("다 아닌데?");  
      }
      p("********************************");
      
      Random rd = new Random();
      int j = rd.nextInt(3);
      
      switch(j) {
         case 0:
            //p("꽝");
            //break;
         case 1:
            p("꽝");
            break;
         case 2:
            p("당첨");
            break;
      }   
      p("********************************");
   }
   
   public static void p(String str) {
      System.out.println(str);
   }
}