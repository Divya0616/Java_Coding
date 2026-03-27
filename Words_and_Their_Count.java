import java.util.*;

public class Words_and_Their_Count {
    public static String solve(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int count=1;
            while(i<n-1 && (s.charAt(i)== s.charAt(i+1))){
              count++;
              i++;
            }
            sb.append(count);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }
}
