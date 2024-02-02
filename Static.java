// Static Variable can be used to refer to the common property or value for all objects, for example, company name of employees, college name of Students,etc.
// Static Variables are used for Memory Management.
class Demo{
    static int a = 20;
    // void m1(){
    //     static int b = 30; //error --> Static Variables are created at Class level (Not Local Variable)
    // }
}
class Employee{
    int empId;
    String name;
    static String company = "Google"; //Company name is same for all objects
    Employee(int empId, String name){
        this.empId = empId;
        this.name = name;
    }
    void display(){
        System.out.println(empId + " " + name + " " + company);
    }
}
class Test{
    //Create static method --> Memory Management
    
    static int i = 10;
    static void display(){
        show();
        System.out.println("Static method");
        System.out.println(i); //static method can only access static data
    }
    // static methods can only call static methods
    static void show(){
        System.out.println("Can be Non - Static method");
    }
    // Static method can not refer this and super keywords
    int a = 10;
    void printA(){
        System.out.println(this.a);
    }
    // Static Block --> executes first 
    
    /*static{
        System.out.println("Hello Ji I'm Static Block");
        // System.exit(0); //JVM will stop
    } //executes top to bottom
    static{
        System.out.println("I'm 2nd static block.");
    }
    static{
        System.out.println("Ram Ram Bhai, I'm 3rd static block.");
    }
    static{
        System.out.println("Ram Ram Bhai sarane, I'm 4th static block.");
    }
    */
}
class Static{
    static void hello(){
        System.out.println("In class static method.");
    }
    public static void main(String [] args){
        System.out.println(Demo.a); //use class
        Employee e = new Employee(101,"Amit");
        e.display();
        Employee e1 = new Employee(102,"Deepak");
        e1.display();
        // Test t = new Test();
        // t.display();
        //As display method is static, so we don't need to create object we can call it directly with the help of class
        Test.display(); //static method call
        hello();
        // Static.hello(); // we can also call this method with the name of class or without class bcoz this method exit in same class only.
        Test t = new Test();
        t.printA();

    }
}