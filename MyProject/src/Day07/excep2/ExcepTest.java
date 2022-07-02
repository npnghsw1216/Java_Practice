package Day07.excep2;

import java.util.Random;

public class ExcepTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Excep e = new Excep();
		for(int i=0;i<10;i++) {
			try {
				e.getVariable();
			}
			catch(Exception ex) {
				System.out.println(ex.toString());
			}
		}
		
		/* 
		// 예외가 나는 순간 반복문 수행 종료
		try {
		   Excep e = new Excep();
		   for(int i=0;i<10;i++) {
			   e.getVariable();
		   }
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		*/
	}

}

class Excep {
	public void getVariable() throws Exception {
		Random rd = new Random();
		
		int i = rd.nextInt(100);
		
		if(i>70) {
			throw new MyException("Critical!! 대박!");
		}
		else if(i<30) {
			throw new MyException("Ah bad news.. 폭망 ㅠㅠ");
		}
		else {
			System.out.println("So So " + i);
		}
		
	}
	
}

class MyException extends Exception {
	MyException(String msg){
		super(msg);
		System.out.println("야 드디어 내 예외 떴다");
	}
}
