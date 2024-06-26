import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class fileReadDemo {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fs = new FileInputStream("file.txt")) {
           int data;
                while((data= fs.read()) != -1)
                {
                    System.out.print((char)data);
                }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}






// import java.util.Scanner;
// import java.io.File;
// import java.io.FileNotFoundException;
// public class fileReadDemo {
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(new File("file.txt"))) {
//             while(sc.hasNextLine())
//             {
//                 System.out.println(sc.nextLine());
//             }
//         } catch (FileNotFoundException e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }
// }
