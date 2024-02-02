import java.util.*;
public class GarbageCollection{
    public static void main(String args[]) throws InterruptedException{
        GarbageCollection obj1 = new GarbageCollection();
        GarbageCollection obj2 = new GarbageCollection();
        obj1 = null;
        System.gc();
        obj2 = null;
        Runtime.getRuntime().gc();

    }
    @Override
    protected void finalize()throws Throwable{
        System.out.println("Garbage collecter called");
        System.out.println("Object Garbage collected " + this);
    }

}