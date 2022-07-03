package Day08;

import java.util.HashSet;
import java.util.Iterator;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("1");
		hs.add("James");
		hs.add("Son");
		hs.add("SON");
		hs.add("James");
		hs.add(1);
		
		System.out.println(hs);
		
		// hs.get(1);  // Set은 인덱스가 없음
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o.toString() + ":" + o.getClass().getSimpleName());
		}
		
	}

}