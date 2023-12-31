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
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        char Char = 'i';
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==Char){
                
            }
                
        }
        System.out.println("Your name is " + name);
    }
}