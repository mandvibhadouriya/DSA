abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Starts with the key.");
    }
}
class Scooter extends Vehicle{
    void start(){
        System.out.println("Starts with the Kick");
    }
}
public class AbstractClass{
    void start(){
            System.out.println("I'm just a class.");
        }
    public static void main(String args[]){
        System.out.println("I'm Mandvi, the moody mandvi");
        Car obj = new Car();
        obj.start();
        Scooter obj1 = new Scooter();
        obj1.start();
        AbstractClass obj2 = new AbstractClass();
        obj2.start();

    }
}