package collectionsframeworkdemo.HashMap;

import java.util.HashMap;

public class HashMapForEachDemo {

	public static void main(String[] args) {

		HashMap<String,Object> hmap = new HashMap<>();
		
		hmap.put("Company","Honda");
		hmap.put("Model","Amaze");
		hmap.put("Price",900000);
		hmap.put("Milage",14.12);
		hmap.put("Color","Grey");
		
		for(String k : hmap.keySet()) {
			
			System.out.println(k+" : "+hmap.get(k));
			//System.out.println(k); in this instance k means the string value
			//System.out.println(hmap.get(k)); in this instance hmap.get(k) means the object/values of k
			
		}

	}

}
