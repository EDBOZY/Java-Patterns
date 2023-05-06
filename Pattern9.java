import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		char ch=(char)('A'+0);
		
		//char ch=(char)('A'+i);
		while(i<=n){
			int p=0;
			

			int j=1;
			while(j<=i){
				ch=(char)('A'+j+i-2);
				System.out.print(ch);
				j=j+1;
				//p=p+1;
			}
			System.out.println();
			i=i+1;
			p=p+1;
		}
		
	

		
	}

}
