import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=0;
		char h='A';
		while(i < n){
    		int j = 0;
    		while(j <= i){
        		System.out.print((char)(65+i));
        		j++;
    		}
    		System.out.println();
   		 i++;
	}
		
	}

}
