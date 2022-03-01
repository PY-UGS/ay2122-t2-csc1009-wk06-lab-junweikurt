import java.util.*;
public class Q3 {
    public static void main(String[] args){

        LinkedList <Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i <500; i++){
            linkedList.add(generateRandomNum(1000,9999));
        }
        int test = generateRandomNum(1000, 9999);
        if (linkedList.contains(test)){
            System.out.print(test + " found in index " + findValue(linkedList, test)); 
        }
        else
        {
            System.out.print(test +" not found");
        }

    }
    public static int findValue(LinkedList<Integer> linkedList, int searchVal){
        return linkedList.indexOf(searchVal);
    }
    public static int generateRandomNum(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
}