package demo;

import java.io.File;
import java.io.IOException;
class FileCreateDemo{

    public static void main(String[] args) {
        try {
            File file = new File("myText.txt");
            if (file.createNewFile())
            {
                System.out.println(file.getName());
            }
           
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}