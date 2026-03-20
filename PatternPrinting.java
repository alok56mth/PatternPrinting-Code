/*
Input: n = 5

1
3 2
6 5 4
10 9 8 7
15 14 13 12 11
 */


public class PatternPrinting {

    public static void main(String[] args) {
        int n=5;

        for(int i=0; i<=n; i++){
            int end = i*(i+1)/2;
            for(int j=end; j>end-i; j--){
                System.out.print(j + " ");
            }
            System.err.println();
        }
    }
}
