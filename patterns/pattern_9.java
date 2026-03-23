package patterns;
/* for n=5
*
**
***
****
*****
****
***
**
*
 */
import java.util.*;
public class pattern_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<2*n-1;i++){
            int stars = i;
            for(int j=0;j<=stars;j++){
                System.out.print("*");
            }
            stars = 0;
            if(i>n-1){
                for(int j=0;j<(n-i);j++){
                    System.out.print("*");
                    stars++;
                }
            }
            System.out.println();
            sc.close();
        }
    
    }
}

        /*int start = 0;
        int end = nums.length()-1;
        int mid = 0;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(nums[mid]==target) return mid;
            //left half 
            if(nums[start]<=nums[mid])
            {
                if(target<=nums[mid]&&target>=nums[start])
                {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else
            {
             if(target>=nums[mid]&&target<=nums[end])
             {
                start = mid +1;
             }
             else
             {
                end = mid-1;
             }   
            }
        }
      return -1;  
    }*/