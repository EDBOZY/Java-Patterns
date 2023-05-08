import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n-i){
				System.out.print(" ");
				j=j+1;
			}
			int p=1;
			while(p<=i){
				System.out.print("*");
				p=p+1;
			}
			int q=i-1;
			while(q>=1){
				System.out.print("*");
				q=q-1;
			}
			System.out.println();
			i=i+1;	
		}
		
		
	
		
	}

}
