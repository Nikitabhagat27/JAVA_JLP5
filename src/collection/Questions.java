package collection;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Questions {

// You are given a list of names of employee, remove duplicate names and also make sure order should be preserved.
//	{"Alok","Nikita","Alok","Sharad","Shailu","Alok","Nikita"}; {Alok,Nikita,Sharad,Shailu}
	// {Alok 3, Nikita 2, Sharad 1,Shailu 1}

	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("Alok");
//		list.add("Nikita");
//		list.add("Alok");
//		list.add("Sharad");
//		list.add("Shailu");
		String[] arr = { "Alok", "Nikita", "Alok", "Sharad", "Shailu" };
		List<String> asList = Arrays.asList(arr);
//		System.out.println(list);
		Set<String> set = new LinkedHashSet<>();
		set.addAll(asList);
		System.out.println(set);

		String[] names = { "Alok", "Nikita", "Alok", "Sharad", "Shailu", "Alok", "Nikita" };
		Map<String, Integer> map = new TreeMap<>();
		for ( String name : names ) {
			if ( map.containsKey(name) ) {
				int count = map.get(name);
				count = count + 1;
				map.put(name, count);
			} else {
				map.put(name, 1);
			}
		}
		System.out.println(map);
	}
}

