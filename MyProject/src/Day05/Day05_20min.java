package Day05;

import java.util.Random;

public class Day05_20min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dm = new Department("강남점");
		dm.setAmt(3000);
		dm.setAmt(300);
		
		Random rd = new Random();
		int today_amt, today_visitors;
		
		// 10번 try, 매출액은 -1000 ~ 2000사이, 방문고객은 -100 ~ 200 사이로 추가됨
		// 각 try마다 오픈상태와 현재의 매출액과 방문고객을 출력한다. 
		// 오픈상태가 false이면 매출액과 방문고객 대신, "망했음"을 출력한다.
		for(int i=0; i<10; i++) {
			if(dm.isOpen()) {
				today_amt = rd.nextInt(-10,20)*100;
				today_visitors = rd.nextInt(-100,200);
				if(today_visitors < 0) {
					today_amt = 0;
				}else {
					dm.addAmt(today_amt);
					dm.addVisitors(today_visitors);
					System.out.println("상태 : Open, 매출액 : " + dm.getAmt() + "만원, 방문자수 : " + dm.getVisitors() + "명");
				}
			}else {
				System.out.println("상태 : Close 망했음");
			}
		}
	}
}

class Department {
	// 1. name : 지점의 이름. 생성할 때 지정 가능
	// 2. pran_name : 백화점의 이름. 수정 불가능. 최초에 지정되어 있음 "신세계"
	// 3. amt : 매출액. 초기값은 0. 직접 수정 불가능
	// 4. visitors : 방문고객수. 초기값은 0. 직접 수정 불가능.
	// 5. open_a : 현재 지점의 오픈 상태(True, False)
	// 6. open_b : 전체 지점의 오픈 지침(True, False)
	
	// Field Declaration
	String name = "";
	final String pran_name = "신세계";
	private int amt = 0;
	private int visitors = 0;
	boolean open_a = true; 
	static boolean open_b = true;
	
	Department(String name) {
		this.name = name;
	}
	
	// isOpen() : open_a와 open_b가 모두 true일 때만 true
	public boolean isOpen() {
		if(open_a && open_b) {
			return true;
		}else {
			return false;
		}
	}
	
	// setAmt(int amt) : 현재의 amt를 세팅한다.
	public void setAmt(int amt) {
		this.amt = amt;
	}
	
	// setVisitors(int visitors) : 현재의 visitors를 세팅한다.
	public void setVisitors(int visitors) {
		this.visitors = visitors;
	}
	
	// getAmt
	public int getAmt() { return amt; } 
	
	// getVisitors
	public int getVisitors() { return visitors; } 
	
	// addAmt, 현재의 amt에 전달된 amt를 더한다.
	public void addAmt(int amt) {
		this.amt += amt;
		// 만약 amt가 음수가 되면 open_a를 false로 변환한다.
		if(this.amt < 0) {
			open_a = false;
		}
	}

	// addVisitors, 현재의 visitors에 전달된 visitors를 더한다.
	public void addVisitors(int visitors) {
		this.visitors += visitors;
		// 만약 visitors가 음수가 되면 open_b를 false로 변환한다.
		if(this.visitors < 0) {
			open_b = false;
		}
	}		
}