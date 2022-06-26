package Day05;

public class ConstructorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		System.out.println(c1.color + ": " + c1.name + ": " + c1.type);
		
		Car c2 = new Car("검정색", "포르쉐", "풀 옵션");
		System.out.println(c2.color + ": " + c2.name + ": " + c2.type);
	}

}

class Car {
	String color;
	String name;
	String type;
	
	// 생성자
	Car() {
//		color = "미정";
//		name = "개발중인차";
//		type = "기본형";
		this("미정", "개발중인차", "기본형");
		System.out.println("Car()");
	}
	
	// 가독성을 위해서 인스턴스 변수와 매개변수를 같게한다.(왠만해서)
	Car(String color, String name, String type) {
		this.color = color;
		this.name = name;
		this.type = type;
		System.out.println("Car(...)");
	}
	
	// Java8부터 시작된 문법
	// 코드블럭
	static {
		System.out.println("Static {}");
	}
	
	{
		System.out.println("{}");
	}
	
}