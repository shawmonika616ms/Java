class Employee
{
   private int empId;
   private String empName;

   public int getEmpId()
   {
       return empId;
   }

   public void  setEmpId(int empId)
   {
       this.empId=empId;
   }

   public String getEmpName()
   {
       return empName;
   }

   public void setEmpName(String empName)
   {
       this.empName=empName;
   }

}


public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.setEmpId(3);
        e1.setEmpName("varun");
        Employee e2= new Employee();
        e2.setEmpId(4);
        e2.setEmpName("vikash");
        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
        System.out.println(e2.getEmpId());
        System.out.println(e2.getEmpName());
      

    }
    
}
