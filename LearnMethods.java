import java.util.Arrays;
public class LearnMethods{
    public static int sumOfTwoNums(int a,int b){
        int c = a + b;
        return c;
    }
    
    public static void foo(int a, int ... arr){  //Variable arguments [varargs]
        int result = a;
        for(int i : arr){
            result += i;
        }
        System.out.println(result);
    }
    public static void main (String [] args){
        // LearnMethods obj = new LearnMethods();
        // System.out.println(obj.sumOfTwoNums(2,3));
        System.out.println(sumOfTwoNums(2,3)); //static keyword
        foo(1,2,3,4,5); //Variable arguments [varargs]


    }
}