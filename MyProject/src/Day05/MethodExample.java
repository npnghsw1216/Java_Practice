package Day05;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		c.add(3, 5);
		c.add(3.0, 5.0);
		c.add(1, 2, 10);
		
		int rn = c.add(105);
		System.out.println("Return Add : " + rn);
		
		int [] a = {1,2,3,4,5};
		int rn1 = c.add(a);
		System.out.println("Return Add(int[]) : " + rn1);
		
		String [] b = {"Have ", "A ", "Nice ", "Day"};
		String rn2 = c.add(b);
		System.out.println("Return Add(String[]) : " + rn2);
	}

}

// 오버로딩
class Calc {
	public void add(int a, int b) {
		System.out.println("Add Int : " + (a+b));
	}
	
	public void add(double a, double b) {
		System.out.println("Add Double : " + (a+b));
	}
	
	public void add(int a, int b, int c) {
		System.out.println("Add 3 Int : " + (a+b+c));
	}
	
	public int add(int i) {
		return i + 100000;
	}
	
	public int add(int[] i) {
		int result = 0;
		// 1
//		for(int j=0; j<i.length; j++) {
//			result += i[j];
//		}
		
		// 2
		for(int j : i) 
			result += j;
		
		
		return result;
	}
	
	public String add(String[] str) {
		String result = "";
		// 1
//		for(int i=0; i<str.length; i++) {
//			result += str[i];
//		}
		
		//2
		for(String j : str)
			result += j;
		
		return result;
	}
}