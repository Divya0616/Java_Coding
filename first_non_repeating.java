import java.util.*;

public class first_non_repeating {
    public static Character solve(String s){
        char[] arr = s.toCharArray();
        int n = s.length();
        int[] freq = new int[26];
        for(char ch : arr){
            freq[ch-'a']++;
        }
        for(char ch: arr){
            if(freq[ch-'a']==1) return ch;
        }
        return '@';
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }
}
