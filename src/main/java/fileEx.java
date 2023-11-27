import org.testng.annotations.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class fileEx {
    private static final String FILE_NAME = "Access";
    @Test
    public static boolean givenUsingNio_whenCreatingFile_thenCorrect() throws IOException {
        Path newFilePath = Paths.get(FILE_NAME);
        Files.createFile(newFilePath);
        return false;
    }

    @Test
    public void givenUsingFileOutputStream_whenCreatingFile_thenCorrect() throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME)){
        }
    }

    @Test
    public void whenWriteStringUsingBufferedWritter_thenCorrect(String fileName)

            throws IOException {
        String str = "Hello";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.append(str);
        writer.close();
    }
    public static void main(String[] args) throws IOException {
//        System.out.println(givenUsingNio_whenCreatingFile_thenCorrect());
        String addItem = "y";
        try {
            if(addItem == "y"){
                givenUsingNio_whenCreatingFile_thenCorrect();
            }
        } catch (Exception err){
            System.out.println(err);
        }
    }
}
