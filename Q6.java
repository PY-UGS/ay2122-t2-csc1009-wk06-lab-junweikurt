import java.util.*;
public class Q6 {
    public static void main(String[] args){
        HashMap <Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        for(int i = 0; i < 500; i++)
        {
            hashmap.put(i, generateRandomNum(1000,9999));
        }
        int test = generateRandomNum(1000,9999);
        if (hashmap.containsValue(test)== true)
        {
            System.out.print(test + " found in index " + findValue(hashmap, test));
        }
        else
        {
            System.out.print(test +" not found");
        }

    }
    public static int generateRandomNum(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static int findValue(HashMap<Integer, Integer> hashmap, int searchVal){
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() == searchVal){
                return entry.getKey();
            };
        }
        return -1;
    }
}
