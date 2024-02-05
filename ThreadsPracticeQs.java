// Problem 01
class Greet extends Thread{
    public void run(){
        // while(true){
        //     System.out.println("Good Morning");
        // }
    System.out.println("Good Morning");
    }
}
class Welcome extends Thread{
    public void run(){
        // while(true){
        //     // Problem 02 add Sleep method
        //     // try{
        //     //     Thread.sleep(200);
        //     // }
        //     // catch(InterruptedException e){
        //     //     e.printStackTrace();
        //     // }
        //     System.out.println("Welcome");
        // }
        System.out.println("Welcome");
    }
}
public class ThreadsPracticeQs{
    public static void main(String [] args){
        // System.out.println("I'll be single soon.");
        Greet gt = new Greet();
        Welcome wt = new Welcome();
        gt.start();
        wt.start();
        gt.setPriority(Thread.MIN_PRIORITY);
        wt.setPriority(Thread.MAX_PRIORITY);
        System.out.println(gt.getPriority());
        System.out.println(gt.getState());
        System.out.println(gt.currentThread());
        System.out.println(wt.getPriority());
        System.out.println(wt.getState());
        System.out.println(wt.currentThread());
        Greet gt1 = new Greet();
        System.out.println(gt1.getPriority());
        System.out.println(gt1.getState());
        System.out.println(gt1.currentThread());
    }
}