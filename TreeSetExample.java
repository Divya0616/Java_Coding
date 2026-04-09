/*
TreeSet:
--uses self balancing tree(Red-Black Tree) internally
--Binary Search Tree
-- Inorder => Left, Root, Right
--methods : add(), remove(), contains(), .first() - smallest no, 
            .last() - largest no, .ceil() - checks highest,
             .floor() - checks lowest, higher(), lower()
--Used to find the nearest element

for(int i:arr){
    Tset.add(i);
}
    Integer lower = Tset.lower(target);
    Integer higher = Tset.higher(target);
    int res=0;
    if(lower==null) res = higher;
    else if(higher==null) res=lower;
    
*/

import java.util.*; 
public class TreeSetExample{
    public static void Closest(int[] arr, int target){
        TreeSet <Integer> t = new TreeSet<>();
        for(int i:arr){
            //if(t.contains(target)){
                int small = t.lower(target);
                int high =  t.higher(target);
                int diff1 = target-small;
                int diff2 = high-target;
                if(diff1<diff2) System.out.println(diff1);
                else if(diff2<diff1) System.out.println(diff2);
                else{
                    System.out.println(diff1);
                    System.out.println(diff2);
                }
            //}
            t.add(i);
        }
    }
    public static void main(String[] args){
        int[] arr = {10,20,10,25};
        System.out.println(Closest(arr, 20));
    }
}