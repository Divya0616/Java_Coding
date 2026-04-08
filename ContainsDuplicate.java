import java.util.*;
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(s.contains(i)) return true;
            s.add(i);
        }
        return false;
    }
}

//2nd method:
/*
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i : nums){
            if(!(s.add(i))) return true;
            s.add(i);
        }
        return false;
    }
} */
