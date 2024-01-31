class Animal{
    void show(){
        System.out.println("Show function of Animal Class");
    }
}
class Dog extends Animal{
    void show(){
        System.out.println("Show function of Dog Class");
    }
    void eat(){
        System.out.println("I eat food.");
    }
}

//problem 1
class Circle{
    int radius;
    Circle(){
        System.out.println("I am A circle class's constructor.");
    }
    Circle(int r){
        this.radius = r;
    }
    double area(){
        return 2*Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    int height;
    Cylinder(){
        System.out.println("I'm Cylinder class's constructor.");
    }
    Cylinder(int r,int h){
        this.radius = r;
        this.height = h;
    }
    double surfaceArea(){
        // return (2*Math.PI*this.radius*this.height)+(2*Math.PI*this.radius*this.radius);
        return (2*Math.PI*this.radius*this.height)+area();
    }
}

// Problem 02
class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        System.out.println("I'm Rectangle Class's Constructor.");
    }
    int getLength(){
        return this.length;
    }
    void setLength(int l){
        this.length = l;
    }
    int getBreadth(){
        return this.breadth;
    }
    void setBreadth(int b){
        this.breadth = b;
    }
    double area(){
        return this.length*this.breadth;
    }

}
class Cuboid extends Rectangle{
    int height;
    Cuboid(){
        System.out.println("Cuboid class's constuctor.");
    }
    // Cuboid(int l,int b,int h){
    //     this.length = l;
    //     this.breadth = b;
    //     this.height = h;
    // }
    int height(){
        return this.height;
    }
    void setHeight(int h){
        this.height = h;
    }
    double surfaceArea(){
        return 2*((this.length*this.breadth)+(this.breadth*this.height)+(this.height*this.length));
    }
    double volume(){
        return this.length*this.breadth*this.height;
    }
}

// Problem 05
class Base{
    Base(){
        System.out.println("Base Class Constructor.");
    }
}
class Derived1 extends Base{
    Derived1(){
        System.out.println("Derived1 Class Constructor.");
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("Derived2 Class Constructor.");
    }
}
public class Inheritance{
    public static void main(String [] args){
        // Dog obj = new Dog();
        // obj.show();
        // obj.eat();
        // Animal obj1 = new Animal();
        // obj1.show();

        // Problem 01
        // Circle c = new Circle(7);
        // // new Circle();
        // System.out.println(c.area());
        // Cylinder C = new Cylinder(7,14);
        // new Cylinder();
        // System.out.println(C.surfaceArea());

        // problem 02
        // Rectangle r = new Rectangle();
        // r.setLength(15);
        // r.setBreadth(10);
        // System.out.println(r.area());

        // Cuboid c = new Cuboid();
        // c.setLength(15);
        // c.setBreadth(10);
        // c.setHeight(15);
        // // new Cuboid();
        // System.out.println(c.surfaceArea());
        // System.out.println(c.volume());

        // Problem 05
        Derived2 obj = new Derived2();

    }
}