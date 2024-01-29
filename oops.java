class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class cellPhone{
    public void printRing(){
        System.out.println("Ringing...");
    }
    public void printVibrate(){
        System.out.println("Vibrating...");
    }
    public void printCall(){
        System.out.println("Calling Siya...");
    }
}

class Square{
    // public int calculateArea(int side){
    //     return side*side;
    // }
    // public int calculatePerimeter(int side){
    //     return 4*side;
    // }
    int side;
    public int calculateArea(){
        return side*side;
    }
    public int calculatePerimeter(){
        return 4*side;
    }
}

class Rectangle{
    int length;
    int breadth;
    public int calculateArea(){
        return length*breadth;
    }
    public int calculatePerimeter(){
        return 2*(length+breadth);
    }
}

class TommyVecciti{
    public void hit(){
        System.out.println("Hitting.");
    }
    public void run(){
        System.out.println("Running.");
    }
    public void fire(){
        System.out.println("Firing.");
    }
}

class Circle{
    double radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 6.28*radius;
    }
}
public class oops{
    public static void main(String [] args){
        Employee obj = new Employee();
        // Problem 01
        // obj.setName("Mandvi");
        // obj.salary = 50000;
        // System.out.println(obj.getSalary());
        // System.out.println(obj.getName());

        // Problem 02
        // cellPhone obj1 = new cellPhone();
        // obj1.printCall();
        // obj1.printRing();
        // obj1.printVibrate();
        
        // Problem 03
        // Square obj2 = new Square();
        // obj2.side = 5;
        // System.out.println(obj2.calculateArea());
        // System.out.println(obj2.calculatePerimeter());

        // Problem 04
        // Rectangle obj3 = new Rectangle();
        // obj3.length = 15;
        // obj3.breadth = 10;
        // System.out.println(obj3.calculateArea());
        // System.out.println(obj3.calculatePerimeter());

        // Problem 05
        // TommyVecciti obj4 = new TommyVecciti();
        // obj4.hit();
        // obj4.run();
        // obj4.fire();

        // Problem 06
        Circle obj5 = new Circle();
        obj5.radius = 7.0;
        System.out.println(obj5.area());
        System.out.println(obj5.perimeter());

    }
}