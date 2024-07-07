package lessons.interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person = new Person("Bob");
        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();
        Animal animal1 = new Animal(23);


        Info info = new Animal(2);
        Info info1 = new Person("Roma");
        info.showInfo();
        outputInfo(info1);
        outputInfo(animal1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
