import java.util.*;
public class WaveForm{
    public static String wave_pattern(String s){
        int n = s.length();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<n;i+=2){
            res.append(s.charAt(i));
        }
        for(int i=n-1;i>=0;i-=2){
            res.append(s.charAt(i));
        }
        return res.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(wave_pattern(s));
    }
}