class A{
    int a = 10;
    void m1(){
        System.out.println("I'm M1 in class A");
    }
    A(){
        System.out.println("I'm constructor in class A");
    }
}
class B extends A{
    int a = 20;
    B(){
        //use 03
        super(); //Compiler by default use this super() to call the constructor of parent class
        System.out.println("I'm constructor in class B");
    }
    void m1(){
        System.out.println("I'm M1 in class B");
    }
    void show(int a){
        m1();
        super.m1(); //call imediate parent class method --> use 02
        System.out.println(a);
        System.out.println(this.a); //This keyword is a reference variable which is used to refer to the current object.
        // use 01
        System.out.println(super.a); //Super keyword is a reference variable which is used to refer to the parent class object
    }
}
public class Super{
    public static void main(String [] args){
        B b = new B();
        b.show(5);
    }
}