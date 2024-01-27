import java.util.*;
public class loops_in_java {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        // for loop

        /*System.out.println("for loop");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }*/

        // while loop
        
        /*System.out.println("while loop");
        int j = 1;
        while (j<6) {
            System.out.println("Hello World");
            j++;
        }*/

        // Do while loop
        /*int k =0;
        do {
            System.out.println(k);
            k++;
        } while (k<5);
        */

        // Print sum of n natural numbers
        /*int n = 5;
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum = sum + i;
        }System.out.println(sum);*/

        /*
        // Print the table of 2
        int num = 2;
        for (int i = 1; i <=10; i++) {
            System.out.println(num*i);
        }
        */
/*
    //    Print natural numbers from 100 to 200
        // for(int i=100;i<=200;i++){
        //     System.out.print(i + " ");
        // }
        int i = 100;
        while(i<=200){
            System.out.print(i + " ");
            i++;
        }

    //    Print first N natural numbers
       int n = sc.nextInt();
       int i = 1;
       do{
            System.out.print(i+" ");
            i++;
       }while(i<=n);

    //   print first n odd numbers
        int N = sc.nextInt();
        for(int i = 1;i<=N*2;i=i+2){
            System.out.print(i + " ");
        }

        for(int i = 7; i!=0;i--){
            System.out.print(i + " ");
        }

    // Print first n natural numbers in reversed order
    int n = sc.nextInt();
    for(int i = n;i>0;i--){
        System.out.print(i + " ");
    }

    // print the following pattern
    // ****
    // ***
    // **
    // *
    for(int i = 4 ; i>=0;i--){
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
    
    //    Print first n even numbers
        int n = sc.nextInt();
        int i = 1;
        while(i <= n*2){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
    
    // Print factorial of a given number;
    int n = sc.nextInt();
    int factorial = 1;
    for(int i=1;i<=n;i++){
        factorial*=i;
    }
    System.out.print(factorial);
    */
//    Print sum of numbers occuring the table of 8
    int sum = 0;
    for(int i = 1;i<=10;i++){
        sum +=i*8;
    }
    System.out.print(sum);
    }
}
