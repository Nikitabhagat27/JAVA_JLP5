package collection;


	import java.util.Iterator;
	import java.util.Set;
	import java.util.TreeSet;

	public class MySet {

		public static void main(String[] args) {
//			Set<Integer> set = new HashSet<>();
//			Set<Integer> set = new LinkedHashSet<>();
			Set<Integer> set = new TreeSet<>();
			set.add(10);
			set.add(20);
			set.add(30);
			set.add(80);
			set.add(40);
			set.add(50);
			set.add(30);

			for ( int e : set ) {
				System.out.print(e + " ");
			}
			System.out.println();
			Iterator<Integer> iterator = set.iterator();
			while ( iterator.hasNext() ) {
				System.out.print(iterator.next() + " ");
			}
			System.out.println();
			set.forEach(System.out::println);
			System.out.println();
			set.stream().forEach(System.out::println);
			set.stream().forEach(e -> System.out.print(e + " "));

		}
}
