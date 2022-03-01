import java.util.*;
public class Q5 {
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
        swap(hashmap,1,5);
        System.out.println(hashmap);

    }
    public static void swap( HashMap <Integer,Integer> hashmap, int index1, int index2){
        int temp = hashmap.get(index1);
        hashmap.put(index1, hashmap.get(index2));
        hashmap.put(index2, temp);
    }
    
}
