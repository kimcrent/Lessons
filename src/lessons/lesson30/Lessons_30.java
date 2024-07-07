package lessons.lesson30;

public class Lessons_30 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Animal animal1 = new Dog();
        animal1.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Cat cat = new Cat();

        test(animal);
        test(dog);
        test(cat);

    }
    public static void test(Animal animal) {
        animal.eat();
    }
}
