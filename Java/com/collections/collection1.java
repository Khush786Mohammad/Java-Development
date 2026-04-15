import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
public class collection1 {
    public static void main(String[] args){
        // ArrayList
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(16);
        list.add(7);

        Collections.sort(list);  
        list.add(1,3);
        System.out.println(list.get(3));
        list.set(1,10);
        System.out.println(list);

        List<Integer> list2 = new LinkedList<Integer>();
        list2.add(20);
        list2.add(15);
        list2.add(26);
        list2.add(17);
        System.out.println(list2);

        list.addFirst(9);
        list.addLast(99);
        System.out.println(list); 

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        //linkedHashSet maintains the insertion order.
        //while HashSet does not maintain any order.
        //TreeSet maintains the natural order of the elements. 
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(null);
        set.add(10); // Duplicate element, will not be added
        System.out.println(set);
        System.out.println(set.contains(30));
        System.out.println(set.contains(18));

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // Set<Integer> treeSet = new TreeSet<>(set);
        // treeSet.add(null);
        // System.out.println(treeSet);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Alice", 85);
        map.put("Bob", 90);
        map.put("Charlie", 78);
        System.out.println(map);

        for(String keys : map.keySet()){
            System.out.println(keys + ": " + map.get(keys));
        }

        for(Integer values: map.values()){
            System.out.println(values);
        }

        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
} 
