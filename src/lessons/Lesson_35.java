package lessons;

import java.util.ArrayList;
import java.util.List;

public class Lesson_35 {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(52));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        Object object = new Object();

        test(listOfAnimal);
        test(listOfDogs);
    }
    private static void test(List<? extends Animal> list){
        for (Animal animal  : list) {
            animal.eat();
        }
    }
}
