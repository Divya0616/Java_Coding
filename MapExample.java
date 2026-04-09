import java.util.*;
public class MapExample {
    public static void main(String[] args){
        Map<Integer, Integer> mp = new HashMap<>();
        int[] arr = {1,2,3,1,1,1,2,4,3};
        for(int i:arr){
            if(mp.containsKey(i)){
                mp.put(i, mp.get(i)+1);
            }
            else{
                mp.put(i,1);
            }
            //instead of if - else
            //we can just use 
            // mp.put(i, mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey() + " exists " + entry.getValue() + " times ");
        }
    }
}
