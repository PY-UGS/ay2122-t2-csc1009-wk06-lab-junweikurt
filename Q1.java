import java.util.*;

public class Q1 {
    public static void main(String[] args){

        LinkedList <Integer> linkedList = new LinkedList<Integer>();
        linkedList.add (1);
        linkedList.add (3);
        linkedList.add (5);
        linkedList.add (7);
        linkedList.add (9);
        linkedList.add (11);
        System.out.println(linkedList);
        
        addAndSort(linkedList, 10);
        System.out.println(linkedList);
        
    }
    public static LinkedList<Integer> addAndSort(LinkedList<Integer>linkedList, int value){
        linkedList.add(value);
        Collections.sort(linkedList);
        return linkedList;
    }
}
