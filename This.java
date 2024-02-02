class Test{
    int i;
    void setI(int i){ //put i inplace of x
        // i=x;
        i=i; //i will be zero so use This keyword
        this.i = i;
    }
    void getI(){
        System.out.println(this.i);
    }
}
public class This{
    public static void main(String args[]){
        Test t = new Test();
        t.setI(5);
        t.getI();
    }
}