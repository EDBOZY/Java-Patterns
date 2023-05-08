import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int x=1;
		while(i<=n){
			int j=1;
			while(j<=n){
				System.out.print(x);
				x=x+2;
				if (x > (n * 2) ) {
                    x = x - (n * 2) ;
                }
				j++;

			}
			System.out.println();
			x = (x + 2) % (n * 2);
            if (x == 0) {
                x = 2;
            }
			i++;
		}
		
	}
}
