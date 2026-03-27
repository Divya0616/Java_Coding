import java.util.*;
public class Words_EvenLength {
    public static String solve(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(s.charAt(i)!=' ' && (i==0||s.charAt(i-1)==' ')){
                int j = i;
                while(j<n && s.charAt(j)!=' '){
                    j++;
                }
                int len = j-i;
                if(len%2==0){
                    for(int k=i;k<j;k++){
                        sb.append(s.charAt(k));
                    }
                    sb.append(' ');
                }
                i=j-1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solve(s));
    }
}
/*BETTER APPROACH
StringBuilder res = new StringBuilder();
char[] arr = str.toCharArray();
int start=0;
for(int i=0;i<arr.length;i++){
    if(i==arr.length || arr[i]==''){
        int length = i-start;
        if(length>0 && length%2==0){
            res.append(arr,start, length).append(" ");
        }
        start = i+1;
    }
}

*/