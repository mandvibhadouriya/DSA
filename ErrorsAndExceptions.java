import java.util.*;
public class ErrorsAndExceptions{
    public static void main(String [] args){
    
        int arr[] = {1,2,3,4,5};
        try{
            for(int i = 0;i<=arr.length+2;i++){
                System.out.println(arr[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}