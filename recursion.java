public class recursion{
    public static void main(String args[]){
        int n = 5;
        printNumbers(n);
    }
    public static void printNumbers(int n){
        if(n==0)
            return;
        System.out.print(n + " ");
        printNumbers(n-1);
    }
}