import java.util.*;
public class Solution {


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n){
			int j=1;
			int p=i;
			while(j<=i){
                
				System.out.print(p);
				j=j+1;
                p=p-1;


			}
			System.out.println(" ");
			i=i+1;
		}
		
		

		
	}

}
