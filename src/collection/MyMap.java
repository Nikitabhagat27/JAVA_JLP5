package collection;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Nikita");
		map.put(2, "Ritika");
		map.put(3, "Riya");
		map.put(4, "Sharad");
//		map.put(4, "Amit");

		for ( Map.Entry<Integer, String> e : map.entrySet() ) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

		System.out.println();
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while ( iterator.hasNext() ) {
			Integer key = iterator.next();
			System.out.println(key + " " + map.get(key));
		}

		map.entrySet().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

		// If you want to iterate map values only
		Collection<String> values = map.values();
		System.out.println(values);
	}
}
