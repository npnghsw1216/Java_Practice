package Day05;

public class AuthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		System.out.println(t.a);
		// System.out.println(t.b); // private 여서 x
		System.out.println(t.getB()); // Test클래스의 변수 b의 값은 바뀌지 않지만 get을 통해 b의 결과 값을 가져온다.
		System.out.println(t.c);
		
	}

}


class Test {
	public int a = 3;
	private int b = 5;
	int c = 7;
	
	public int getB() {
		return b;
	} // b가 보호가 된다.
}