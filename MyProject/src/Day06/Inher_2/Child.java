package Day06.Inher_2;

public class Child extends Parent {
	int number = 2;
	
	Child() {
		System.out.println("Create Child Object");
	}
	
	void print() {
		int number = 1;
		System.out.println("number : " + number);
		System.out.println("this.number : " + this.number); // 자식이 변수를 가지고 있지 않으면 부모의 변수를 가져온다 int number = 2;
		System.out.println("super.number : " + super.number); // 부모의 변수를 가지고 온다.
	}
	
	void eat() {
		System.out.println("돼지고기 10인분을 먹었습니다.");
	}
	
	void cry() {
		System.out.println("레고를 사달라고 웁니다.");
	}
	
}
