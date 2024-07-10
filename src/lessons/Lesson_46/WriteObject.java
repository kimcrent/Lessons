package lessons.Lesson_46;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person = new Person(1, "Bob");
        Person person1 = new Person(2,"Mike");

        try {
            FileOutputStream fos = new FileOutputStream("src/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person);
            oos.writeObject(person1);


            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
