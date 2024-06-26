import java.io.File;

public class viewFiles {
    public static void main(String[] args) {
        File a = new File("demo");
        if (a.isDirectory())
        {
           String [] fList =  a.list();
           for (String val : fList)
           {
             System.out.println(val);
           }
        }
    }
    
}
