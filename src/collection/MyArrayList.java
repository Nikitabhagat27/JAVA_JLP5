package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(30);
		// How many ways, you can iterate the list
		// 1. for loop
		for ( int i = 0; i < list.size(); i++ ) {
			
		}
		System.out.println();
		// Enhance for loop
		for ( int e : list ) {
			System.out.print(e + " ");
		}
		System.out.println();
		// Iterator
		Iterator<Integer> iterator = list.iterator();
		while ( iterator.hasNext() ) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		// While
		int i = 0;
		while ( i < list.size() ) {
			System.out.print(list.get(i++) + " ");
		}
		System.out.println();
		list.forEach(System.out::println);
		System.out.println();
		list.forEach(e -> System.out.print(e + " "));
		System.out.println();
		list.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();
		list.stream().forEach(System.out::println);
	}
}
