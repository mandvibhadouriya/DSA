import java.util.*;
// import java.util.Arrays;
public class sTRINGS{
    public static void main(String []args){
        // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        /*
        String arr[] = new String[5];
        int arrLength = 0;
        for(int i=0;i<arr.length;i++){
            arr[i] = input.nextLine();
            arrLength +=arr[i].length();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(arrLength);
        System.out.println(arr.length);
        System.out.print(Arrays.toString(arr));
        Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
        Example : 
        original = "eabcdef" ; 
        result = "iabcdif"
        Original = "xyz" ; 
        result = "xyz";
    */
   /*
        Scanner input = new Scanner(System.in);
        String original = input.nextLine();
        String result = "";
        for(int i=0;i<original.length();i++){
            if(original.charAt(i)=='e'){
                result += 'i';
            } else {
                result += original.charAt(i);
            }
                
        }
        System.out.println("Original : " + original);
        System.out.println("Result : " + result);
    */
    /*
    Input an email from the user. You have to create a username from the email by deleting the part that comes after '@'. Display that username to the user.
    Example : 
    email = "apnaCollegeJava@gmail.com" ; username = "apnaCollegeJava" 
    email = "helloWorld123@gmail.com"; username = "helloWorld123"
    */
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your email : ");
        String email = Input.nextLine();
        String username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                username+=email.charAt(i);
            }
        }
        System.out.println("Your username is : " + username);

    }
}