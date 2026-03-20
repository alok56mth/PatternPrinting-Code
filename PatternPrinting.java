/*
4444444
33333
222
1
2222
333333
44444444
 */


public class PatternPrinting {

    public static void main(String[] args) {
        int n = 4;

        //Uppper part
        for (int i = n; i > 0; i--) {
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }

        //lower Part
        for (int i = 2; i <= n; i++) {
            for (int j = 2 * i; j > 0; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
