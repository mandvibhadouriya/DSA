interface I1{
    void show();
}
interface I2{
    void display();
}
// Inheritance in Interface
// interface I2 extends I1{
//     void display();
// }
interface bicycle{
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements bicycle{
    int speed = 7;
    public void applyBrake(int decrement){
        speed = speed - decrement;
        System.out.println("Speed after applying brake : " + speed);
    }
    public void speedUp(int increment){
        speed = speed + increment;
        System.out.println("Speed after SpeedUp : " + speed);
    }
}
public class Interfaces implements I1,I2{
    public void show(){
        System.out.println("I'm Show function.");
    }
    public void display(){
        System.out.println("I'm Display function.");
    }
    public static void main(String args[]){
        System.out.println("Main method by MoodyMandvi");
        Interfaces obj = new Interfaces();
        obj.show();
        obj.display();
        // AvonCycle obj1 = new AvonCycle();
        // obj1.applyBrake(2);
        // obj1.speedUp(5);
    }
}