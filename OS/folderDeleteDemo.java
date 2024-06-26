package demo;
import java.io.File;

public class folderDeleteDemo {

    public static void main(String[] args) {
        File f = new File("myfolder/demofolder/folder");
        if (f.delete())
        {
            System.out.println("Folder Deleted :"
            +f.getName());
        }
        else{
            System.out.println("Failed to Delete");
        }
    }
    
}
