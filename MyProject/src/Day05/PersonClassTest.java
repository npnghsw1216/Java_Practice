package Day05;

public class PersonClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.hit();
		//Person.hit(); // static(정적이다) 함수의 경우는 이런 식의 호출도 가능 , static(정적) <-> dynamic(동적)
		Person p1 = new Person(50);
		p1.hit();
		Person p2 = new Person("Son");
		p2.hit();
		
//		p.name = "다 탈퇴해"; // private 사용시 변경 x, 아에 찾을 수가 없음
//		System.out.println(p.name);
		p.hit();
	}
}
