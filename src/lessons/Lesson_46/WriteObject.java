package lessons.Lesson_46;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person[] people = {new Person (1, "Bob"), new Person(2,"Mike"), new Person(3,"Stive"), new Person(4,"Roma")};

        try {
            FileOutputStream fos = new FileOutputStream("src/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

//            oos.writeInt(people.length);
//            for (Person person : people) {
//                oos.writeObject(person);
//            }

            oos.writeObject(people);


            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
