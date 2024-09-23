package collection;

import java.util.HashMap;
import java.util.Map;

//Map doesn't allow duplicate key
// HashMap allows null as a key.
//In HashMap insertion order is not preserved.
public class MyHashMap {
public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<>();// 16
	System.out.println(map.isEmpty());
	System.out.println(map.size());// 0
	map.put(null, null);
	map.put(1, "Nikita");
	map.put(null, null);
	System.out.println(map.size());// 2
	map.put(2, "Amit");
	System.out.println(map.isEmpty());
	System.out.println(map.size());// 3
	System.out.println(map);
	System.out.println(map.get(1));
	System.out.println(map.containsKey(4));
	System.out.println(map.containsValue("Amit"));
	System.out.println(map.getOrDefault(3, "Java"));
	System.out.println(map.putIfAbsent(2, "Shailu"));
	System.out.println(map);
	System.out.println(map.put(2, "Shailu"));
	System.out.println(map.remove(null));
	System.out.println(map.replace(1, "Ritika"));
	System.out.println(map.merge(null, null, null));
	System.out.println(map);

}
}
