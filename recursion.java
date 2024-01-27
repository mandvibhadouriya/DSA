import java.util.*;
public class recursion{
    //factorial method
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
    //multiplication table method
    public static void multiplicationTable(int n,int i){
        if(i>10){
            return;
        }
        System.out.println(n*i);
        multiplicationTable(n,i+1);

    }
    // pattern method
    public static void printPattern(int n){
        for(int i = 1;i<n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // recursive function to print the sum of first n natural numbers
    
    public static void main(String args[]){

        //factorial of a number
        // int n = 4;
        // System.out.println(factorial(n));
        // multiplicationTable(4,1);
        // printPattern(5);
        



        // int n = 5;
        // printNumbers(n);
        // addFirstNaturalNumbers(1,5,0);
        // int factorial = calculateFactorial(n);
        // System.out.println(factorial);
        // int a = 0;
        // int b = 1;
        // System.out.println(a);
        // System.out.println(b);
        // int n = 5;
        // printFibSeq(a,b,n-2);

    //Print numbers from 5 to 1
    // public static void printNumbers(int n){
    //     if(n==0) //Base Case
    //         return; 
    //     System.out.print(n + " ");
    //     printNumbers(n-1);
    // }

    //print numbers from 1 to 5
    // public static void printNumbers(int n){
    //     if(n>5)
    //         return;
    //     System.out.print(n + " ");
    //     printNumbers(n+1);
    // }

    // Print sum of first n natural numbers
    // public static void addFirstNaturalNumbers(int i, int n, int sum){
    //     if(i==n){
    //         sum+=i;
    //         System.out.print(sum);
    //         return;
    //     }
    //     sum+=i;
    //     addFirstNaturalNumbers(i+1,n,sum);
    // }
    // Print factorial of a Number n
    // public static int calculateFactorial(int n){
    //     if(n==1 || n<=0){
    //         return 1;
    //     }else{
    //         return n * calculateFactorial(n-1);
    //     }
    // }

    // Print the fibonacci sequence till nth term
    // 0 1 1 2 3 5 8 13 21
    // public static void printFibSeq(int a,int b,int n){
    //     if(n==0)
    //         return;
    //     int c = a+b;
    //     System.out.println(c);
    //     printFibSeq(b,c,n-1);
    // }
    /*
    // Print x^n (stack height = n) x*x*x*x*x*x*x.......n times
    public static int printxPown(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpown = printxPown(x,n-1);
        int result = x * xpown;
        return result;
    }

    // Print x^n (with stack height = logn)
        int x = 2;
            int n = 5;
            int xpown = printxPown(x,n);
            System.out.println(xpown);
    */
    }
    
}