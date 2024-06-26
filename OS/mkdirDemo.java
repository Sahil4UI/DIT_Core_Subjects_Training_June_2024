package demo;
import java.io.File;
public class mkdirDemo {

    public static void main(String[] args) {
        File folder = new File("myfolder/demofolder/folder");
    //    mkdir - used to create only single folder
    // if you want nested folders -> use mkdirs
        if (folder.mkdirs())
        {
            System.out.println("Folder Created :"+folder.getName());
        }
        else{
            System.out.println("unable to make directory");
        }
    }
}
