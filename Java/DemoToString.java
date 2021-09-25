

class Student
{
    int roll;
    String name;


    public Student(int roll, String name)
    {
        this.roll=roll;
        this.name=name;
    }

    @Override
    public String toString()
    {
    
            return roll+ ":" +name;
    }

}





public class DemoToString  {
    public static void main(String[] args) {
        Student obj= new Student(11,"navin");
        System.out.println(obj);
    }

    
    
    
}
