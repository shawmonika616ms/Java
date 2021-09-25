import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// import jdk.nashorn.internal.runtime.logging.Loggable;

class College
{
    private List<Studentabc> students;

    public List<Studentabc> getStudents()
    {
        return students;
    }

    public void setStudents(List<Studentabc> students)
    {
        this.students=students;
    }

}

class Studentabc
{
    private int roll;
    private String sname;
    
    public int getRoll()
    {
        return roll;
    }

    public void setRoll(int roll)
    {
        this.roll=roll;
    }
   
    public String getSname()
    {
        return sname;
    }

    public void setSname(String sname)
    {
        this.sname=sname;
    }

    @Override
    public String toString()

    {
        return "Student{" + "rollno=" + roll + ", sname=" +sname+ '}';
    }

}

public class SerializeXML {

    public static void main(String[] args) {
try
{
        Studentabc st1 = new Studentabc();
        st1.setRoll(101);
        st1.setSname("Tom");
        Studentabc st2 = new Studentabc();
        st2.setRoll(102);
        st2.setSname("jack");

        List<Studentabc> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);

        College c = new College();
        c.setStudents(s);

        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("myCollege.xml")));
        x.writeObject(c);
        x.close();
}
catch(FileNotFoundException ex)
{
    Logger.getLogger(SerializeXML.class.getName()).log(Level.SEVERE, null, ex);
}

    }
}
