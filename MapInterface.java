/*
Map Interface:
--Storing in key-value pairs
--key => unique, but values can be duplicate
--methods: put(key, value), containsKey(key), remove(key), 
           map.getorDefault(key, default value like 0)*/


import java.util.*;
public class MapInterface {
    public static void main(String[] args){
        int[] array = {1,2,3,3,4,5};
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<array.length;i++){
            mp.put(i, array[i]);
        } 
        //System.out.println(mp);
        //System.out.println(mp.keySet());
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
}
