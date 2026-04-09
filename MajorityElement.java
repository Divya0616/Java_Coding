import java.util.HashMap;
import java.util.Map;

public class MajorityElement{
    public int majorityElement(int[] nums) {
        Map <Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            mp.put(i, mp.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(mp.get(i)>n/2) return i;
        }
        return 0;
    }
}

