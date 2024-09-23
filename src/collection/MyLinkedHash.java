package collection;


import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHash {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		map.put(null, null);
		map.put("Shailu", 1);
		map.put("Alok", 2);
		map.put("Nikita", 3);
		map.put("Riya", 4);
		map.put("Ritika", 5);
		map.put("Sharad", 6);
		System.out.println(map);
		// {null=null, Sharad=6, Nikita=3, Alok=2, Riya=4, Ritika=5, Shailu=1}
		// {null=null, Shailu=1, Alok=2, Nikita=3, Riya=4, Ritika=5, Sharad=6}
	}
}
