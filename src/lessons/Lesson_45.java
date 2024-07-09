package lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lesson_45 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\akimbo\\IdeaProjects\\magick\\src\\lessons\\testFile");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println("Loooot");

        printWriter.close();

    }
}
