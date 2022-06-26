package Day06.Inher_2;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.print();
		
		// 기본타입 casting
		int i = 10;
		double d = i;
		
		double b = 10.3;
//		int j = b; // 불가능
		int j = (int)b;
		
		boolean bl = true;
//		j = bl; // 불가능
//		String str = bl; // 불가능
//		String str = (String)bl; // 불가능
//		j = (int)bl; // 불가능
//		str = b;  // 불가능 cf)Phython : 가능
		
		// 클래스 casting
		Parent p1 = new Child();
//		p1.cry(); // Child로 생성은 되나 결국 Parent(cry 함수가 없음)
		p1.eat(); // 돼지고기 10인분을 먹었습니다. 를 가져온다(Child 함수)
		
//		Child c1 = new Parent(); // Parent가 Child의 모든 기능 cover불가하기 대문에 불가능
		Child c1 = (Child)p1;
		c1.eat(); // Child의 eat함수를 가져온다.
		c1.cry(); // Child의 cry함수를 가져온다.
		
		Parent p2 = new Parent();
//		Child c2 = (Child)p2; // 불가능	
	}

}
