package Day06.Inher_1;

public class Smartphone extends Phone {
	// Method Overriding
	void sendTextMessage(String str) {
		System.out.println(str); // 부모클래스에는 글자 제한이 있지만, 여기서는 없다.
		System.out.println("예전폰이었다면");
		super.sendTextMessage(str);
	}
	
	// Method Overloading
	void sendTextMessage(int i) {
		System.out.println("Text : Integer");
	}
}
