package lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson_40 {
    public static void main(String[] args) {
        // Checked Exception(Compile time exception) = исключительные случаи в работе прогаммы во время программы
//        File file = new File("fasd");
//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        // Unchecked Exception(Runtime exception) = ошибка в работе программы

//        int a = 1 / 0;
//        String name = null;
//        name.length();
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }
}
