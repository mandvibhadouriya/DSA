class Employee{
    private int empId;
    public void setEmpId(int eId){ //setter method
        empId = eId;
    }
    public int getEmpId(){ //getter method
        return empId;
    }
}
public class Encapsulation{
    public static void main(String [] args){
        Employee e = new Employee();
        e.setEmpId(101);
        System.out.println(e.getEmpId());
    }
}