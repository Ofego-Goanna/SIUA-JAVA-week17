import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CollectionsPractice {

	public static void play() {
		System.out.println("Inside play");

		// Lists - just an ordered list of instances
		List<String> stringList = new ArrayList<>();
		stringList.add("Testing");
		stringList.add("What's this");
		stringList.add("Testing");
		// remove
		stringList.remove("Testing");

		// contains
		boolean doesContain = stringList.contains("testing");
		System.out.println("Does it contain testing? " + doesContain);

		// retain
		System.out.println("List before calling retainAll: " + stringList);
		List<String> toRetainList = new ArrayList<>();
		toRetainList.add("What's this");
		toRetainList.add("something else");

		stringList.retainAll(toRetainList);
		System.out.println("List after calling retainAll: " + stringList);

		// Sets - the order is not the same as for lists
		// - all items inside a set are unique

		// Maps - contains pairs of key & value
		// - the keys are treated like a set
		// - values are treated like a list

	}

	public static void play2() {
		// Lists - just an ordered list of instances

		// Sets - the order is not the same as for lists
		//      - all items inside a set are unique

		// Maps - contains pairs of key & value
		//      - the keys are treated like a set
		//      - values are treated like a list
		
		// Do I need a specific order?
		// -- If yes, lean towards lists
		// -- if no, not quite sure yet
		// Do the items need to be unique?
		// -- If yes, probably a set, maybe a map
		// -- if not, whatever, not sure yet
		// How will I use the items inside the collection later?
		// -- if I need a short reference that is NOT an index, then use a map
		// -- if I simply will loop over all items anyway, then either a set, or a list
		
		
		// Lists: In almost all cases: ArrayList
		// LinkedList: I have to add in the middle, 
		//             and/or I need to remove somewhere in the middle very often
		
		// Sets: HashSet, TreeSet
		// In almost all cases: HashSet
		// If you need to control the order: TreeSet
		
		// If you need to control order by something 
		//  other than when things were added: Look for the word Tree
		
		// Maps: HashMap, TreeMap
		// In almost all cases: HashMap
		// If you need to control the order: TreeMap
		
		// We have ways to convert a List into a Set or Map, and vice versa
		
		// Map to set or list:
		Map<String, String> demoMap = new HashMap<>();
		demoMap.put("key1", "value1");
		demoMap.put("key2", "value2");
		demoMap.put("key3", "value1");
		demoMap.keySet();
		Set<String> valuesAsSet = new HashSet<>(demoMap.values());
		List<String> valuesAsList = new ArrayList<>(demoMap.values());
		
		System.out.println("demoMap: " + demoMap);
		System.out.println("valuesAsSet: " + valuesAsSet);
		System.out.println("valuesAsList: " + valuesAsList);
		
		
		// Set to List
		List<String> setAsList = new ArrayList<>(valuesAsSet);
		System.out.println("setAsList: " + setAsList);

		// List to Set
		Set<String> listAsSet = new HashSet<>(valuesAsList);
		System.out.println("listAsSet: " + listAsSet);
	}

}
