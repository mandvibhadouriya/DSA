class Test{
    int i;
    void display(){
        System.out.println("hello");
    }
    /* 1st use to refer current class instance variable*/
    void setI(int i){ //put i inplace of x
        // i=x;
        i=i; //i will be zero so use This keyword
        this.i = i;
    }
    /*2nd use to invoke current class method implicitly. */
    void getI(){
        System.out.println(this.i);
        display(); //compiler add this by default
        // this.display(); // = display();
    }
    Test(){
        // this(10); //calls parameterized constructor
        System.out.println("no args constructor.");
    }
    /* 3rd use - this() can be used to invoke current class constructor*/
    Test(int a){
        this(); //calls no args constructor
        System.out.println("Parameterized contructor");
    }
    
    /*Use 4 - to pass as an argument in the method call*/
    void m1(Test t){
        System.out.println("I'm in m1 method");
    }
    /* Use 4 - to pass as an argument in the method call*/
    void m2(){
        m1(this);
        TestThis tt = new TestThis(this); /*Use 5 - Use this keyword to pass as an argument in the constructor call */
    }
}
class TestThis{
    /*Use 5 Use this keyword to pass as an argument in the constructor call */
    TestThis(Test T){
        System.out.println("I'm TestThis constructor. HuHu");
    }
}
/*Use - 06 Use this to return the current class instance from the method. */
class newTest{
    // void show(){
    //     System.out.println("I'm Boss");
    // }
    newTest display(){
        // show();
        System.out.println("I'm current class instance return with the help of this keyword.");
        return this;
    }
}
public class This{
    public static void main(String args[]){
        Test t = new Test();
        t.setI(5);
        t.getI();
        t.m2();
        newTest T = new newTest();
        T.display();
    }
}