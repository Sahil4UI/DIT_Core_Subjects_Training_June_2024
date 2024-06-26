package demo;

import java.io.FileWriter;
import java.io.IOException;
class FileEditDemo{

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("myText.txt");
            file.write("Hey DIT Students,Welcome to Day 2 of OS");
            file.close();
            System.out.println("************File Written**********");
           
        } catch (IOException e) {
            System.out.println("Error occured");
        }
    }
}