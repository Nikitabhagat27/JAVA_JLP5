package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyList {

	public static void main(String[] args) {
//		List al = new ArrayList();//Object
		List<Object> al = new ArrayList<>();
		al.add(10);
		al.add("Amit");
		al.add('A');
		al.add(20);
		al.add(55.5);
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(30);

		System.out.println("List: " + list + " size: " + list.size());
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(30);
		System.out.println("Set: " + set + " size: " + set.size());

	}
}

