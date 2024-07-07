package lessons;

public class Lesson_15 {
    public static void main(String[] args) {
        Person1 person = new Person1();
        person.name = "Роман";
        person.age = 25;
        person.speak();
        person.sayHello();

        Person1 person1 = new Person1();
        person1.name = "Вова";
        person1.age = 60;
        person1.speak();
        person1.sayHello();

    }
}
class Person1 {
    String name;
    int age;
    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут" + name + ", мне " + age + " лет");
        }
    }
    void sayHello(){
        System.out.println("Hello!");
    }
}
