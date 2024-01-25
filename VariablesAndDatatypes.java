// Calculate Percentage of a CBSE student from 5 subjects
import java.util.*;
public class VariablesAndDatatypes{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
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
    }
}