package Day05;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtils m = new MyUtils();
		m.pl("Class Example");
		MyUtils.pl("바로 이 용도");
		
		// Field Test
		Store st1 = new Store();
		Store st2 = new Store();
		st1.name = "안산점";
		st2.name = "강남점";
		m.pl(st1.name);
		m.pl(st2.name);
		
		st1.pran_name = "Alpha";
		st2.pran_name = "Morning Glory";
		m.pl(st1.pran_name); // static 변수는 클래스 공용이기 때문에 "Morning Glory"
		m.pl(st2.pran_name); 
		
		m.pl(1);
		m.pl("Erik");
	}

}

class Store {
	String name;
	static String pran_name;
}

class MyUtils {
//	public static void pl(Object o) {
//		System.out.println(o);
//	}
	
	public static void pl(String str) {
		System.out.println(str);
	}
	
	public static void pl(int i) {
		System.out.println(i);
	}
}
