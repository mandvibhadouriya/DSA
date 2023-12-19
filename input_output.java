import java.util.*;
public class input_output {
    public static void main(String[] args) {
        // int a = 15;
        // int b = 10;
        
        // System.out.println(a+b);
        // int c = a+b;
        // System.out.print("Sum of a and b is ");
        // System.out.println(c);
        Scanner sc = new Scanner(System.in);
        System.out.print("Give value for x : ");
        int x = sc.nextInt();
        System.out.print("Give value for y : ");
        int y = sc.nextInt();
        System.out.print("Value of x is : ");
        System.out.println(x);
        System.out.print("Value of y is : ");
        System.out.println(y);
        int z = x+y;
        System.out.print("Sum of x and y is : ");
        System.out.println(z);
        int p = x*y;
        System.out.print("Product of x and y is ");
        System.out.println(p);
        int q = x/y;
        System.out.print("Division of x and y is ");
        System.out.println(q);

    }
}
