import java.io.FileInputStream;
// import java.io.FileOutputStream;
import java.io.InputStream;
// import java.io.OutputStream;
import java.util.Properties;

public class App {
    
    public static void main(String[] args) throws Exception 
    {
        
        Properties p = new Properties();
        // OutputStream os = new FileOutputStream("data.properties");
        // p.setProperty("url", "local host : 3306/mydb");
        // p.setProperty("uname", "Tom");
        // p.setProperty("pass", "0000");
        // p.store(os, null);

        InputStream is = new FileInputStream("data.properties");
        p.load(is);
        System.out.println(p.getProperty("uname"));
    }
}
