/*
Iterator:
--Traversing collection elemnt by element through cursor
--methods: .hasNext() => checks next elements exixts or not, .next() => move cursor to next elemnt
            , remove() => remove the elemnt

List Iterator:
--works only wih list
--moves forward and backward
--methods: hasprevious(), 
*/

import java.util.*;
public class IteratorExample {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int curr = it.next();
            //System.out.println(curr + " ");
            if(curr==4) it.remove();
        }
        //while(it.hasPrevious()){
          //  int prev = it.previous();
            //System.out.println(prev);
        //}
    }
}
