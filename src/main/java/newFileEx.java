import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class newFileEx {
    public String readTextFile(String Data){
        return Data;
    }
    public static void main(String[] args) {
        BufferedReader reader;
        try {
            int fileExist;
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                fileExist = 1;
            } else {
                System.out.println("File already exists.");
                fileExist = 0;
            }
            if (fileExist == 1) {
                FileWriter file = new FileWriter("filename.txt", true);
                BufferedWriter bw = new BufferedWriter(file);
//                PrintWriter pw = new PrintWriter(bw);
                bw.flush();
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try (FileWriter f = new FileWriter("filename.txt", true);
             BufferedWriter b = new BufferedWriter(f)) {
             b.write("Hello Java files");

            reader = new BufferedReader(new FileReader("filename.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
            }

            Scanner newItem = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Random text: ");
            String listStringScanner = newItem.nextLine();
            System.out.println(listStringScanner);

            b.write(listStringScanner);


        } catch (IOException i) { i.printStackTrace(); }

    }
}
