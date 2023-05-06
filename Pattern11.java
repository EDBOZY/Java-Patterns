import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		
		while(i<=n){
			int j=1;
			
			while(j<=i){
				char ch=(char)('A'+n-i+j-1);
				
				System.out.print(ch);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		
	}
}
