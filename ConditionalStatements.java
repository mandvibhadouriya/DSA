import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Program to find out the type of the URL
        String URL = sc.nextLine();
        // System.out.println(URL);
        if(URL.endsWith(".com")){
            System.out.println("It's a Commercial Website.");
        }else if(URL.endsWith(".org")){
            System.out.println("It's an Organization Website.");
        }else if(URL.endsWith(".in")){
            System.out.println("It's an Indian Website.");
        }else{
            System.out.println(URL + ": Can't identify the type.");
        }
        
        /*
        // Check a leap Year
        int year = sc.nextInt();
        if(year % 4 ==0){
            System.out.println("Worship! It's leap Year. \nYou have one day extra.");
        }else{
            System.out.println("Not a Leap Year. \nGo get back to your work. Hahaha!!");
        }
        */
        
        /*
        // Find out the day of week given number
        int numberOfdayOfWeek = sc.nextInt();
        switch(numberOfdayOfWeek){
            case 1 : 
                System.out.println("It's Monday Boss!");
                break;
            case 2:
                System.out.println("It's Tuesday Boss!");
                break;
            case 3:
                System.out.println("It's Wednesday Boss!");
                break;
            case 4:
                System.out.println("It's Thrusday Boss!");
                break;
            case 5:
                System.out.println("It's Friday Boss!");
                break;
            case 6:
                System.out.println("Chill Boss!, it's Saturday.");
                break;
            case 7:
                System.out.println("Get Ready for Movie! It's Sunday.");
                break;
            default:
                System.out.println("Apologize! Can't help you Boss.");
                break;
        }
        */

        /*
        // Calculate income tax
        long income = sc.nextInt();
        double incomeTax = 0;
        if(income < 250000){
            incomeTax = 0;
        }else if(income > 250000 && income <= 500000){
            incomeTax = (long)income * 0.05;
        }else if(income > 500000 && income <= 1000000){
            incomeTax = (long)income * 0.20;
        }else if(income > 1000000){
            incomeTax = (long)income * 0.30;
        }else{
            System.out.println("Sorry! we can't calculate it.");
        }
        System.out.println(incomeTax);
        */

        /*
        int a = 10;
        if(a==11){
            System.out.println("I am 11");
        }else{
            System.out.println("I am not 11");
        }
        */
        /*
        // Whether a Student is fail or not
        int math = sc.nextInt();
        int physics = sc.nextInt();
        int chemisty = sc.nextInt();
        int total = math + physics + chemisty;
        if(total >= 120){
            if(physics >= 33 && math >=33 && chemisty >=33){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{
            System.out.println("Failed");
        }
        */
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // // if else statements
        // if (a<b) {
        //     System.out.println("a is lesser than b");
        // }else if (a>b) {
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("a and b are equal");
        // }

        // switch statement
        /*
        int button = sc.nextInt();
        switch (button) {
            case 1:System.out.println("Hello");
                break;
            case 2:System.out.println("Namaste");
                break;
            case 3:System.out.println("Bonjour");
                break;
            default:System.out.println("Press 1,2 or 3 only");
                break;
        }
        */
    }
}
