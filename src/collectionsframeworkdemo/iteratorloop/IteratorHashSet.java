package collectionsframeworkdemo.iteratorloop;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorHashSet {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();
		
		hs.add("Adeyinka");
		hs.add("Adewale");
		hs.add("Richard");
		hs.add("Ann-Marie");
		
		Iterator<String> ihs = hs.iterator();
		
		while(ihs.hasNext()) {
			
			System.out.println(ihs.next());
		}

	}//Day 43 video batch one	

}
