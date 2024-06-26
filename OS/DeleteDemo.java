package demo;
import java.io.File;

public class DeleteDemo {
    public static void main(String[] args) {
        File file = new File("myText.txt");
        if (file.delete())
        {
            System.out.println("File Deleted");
        }
        else{
            System.out.println("Unable to Delete the File");
        }
    }
}
