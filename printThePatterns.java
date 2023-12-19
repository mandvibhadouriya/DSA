public class printThePatterns {
    public static void main(String[] args) {
        
        // *****
        // *****
        // *****
        // *****
        /* 
        for (int i = 1; i < 5; i++) {
            // System.out.println("*");
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */

        // *****
        // *   *
        // *   * 
        // *****
        /*
        int n=4;
        int m=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                if (i==1||j==1||i==n||j==m) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        */
        // *
        // ** 
        // *** 
        // ****
        /* 
        for (int i = 1; i <=4; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
        }
        */
        // ****
        // ***
        // **
        // *
        /* 
        int n = 4;
        for (int i=n; i>=1; i--) {
                for (int j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
        }
        */
        //    *
        //   **
        //  ***
        // ****
        /* 
        int n=4;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        // 1
        // 12
        // 123
        // 1234
        // 12345
        /* 
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        */
        // 12345
        // 1234
        // 123
        // 12
        // 1
        /*
        int n = 5;
        for (int i=n; i>=1; i--) {
                for (int j=1; j<=i; j++) {
                    System.out.print(j);
                }
                System.out.println("");
        }
        */
        // Floyd's Triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // int n=5;
        // int num = 1;
        // for (int i = 1; i <=n; i++) {
        //         for (int j = 1; j <=i; j++) {
        //             System.out.print(num + " ");
        //             num = num + 1;
        //         }
        //     System.out.println("");
        // }
        // 1 
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        /* 
        int n = 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if ((i+j)%2==0) {
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        */
    //      *****
    //     *****
    //    *****
    //   *****
    //  *****
    /* 
        int n=5;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <=n; j2++) {
                    System.out.print("*");
                }
            System.out.println();
        }
        */
    //      1 
    //     2 2
    //    3 3 3
    //   4 4 4 4
    //  5 5 5 5 5
    /* 
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                    System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        */
    //      1
    //     212
    //    32123
    //   4321234
    //  543212345
    /* 
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1;j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        */
        // Butter Fly Pattern
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        /* 
        int n = 4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
    }
        */
        // Diamond's Shape
    //      *
    //     ***
    //    *****
    //   *******
    //   *******
    //    *****
    //     ***
    //      *
        int n=4;
        for (int j = 1; j <=n; j++) {
            for (int j2 = 1; j2 <=n-j; j2++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= 2*j-1; j2++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }
        for (int j = n; j >=1; j--) {
            for (int j2 = 1; j2 <=n-j; j2++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= 2*j-1; j2++) {
                System.out.print("*");
                
            }
            System.out.println("");
        }

    }
}
