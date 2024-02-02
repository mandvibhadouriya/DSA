class Demo{
    final void m1(){
        System.out.println("I am M1 in class Demo");
    }
}
final class Test{
    void m2(){
        System.out.println("I'm final class. You can't inherit me.");
    }
}
class Final extends Demo{
    // void m1(){
    //     System.out.println("I am M1 in class Final");
    // }
    public static void main(String []args){
         final int i = 10;
        //  i = i + 20; //error
         System.out.println(i);
         Final f = new Final();
         f.m1();
         Test t = new Test();
         t.m2();
    }
}