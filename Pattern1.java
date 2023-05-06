import java.util.*;
public class Solution {
    public static void gameOfPattern(int n) {
        // Write your code here
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("#");
                j=j+1;
            }
            System.out.print("\n");
            i=i+1;
        }
    }
}
