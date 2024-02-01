// package AbstractClassAndInterface;
// Problem 01 & 02
abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("I'm write function.");
    }
    void refill(){
        System.out.println("I'm refill function");
    }
    void changeNib(){
        System.out.println("I'm changeNib function.");
    }
}

// Problem 03
interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("I'm jump function.");
    }
    void bite(){
        System.out.println("I'm bite function.");
    }
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("hii");
    }
    public void eat(){
        System.out.println("I'm eat function.");
    }
    public void sleep(){
        System.out.println("I'm sleep function");
    }
}

// Problem 04
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class SmartTelePhone extends Telephone{
    void ring(){
        System.out.println("I'm ringing.");
    }
    void lift(){
        System.out.println("I'm lift function.");
    }
    void disconnect(){
        System.out.println("Disconnect me .");
    }
}

// Problem 06 & 07
interface TVRemote{
    void press();
}
interface SmartTVRemote extends TVRemote{
    void touch();
}
class TV implements SmartTVRemote{
    public void press(){
        System.out.println("Press me");
    }
    public void touch(){
        System.out.println("Touch");
    }
}
public class AbstractClassAndInterface{
    public static void main(String [] args){
        System.out.println("I'm Mandvi.");

        // Problem 01 & 02
        FountainPen obj = new FountainPen();
        // obj.write();
        // obj.refill();
        obj.changeNib();

        // problem 03
        Human obj1 = new Human();
        // obj1.eat();
        obj1.sleep();
        // obj1.jump();
        // obj1.bite();

        // Problem 05 --> Polymorphism
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();

        BasicAnimal ba = new Human();
        ba.sleep();
        ba.eat();

        // Problem 04
        SmartTelePhone ST = new SmartTelePhone();
        // ST.ring();
        // ST.lift();
        // ST.disconnect();
        //  -->Polymorphism 
        Telephone T = new SmartTelePhone();
        T.ring();
        T.lift();
        T.disconnect();
        // Problem 06 & 07
        TV tv = new TV();
        tv.press();
        tv.touch();
    }
}