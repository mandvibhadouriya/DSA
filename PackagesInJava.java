// package folder.folderL1.folderL2;
// package CalculatorPackage;
import java.util.Scanner;
class Calculator {
    void show(){
        System.out.println("Normal One.");
    }
}
class ScCalculator{
    void show(){
        System.out.println("Sc One.");
    }
}
class HybridCalculator{
    void show(){
        System.out.println("Hybrid One.");
    }
}
public class PackagesInJava{
    protected int proInt = 5;
    int defInt = 51;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hii " + name + ", Have a good day!");
    }
}