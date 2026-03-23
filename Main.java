import java.util.*;
public class Main{
//class name containing main method shld have the same name as the file name
    public static void main(String[] args){
        //runs first
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //String b = sc.nextLine();
        int r = sc.nextInt();
        double area = 3.14*(double)r*(double)r;
        //char c = sc.next().charAt(0);
        System.out.println(area);
        sc.close();
    }
}