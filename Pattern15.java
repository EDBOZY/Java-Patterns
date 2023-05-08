import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while (i <= n) {
    	int j = 1;
    	while (j <= n-i) {
       	 	System.out.print(" ");
        	j++;
    	}
    	int k = i;
    	while (k <= 2*i-1) {
        	System.out.print(k);
        	k++;
   		 }
    	k = 2*i-2;
    	while (k >= i) {
        	System.out.print(k);
        	k--;
   		 }
    	System.out.println();
    	i++;
}
		
	}
}
