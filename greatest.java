import java.util.*;
public class greatest{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max;
        if(a>b && a>c){
            max = a;
        }
        else if(b>c){
            max = b;
        }
        else{
            max = a;
        }
        System.out.println(max);
        sc.close();
    }
}