package Day06.Inher_1;

public class Phone {
	String color;
	String company;
	String model;
	
	void sendTextMessage(String str) {
		if(str.length() > 80) {
			System.out.println("문자가 너무 길어요!");
		}else {
			System.out.println(str);
		}
	}
}
