import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
    }
}
