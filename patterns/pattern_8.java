/*for n=5
-*********-
--*******--
---*****---
----***----
-----*-----

*/
package patterns;
import java.util.*;
public class pattern_8 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        for(int s=0;s<=i;s++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*(n-i)-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    sc.close();
}
}