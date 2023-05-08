import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		//int s=0;
		while(i<=n){
			int j=1;
			int su=0;
			while(j<=i){
				su=su+j;
				System.out.print(j);
				if (j < i) {
                    System.out.print("+");
                }
				j=j+1;
				
			}
			System.out.print("="+su);
			
			//Syso
			i=i+1;
			System.out.println();
		}
		
		
	}
}
