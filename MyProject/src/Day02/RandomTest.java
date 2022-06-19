package Day02;

import java.util.Random;

public class RandomTest {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      p("********************************");
      p("Random Test");
      p("********************************");
      
      Random rd = new Random();
      
      // Random Number Test
      p("nextInt(100) : " + rd.nextInt(100)); // 100 이하의 숫자 랜덤으로 출력
      p("nextInt() : " + rd.nextInt()); // Int의 범위 값 중 랜덤으로 출력
      p("nextFloat() : " + rd.nextFloat()); // Float의 범위 값 중 랜덤으로 출력
      p("nextDouble() : " + rd.nextDouble()); // Double의 범위 값 중 랜덤으로 출력
      p("********************************");
      
      // Random Alphabet Test
      // a ~ z 중의 하나를 선택
      char s_value = (char)((int)(Math.random()*26)+97); // a~z
      p("Random Char is '" + s_value + "'");
      p("********************************");
      char rc;
      rc = (char)(rd.nextInt(26) + 0x61) ; // a~z
      p("Random Char is '" + rc + "'");
      rc = (char)(rd.nextInt(26) + 'a') ; // a~z
      p("Random Char is '" + rc + "'");
      rc = (char)(rd.nextInt(26) + 'A') ; // A~Z
      p("Random Char is '" + rc + "'");
      rc = (char)(rd.nextInt(26) + '0') ; // 첨부터~
      p("Random Char is '" + rc + "'");
      p("********************************");
   }
   
   public static void p(String str) {
      System.out.println(str);
   }
}