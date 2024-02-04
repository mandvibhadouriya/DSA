// Create Threads extending Thread class
class Thread1 extends Thread{
    public void run(){
        while(true){ //Infinite loop
            System.out.println("I'm hungry!");
            System.out.println("Food is cooking.");
        }
        // int i = 0;
        // while(i<10000){
        //     System.out.println("I'm hungry!");
        //     System.out.println("Food is cooking.");
        //     i++;
        // }
    }
}
class Thread2 extends Thread{
    public void run(){
        while(true){
            System.out.println("I miss you.");
            System.out.println("Online chatting.");
        }
        // int i = 0;
        // while(i<10000){
        //     System.out.println("I miss you.");
        //     System.out.println("Online chatting.");
        //     i++;
        // }
    }
}

// Threads using Runnable interface
class MyThread1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=150){
            System.out.println("I'm Runnable thread1.");
            System.out.println("Waiting for You.");
            i++;
        }
    }
}
class MyThread2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<=150){
            System.out.println("I'm Runnable thread2.");
            System.out.println("Coming to You.");
            i++;
        }
    }
}

// Thread Constructors
class Thr1 extends Thread{
    Thr1(String name){
        super(name);
    }
    public void run(){
        System.out.println("I'm Mandvi. How's you doing?");
    }
}
class Thr2 extends Thread{
    Thr2(String name){
        super(name);
    }
    public void run(){
        System.out.println("I'm Fine. Thank You");
    }
}
public class Threads{
    public static void main(String args[]){
        System.out.println("I 'm running");

        // Create Threads extending Thread class

        // Thread1 t1 = new Thread1();
        // Thread2 t2 = new Thread2();
        // t1.start();
        // t2.start();

        // Threads using Runnable interface

        // MyThread1 T1 = new MyThread1();
        // Thread th1 = new Thread(T1);

        // MyThread2 T2 = new MyThread2();
        // Thread th2 = new Thread(T2);

        // th1.start();
        // th2.start();

        // Thread Constructors

        Thr1 thr1 = new Thr1("Mandvi");
        Thr2 thr2 = new Thr2("Harry");
        thr1.start();
        thr2.start();
        System.out.println(thr1.getId());
        System.out.println(thr2.getId());
        System.out.println(thr1.getName());
        System.out.println(thr2.getName());
        System.out.println(thr2.activeCount()); //1
        System.out.println(thr2.currentThread()); //Thread[main,5,main]
        System.out.println(thr2.toString()); //Thread[Harry,5,]
        System.out.println(thr1.getPriority()); //5
        System.out.println(thr2.getPriority()); //5

    }
}