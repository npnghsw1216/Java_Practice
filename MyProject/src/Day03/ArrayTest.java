package Day03;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p("********************************");
		p("Array Test");
		p("********************************");
		
		String[] student1 = new String[5];
		String[] student2 = {"A", "B", "C", "James", "E"};
		int[] student_score = new int[5];
		
		for(int i=0; i<5; i++) {
			p(student2[i]);
		}
		p("********************************");
		System.out.println(student2.length);
		p("********************************");
		for(int i=0; i<student2.length; i++) {
			System.out.println(student2[i]);
		}
		p("********************************");
		// 배열에서 꺼내올때만 사용 가능
		for(String str : student2) {
			System.out.println(str);
		}
		p("********************************");
		// 2-d array : 이차원 배열
		int [][] m_array = new int[3][4];
		int [][] m_array2 = {{1,2,3},{4,5,6}};
		int [][] m_array3 = {{1,2,3},{4,5,6}};
		
		// 5를 선택하는 방법
		System.out.println(m_array2[1][1]); // 배열은 0부터 시작
		
		// [I@2cfb4a64 
		System.out.println(m_array2[0]); // 배열의 메모리 위치
		m_array2[0][2] = 100;
		// [[I@5474c6c
		System.out.println(m_array2);
		System.out.println(m_array3);
		// false
		System.out.println(m_array2 == m_array3);
		// false
		System.out.println(m_array2[0] == m_array3[0]);
		// true 
		// 완전히 같이 해주면 true
		System.out.println(m_array2[0][0] == m_array3[0][0]);
				
	}
	public static void p(String str) {
		System.out.println(str);
	}
		
}