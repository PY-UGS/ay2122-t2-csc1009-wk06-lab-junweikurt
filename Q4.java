import java.util.*;
public class Q4 {
    public static void main(String[] args){
        HashMap <Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        LinkedList <Integer> linkedList = new LinkedList<Integer>();
        linkedList.add (1);
        linkedList.add (3);
        linkedList.add (5);
        linkedList.add (7);
        linkedList.add (9);
        linkedList.add (11);
        for (int i = 0; i < linkedList.size(); i++) {
            hashmap.put(i, linkedList.get(i));
        }
        System.out.println(hashmap);
        addAndSort(hashmap, 6);
    }
    public static void addAndSort(HashMap<Integer, Integer> hashmap, int value) 
    {
        hashmap.put(hashmap.size(), value);      
        hashmap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
                
    }
}
