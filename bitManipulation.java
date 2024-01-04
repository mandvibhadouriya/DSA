import java.util.*;
public class bitManipulation{
    public static void main(String args []){
        // System.out.print("Hello World");
        // Write a program to find if a number is a power of 2 or not
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Enter a Valid Number");
        }else{
            if((n & (n-1)) ==0){
                System.out.println(n + " Is a Power of 2");
            }else{
                System.out.println(n + " Is not a Power of 2");
            }
        }
        */
       // Another approach
       /*
       while(n%2==0){
        n/=2;
       }
       if(n==1){
        System.out.println("Power of 2");
       }else{
        System.out.println("Not the Power of 2");
       }
       */
    //   Write a program to toggle a bit a position = "pos" in a number "n".
    /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = input.nextInt();
        System.out.println("TEll us the position : ");
        int position = input.nextInt();

        int bitMask = 1<<position;
        int newNumber = n & bitMask;
        System.out.println("The number will be " + newNumber);
    */
    // Write a program to count the number of 1's in a binary representation of the number.
    /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = input.nextInt();
        String binaryString = Integer.toBinaryString(n);
        System.out.println("The binary representation will be : " + binaryString);
        int count = 0;
        for(int i=0;i<binaryString.length();i++){
            if(binaryString.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println("The occurence of number 1 in a binary representation of given number is :" + count);
    */
//    Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a number from one number system to another. [BONUS]
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        String decToBin = decimalToBinary(n);
        int binToDec = binaryToDecimal(decToBin);
        System.out.println("Binary conversion of given number is : " + decToBin);
        System.out.println("Decimal conversion of Binary number is : " + binToDec);
    
    }
    public static String decimalToBinary(int n){
        return Integer.toBinaryString(n);
    }
    public static int binaryToDecimal(String decToBin){
        return Integer.parseInt(decToBin,2); //base 2
    }
}