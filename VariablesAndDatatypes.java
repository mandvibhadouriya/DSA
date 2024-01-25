import java.util.*;
public class VariablesAndDatatypes{
    private static Scanner input = new Scanner(System.in);
    public static void main(String args[]){
        
        // Greet a user
        /*
        System.out.print("What's your good name : ");
        String uName = input.nextLine();
        System.out.println("Hello " + uName + ", Have a Good Day!");
        */

        // Detect an input is an integer or Not
        System.out.print("Input a number : ");
        String number = input.next();
        boolean isInteger = true;
        for(int i = 0;i<number.length();i++){
            if(!Character.isDigit(number.charAt(i))){
                isInteger = false;
                break;
            }
        }
        System.out.println(isInteger);
        // Convert Kilo meters into miles
        /*
        System.out.print("Enter distance in kilometer : ");
        double distInKm = input.nextDouble();
        double distInMiles = distInKm * 0.621371;
        // System.out.println("Converted to Miles, distance 'in Miles' : " + distInMiles);
        System.out.println(distInMiles);
        */

        // Sum three numbers
        /*
        System.out.println("Please enter any three numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int sumOfThreeNums = num1 + num2 + num3;
        System.out.println("Sum of all three numbers is " + sumOfThreeNums);
        */

        // Calculate CGPA of three marks
        /*
        int java = inputMarks("Java");
        int maths = inputMarks("Maths");
        int english = inputMarks("English");

        // Calculate CGPA
        float cgpa = (calculateCGPA("Java", java) + calculateCGPA("Maths", maths) + calculateCGPA("English", english)) / 3f;

        // Output CGPA
        System.out.println("Your calculated CGPA is " + cgpa);
    }
    public static int inputMarks(String subject){
        System.out.print("Enter Marks of the " + subject + " Subject : ");
        return input.nextInt();
    }

    public static int calculateCGPA(String subject, int marks){
        System.out.println("Grade of " + subject + " subject : ");
        char grade = input.next().charAt(0);
        int gp = 0;
        switch(grade){
            case 'S':
                gp = 10;
                break;
            case 'A':
                gp = 9;
                break;
            case 'B':
                gp = 8;
                break;
            case 'C':
                gp = 7;
                break;
            case 'D':
                gp = 6;
                break;
        }
        return gp;
    }
    */
    }
}
/*
    // My General Code
    System.out.println("Input your marks of three subjects 'Java', 'Maths', 'English' along with your Grades(UpperCase).");
        int java = input.nextInt();
        char gJava = input.next().charAt(0);
        int maths = input.nextInt();
        char gMaths = input.next().charAt(0);
        int english = input.nextInt();
        char gEnglish = input.next().charAt(0);
        int gpJava = 0; //GRADEPOINTS
        int gpMaths = 0;
        int gpEnglish = 0;
        switch(gJava){
            case 'S':
                gpJava = 10;
                break;
            case 'A':
                gpJava = 9;
                break;
            case 'B':
                gpJava = 8;
                break;
            case 'C':
                gpJava = 7;
                break;
        }
        switch(gEnglish){
            case 'S':
                gpEnglish = 10;
                break;
            case 'A':
                gpEnglish = 9;
                break;
            case 'B':
                gpEnglish = 8;
                break;
            case 'C':
                gpEnglish = 7;
                break;
        }
        switch(gMaths){
            case 'S':
                gpMaths = 10;
                break;
            case 'A':
                gpMaths = 9;
                break;
            case 'B':
                gpMaths = 8;
                break;
            case 'C':
                gpMaths = 7;
                break;
        }
        float cgpa = (float)(gpEnglish + gpJava + gpMaths)/3;
        System.out.println("Your calculated CGPA is " + cgpa);
        */

        // Calculate Percentage of a CBSE student from 5 subjects   
        /*
        System.out.println("Enter your all subjects marks below : ");
        System.out.print("Mathematics : ");
        int math = input.nextInt();
        System.out.print("Physics : ");
        int physics = input.nextInt();
        System.out.print("Chemistry : ");
        int chemistry = input.nextInt();
        System.out.print("English : ");
        int english = input.nextInt();
        System.out.print("Hindi : ");
        int hindi = input.nextInt();

        float percentage = (float)(math + physics + chemistry + english + hindi)/5;
        System.out.println("Your total Percentage : " + percentage);
 */