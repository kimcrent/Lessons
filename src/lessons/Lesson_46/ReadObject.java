package lessons.Lesson_46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person = (Person) ois.readObject();
            Person person1 = (Person) ois.readObject();

            System.out.println(person);
            System.out.println(person1);

            ois.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
