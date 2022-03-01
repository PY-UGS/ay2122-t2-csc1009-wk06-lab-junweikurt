import java.util.*;
public class Q2 {
    public static void main(String[] args){

        LinkedList <Integer> linkedList = new LinkedList<Integer>();
        linkedList.add (1);
        linkedList.add (3);
        linkedList.add (5);
        linkedList.add (7);
        linkedList.add (9);
        linkedList.add (11);
        System.out.println(linkedList);
        swap(linkedList,1,5);
        
        System.out.println(linkedList);
    }
    public static LinkedList<Integer> swap(LinkedList<Integer> linkedList, int index1, int index2){
        int temp = linkedList.get(index1);
        linkedList.set(index1, linkedList.get(index2));
        linkedList.set(index2, temp);
        return linkedList;
    }
}
