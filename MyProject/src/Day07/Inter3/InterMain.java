package Day07.Inter3;

public class InterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.d_method();
//		c.s_method();  // Interface의 static 함수는 구현불가
		c.func2();
		MyInterface.s_method();
		Parent.func2();
	}

}
