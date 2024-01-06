public class recursion{
    public static void main(String args[]){
        int n = 5;
        // printNumbers(n);
        // addFirstNaturalNumbers(1,5,0);
        int factorial = calculateFactorial(n);
        System.out.println(factorial);
    }
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
    


}