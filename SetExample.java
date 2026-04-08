/*
SET Interface:
--stores only unique values and it does not allow duplicates
--uses hashcode() and equals()
--faster access

HashSet
--does not allow duplicates
--stores in random order
--methods available : add(), remove(), contains() - returns boolean, size()

Linked HashSet
--doesnt allow duplicates
--Hashing for faster access
--maintains insertion order
--Doubly linkedlist for insertion order

*/
import java.util.*;

public class SetExample{
    public static void main(String[] args){
        Set<Integer> Linkedset = new LinkedHashSet<>();
        Set<Integer> Hset = new HashSet<>();
        int[] arr = {5,3,9,1,7,2};
        for(int i:arr){
            Linkedset.add(i);
            Hset.add(i);
        }
        System.out.println(Linkedset);
        System.out.println(Hset);
    }
}