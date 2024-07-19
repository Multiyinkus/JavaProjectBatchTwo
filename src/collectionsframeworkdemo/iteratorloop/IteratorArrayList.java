package collectionsframeworkdemo.iteratorloop;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArrayList {

	public static void main(String[] args) {


		ArrayList<Integer> ar = new ArrayList<>();
		
		ar.add(8);
		ar.add(4);
		ar.add(6);
		ar.add(3);
		
		Iterator<Integer> ial = ar.iterator();
		
		while(ial.hasNext()) {
			
			System.out.println(ial.next());
		}

	}//Day 43 video batch one

}
