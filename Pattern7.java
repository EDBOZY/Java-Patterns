public class Solution {
    public static void gameOfAlphabet(int n) {
        // Write your code here
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                char h=(char)('A'+j-1);
                System.out.print(h +" ");
                j=j+1;
            } 
            System.out.println();     
            i=i+1; 
         }
    }
}
