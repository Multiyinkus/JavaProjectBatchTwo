package collectionsframeworkdemo.HashMap;

import java.util.HashMap;

public class HashMapGet {

	public static void main(String[] args) {

		HashMap<String,Object> hmap = new HashMap<String,Object>();
		
		hmap.put("Name", "Adeyinka");
		hmap.put("Location", "Manchester");
		hmap.put("Experience", 10);
		hmap.put("Music", "Hip-Hop");
		
		//Object pmap = hmap.get("Music");
		//System.out.println(pmap);
		
		System.out.println(hmap.get("Location"));

	}

}
