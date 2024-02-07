import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
class YoungAgeException extends RunTimeException{
    YoungAgeException(String msg){
        super(msg);
    }
}
public class ErrorsAndExceptions{
    public static void main(String [] args)// throws IOException --> for close() method
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age<18){
            throw new YoungAgeException("Your age is less than 18");
        }else{
            System.out.println("You can Vote");
        }
    
        // int arr[] = {1,2,3,4,5};
        // try{
        //     for(int i = 0;i<=arr.length+2;i++){
        //         System.out.println(arr[i]);
        //     }
        // }catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e);
        // }
        // Compile Time Exceptions
        // FileInputStream fis = new FileInputStream("d:/abc.txt");
        // try{
        //     FileInputStream fis = new FileInputStream("d:/abc.txt");
        // }
        // catch(Exception e){
        //     System.out.println(e);
        //     System.out.println("Check Again");
        // }
        // Class.forName("com.mysql.jdbc.Driver");
        // try{
        //     Class.forName("com.mysql.jdbc.Driver");
        // }
        // catch(Exception e){
        //     System.out.println(e);
        //     System.out.println("Check Again");
        // }

        // Run Time Exceptions
        // int a = 100;
        // int b = 0;
        // int c = a/b;
        // System.out.println(c);
        // try{
        //     int a = 100;
        //     int b = 0;
        //     int c = a/b;
        //     System.out.println(c);
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e);
        //     System.out.println("Can't divide by zero");
        // }
        // String name = null;
        // System.out.println(name.length());

        // System.out.println("I'm Mandvi");
        // System.out.println("1");
        // try{
        //     System.out.println("2");
        //     int a = 100;
        //     int b = 10;
        //     int c = a/b;
        //     System.out.println("3");
        //     System.out.println(c);
        //     System.out.println("4");
        // }
        // catch(Exception e){
        //     // System.out.println("5");
        //     // System.out.println(e);
        //     // System.out.println("6");
        //     // Methods to Print Exception
        //     // e.printStackTrace();
        //     // System.out.println(e);
        //     // System.out.println(e.toString());
        //     System.out.println(e.getMessage());
        // }
        // //finally block always execute
        // finally{
        //     System.out.println("I'm in finally block");
        // }
        // System.out.println("7");
        // String name = "Mandvi";
        // try{
        //     System.out.println(name.length());
        // }
        // finally{
        //     System.out.println(name + " - Finally Block");
            
        // }
        // FileInputStream fis = null;
        // try{
        //     fis = new FileInputStream("d:/abc.txt");
        // }
        // catch(FileNotFoundException e){
        //     System.out.println("File Not Found");
        // }
        // finally{
        //     if(fis!=null){
        //         fis.close();
        //     }
        //     System.out.println("File closed");
        // }

    }
}
