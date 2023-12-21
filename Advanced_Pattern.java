/**
 * Advanced_Pattern
 */
public class Advanced_Pattern {

    public static void main(String[] args) {
        // *        *
        // **      **
        // * *    * *
        // *  *  *  *
        // *   **   *
        // *   **   *
        // *  *  *  *
        // * *    * *
        // **      **
        // *        *
        /*
        int n =5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if (i==j || j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if (i==j || j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                if (i==j || j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                if (i==j || j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
         */
// Hollow Rhombus
    //       *****
    //      *   *
    //     *   *
    //    *   *
    //   *****
    /* 
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n; j++) {
                if (i==1 || j==n || j==1 || i==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    */
        
    }
}