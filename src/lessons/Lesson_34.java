package lessons;

import java.util.ArrayList;
import java.util.List;

public class Lesson_34 {
    public static void main(String[] args) {
        ////////Java 5//////////////////////
        List animals = new ArrayList();
        Animal52 animal52 = new Animal52();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(animal52);

        String animal = (String) animals.get(2);
        System.out.println(animal);
        //////////Jenerik/////////////////////

        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(1);

        /////////Java 7/////////////////
        List<String> animals3 = new ArrayList<>();



    }
}
class Animal52 {

}