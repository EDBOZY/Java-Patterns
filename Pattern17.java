import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        System.out.println("*");
        while (i <= n) {
            int j = 1;
            System.out.print("*");
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            int k = i - 1;
            while (k >= 1) {
                System.out.print(k);
                k--;
            }
            System.out.print("*");
            System.out.println();
            i++;
        }
        i = n - 1;
        while (i >= 1) {
            int j = 1;
            System.out.print("*");
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            int k = i - 1;
            while (k >= 1) {
                System.out.print(k);
                k--;
            }
            System.out.print("*");
            System.out.println();
            i--;
        }
        System.out.print("*");
    }
}

