import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int row = sc.nextInt();
		int rows=(row+1)/2;
        sc.close();
        
        int i = 1;
        int j = 1;
        while (i <= rows) {
            j = 1;
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = rows - 1;
        while (i >= 1) {
            j = 1;
            while (j <= rows - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i * 2 - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

