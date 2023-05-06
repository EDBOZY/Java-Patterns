public class Solution {
    public static void alphabetPattern(int n) {
       
        int i=1;
        while(i<=n){
            int j=1;
           
            while(j<=i){
                char ch=(char)('A'+n-j);
                System.out.print(ch);

                j=j+1;

            }
            System.out.println();
            i=i+1;
        }
    }
}
