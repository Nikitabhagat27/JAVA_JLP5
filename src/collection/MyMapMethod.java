package collection;

import java.util.HashMap;
import java.util.Map;

public class MyMapMethod {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Alok");
		map.put(2, "Shailu");
		System.out.println(map);
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Nikita");
		map2.put(4, "Riya");
		// map.merge(null, null, null); Later
//		for ( Map.Entry<Integer, String> e : map2.entrySet() ) {
//			map.put(e.getKey(), e.getValue());
//		}
//		map.putAll(map2);
//		map.compute(null, null)
//		map.computeIfAbsent(1, null);
		System.out.println(map);
	}
}
