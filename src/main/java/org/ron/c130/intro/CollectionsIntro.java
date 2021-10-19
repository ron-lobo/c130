package org.ron.c130.intro;

import org.apache.commons.collections4.list.TreeList;
import org.ron.c130.my1stOOP.Pet;

import java.util.*;

public class CollectionsIntro {

    public static void main(String[] args) {
        CollectionsIntro ci = new CollectionsIntro();
        ci.arrays();
        ci.lists();
        ci.sets();
        ci.maps();
        ci.collections();
        ci.sorting();
    }

    private void arrays() {
        System.out.println("\nArrays()");
        int[] numbers = new int[]{9, 8, 7, 1, 2};
        System.out.println("length of numbers: " + numbers.length);

        String[] strings = new String[]{"one", "two", "three"};
        strings[1] = null;
        for (int i = 0; i < strings.length; i++) {
            System.out.println("strings[" + i + "] = " + strings[i]);
        }
        for (String str : strings) {
            System.out.println("str = " + str);
        }
    }

    private void lists() {
        System.out.println("\nLists()");

        List<String> strings1 = new LinkedList<>();
        List<String> strings2 = new ArrayList<>();
        List<String> strings3 = new TreeList<>();
        strings1.add("zero");
        strings1.add(null);
        strings1.add("zero");
        manipulateList("LinkedList", strings1);
        manipulateList("ArrayList", strings2);
        manipulateList("apache commons TreeList", strings3);

        ((ArrayList<String>) strings2).trimToSize();

        processCollection(strings1);

        strings2 = List.of("a", "bc", "def", "ijk", "rst", "pq");
//        strings2.add("xyz");
        strings1 = new ArrayList<>(strings2);
        strings1.add("xyz");
        strings1.remove("ijk");
    }

    private void manipulateList(String text, List<String> strings) {
        System.out.println("\nabout to manipulate list " + text);
        if (strings.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List is not empty");
        }
        System.out.println(strings.isEmpty() ? "List is empty" : "List is not empty");

        strings.add("one");
        strings.add("two");
        strings.add("three");
        System.out.println("length of strings: " + strings.size());
        for (String str : strings) {
            System.out.println("str = " + str);
        }
        strings.remove("two");
        System.out.println("length of strings: " + strings.size());
        strings.add("four");
        strings.add("five");
        strings.add("zero");
        System.out.println("length of strings: " + strings.size());
    }

    /**
     * LL -> c0[obj, ref->c2] c2[obj3, ref->c1] c1[obj2, ref->null]
     * <p>
     * LL -> c1 -> c2 -> c0
     */

    private void sets() {
        System.out.println("\nsets()");
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();
        processSet("hashset", set1);
        processSet("treeset", set2);
        processCollection(set1);

        set1 = Set.of("abc", "def", "ijk", "xyz");
//        set1.remove(null);
        set2 = new HashSet<>(set1);
        set2.add("hello");
    }

    private void processSet(String text, Set<String> set) {
        System.out.println("\nProcessing set: " + text);
        set.add("cat");
        set.add("dog");
        set.add("piggy");
        set.add("horse");
        set.add("sheep");
        set.add("dog");
        set.add("piggy");
        set.add("horse");
        System.out.println("set size = " + set.size());
        set.remove("");
//        set.remove(null);
        set.remove("cat");
        set.remove("horse");
        System.out.println("set size = " + set.size());
        System.out.println("contents of set ...");
        for (String str : set) {
            System.out.println("   " + str);
        }
    }

    private void processCollection(Collection<String> collection) {
        System.out.println("\nProcessing collection ... size = " + collection.size());
        int i = 0;
//        for (String str : collection) {
//            if (++i % 2 == 0) {
//                collection.remove(str);
//            }
//        }
        for (Iterator<String> iter = collection.iterator(); iter.hasNext(); ) {
            String str = iter.next();
            if (++i % 2 == 0) {
                System.out.println("removing " + str);
                iter.remove();
            }
        }
        System.out.println("collection size = " + collection.size());
        System.out.println("collection is " + (collection.isEmpty() ? "empty" : "not empty"));
    }

    public void maps() {
        System.out.println("\nMaps()");
        Map<Integer, String> map1 = new HashMap<>();
        Map<Integer, String> map3 = new LinkedHashMap<>();
        processMap(map1, "hashmap");
        processMap(map3, "linked hash map");

        Map<String, List<String>> map2 = new TreeMap<>();

        Map<String, String> map4 = new TreeMap<>();
        map4 = Map.of("a", "b", "x", "y", "i", "j", "p", "s", "r", "t");
        map4 = Map.ofEntries(Map.entry("a", "b"), Map.entry("h", "t"), Map.entry("e", "x"));
        // map4.put("", "");
        map4 = new TreeMap<>(map4);
        map4.put("", null);
    }

    private void processMap(Map<Integer, String> stringMap, String text) {
        System.out.println("processing map: " + text);
        stringMap.put(201, "Ironman");
        stringMap.put(400, "Spiderman");
        stringMap.put(305, "Batman");
        stringMap.put(202, "Thor");
        stringMap.put(325, "Hulk");

        System.out.println("map size = " + stringMap.size());
        for (Integer i : stringMap.keySet()) {
            System.out.println("  key=" + i + " value=" + stringMap.get(i));
        }

        stringMap.put(202, "Captain Marvel");
        stringMap.remove(201, null);
        stringMap.remove(201, "Black Widow");
        stringMap.remove(325);
        stringMap.put(202, "Captain Marvel");
        stringMap.put(203, "Captain America");
        System.out.println("map size = " + stringMap.size());

        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.println("  key=" + entry.getKey() + " value=" + entry.getValue());
        }

        System.out.println("room 333 is occupied by " + stringMap.getOrDefault(333, "nobody"));
    }

    private void collections() {
        System.out.println("\ncollections");

        List<String> list0 = List.of("abc", "xyz", "ijk");

        List<String> synchList = Collections.synchronizedList(new ArrayList<>(list0));
        synchList.add("pqr");

        List<String> list1 = new ArrayList<>();
        list1.addAll(synchList);

//        list1.sort(null);
        Collections.sort(list1);
//        Collections.sort(list1, null);
        for (String s : list1) {
            System.out.println(s);
        }
    }

    private void sorting() {
        System.out.println("\nsorting");

        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet("Rover", "Poodle", 3, 'M', true));
        petList.add(new Pet("Garfield", "Cat", 5, 'L', true));
        petList.add(new Pet("Jaws", "Goldfish", 2, 'S', false));
        petList.add(new Pet("Rover", "Rat", 4, 'L', true));

        System.out.println("petlist (pre-sort): ");
        for (Pet pet : petList)
            System.out.println("    " + pet);

//        Collections.sort(petList, new PetComparator());
        petList.sort(new PetComparator().reversed());

        System.out.println("petlist (post-sort 1): ");
        for (Pet pet : petList)
            System.out.println("    " + pet);

        petList.sort(new Comparator<Pet>() {
            public int compare(Pet p1, Pet p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });

        System.out.println("petlist (post-sort 2): ");
        for (Pet pet : petList)
            System.out.println("    " + pet);

        Collections.sort(petList);
        System.out.println("petlist (natural order): ");
        for (Pet pet : petList)
            System.out.println("    " + pet);

    }

    public static class PetComparator implements Comparator<Pet> {
        public int compare(Pet p1, Pet p2) {
            int i = p1.getName().compareTo(p2.getName());
            if (i == 0)
                i = Integer.compare(p1.getAge(), p2.getAge());
            if (i == 0)
                i = p1.getType().compareTo(p2.getType());
            return i;
        }
    }
}
