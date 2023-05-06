import java.util.*;
public class Solution {
    public static void trianglePattern(int n) {
       
		
		int i=1;
		while(i<=n){
			int j=1;
			int p=n;
			while(j<=i){
                
				System.out.print(p+" ");
				j=j+1;
                p=p-1;


			}
			System.out.println();
			i=i+1;
		}
    }
}
