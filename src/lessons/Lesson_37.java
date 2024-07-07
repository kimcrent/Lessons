package lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson_37 {
    public static void main(String[] args) throws FileNotFoundException {
       // String separation = File.separator;

        String path = "C:\\Users\\akimbo\\Desktop\\num.txt";
        File file = new File(path);


        Scanner scanner = new Scanner(file);
//        while(scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }

        //Scanner scanner1 = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[3];
        int counter = 0;

        for(String number : numbersString){
            numbers[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));



        scanner.close();


    }
}
