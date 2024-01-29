class Employee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public Employee(){
        System.out.println("I am Employee.");
    }
    public Employee(int idNo){
        this.id = idNo;
        System.out.println(id);
    }

}
class Cylinder{
    private int radius;
    private int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public float surfaceArea(){
        return (float)6.28 * radius * (height + radius);
    }
    public float Volume(){
        return (float)3.14 * radius * radius * height;
    }
    public Cylinder(int r, int h){
        this.radius = r;
        this.height = h;
        System.out.println("Radius : " + radius);
        System.out.println("Height : " + height);
    }
}
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        this.length = 5;
        this.breadth = 4;
    }
    public Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public void display(){
        System.out.println("Length : " + length + "\nBreadth : " + breadth);
    }
}

class Sphere{
    private int radius;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        this.radius = r;
    }
    public double surfaceArea(){
        return (double)4*3.14*radius*radius;
    }
    public double Volume(){
        return(double)4/3*3.14*radius*radius*radius;
    }
}
public class AccessModifiers{
    public static void main(String [] args){
        // System.out.println("Mandvi is here.");
        // Employee obj = new Employee();
        // Employee obj1 = new Employee(15000);

        // obj.setName("Mandvi");
        // System.out.println(obj.getName());

        // Cylinder obj2 = new Cylinder(7,14);
        // obj2.setRadius(7);
        // obj2.setHeight(14);
        // System.out.println("Radius of Cylinder is : " + obj2.getRadius());
        // System.out.println("Height of Cylinder is : " + obj2.getHeight());
        // System.out.println("Surface area of Cylinder is " + obj2.surfaceArea());
        // System.out.println("Volume of Cylinder is " + obj2.Volume());

        // Rectangle obj3 = new Rectangle(5,3);
        // Rectangle obj4 = new Rectangle();
        // obj3.display();

        Sphere obj5 = new Sphere();
        obj5.setRadius(7);
        System.out.println("Radius : " + obj5.getRadius());
        System.out.println("Surface Area : " + obj5.surfaceArea());
        System.out.println("Surface Area : " + obj5.Volume());
        


    }
}