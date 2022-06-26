package Day05;

public class Person {
	// Field(Member Variable)
	String name; // private 사용시 get/set 없이 호출 불가능
	int age;
	
	// Constructor : 생성자
	Person(){
		
	}
	
	Person(int i){
		age = i;
	}
	
	Person(String str){
		name = str;
	}
	
	// Method(Memember Function)
	public void hit() {
		System.out.println(name + "이 말했습니다.\"왜 때려요\"");
	}
}
