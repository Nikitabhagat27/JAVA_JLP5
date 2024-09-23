package collection;

import java.util.Map;
import java.util.TreeMap;

//
public class MyTreeMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
//		map.put(null, null); null as a key doesn't allow
		map.put("Shailu", 1);
		map.put("Alok", 2);
		map.put("Nikita", 3);
		map.put("Riya", 4);
		map.put("Ritika", 5);
		map.put("Sharad", 6);
		System.out.println(map);
	}
}
