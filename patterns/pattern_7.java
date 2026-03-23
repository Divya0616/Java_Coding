/*for n=5
-----*-----
----***----
---*****---
--*******--
-*********-
 */
package patterns;
import java.util.*;
public class pattern_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }
            for(int j=0;j<=2*i;j++){
                System.out.print("*");
            }
            /*for(int s=0;s<n-i;s++){
                System.out.print(" ");
            }*/
           //output is the same even without compiling the last loop
            System.out.println();
     }
     sc.close();
    }
}
