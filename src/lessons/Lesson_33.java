package lessons;

import lessons.lesson30.Animal;
import lessons.lesson30.Dog;

public class Lesson_33 {
    public static void main(String[] args) {
        //Upcasting - восходящее преобразование
        Dog dog = new Dog();

        Animal animal = new Dog();
        animal.eat();

        //Downcasting - Низходящее преобразование

        Dog dog1 = (Dog) animal;
        dog1.bark();

//        Animal animal1 = new Animal();
//        Dog dog2 = (Dog) animal1;
//        dog2.bark();
    }
}
