package lessons;

public class Lesson_14 {
    public static void main(String[] args) {
        Person sasha = new Person();
        sasha.name = "Sasha";
        sasha.age = 25;
        System.out.println("Меня зовут " + sasha.name + "," + "мне " + sasha.age + "лет");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 22;
        System.out.println("Меня зовут " + person2.name + "," + "мне " + person2.age + "лет");
    }
}
class Person{
    //  У класса могут быть:
    // 1.Данные (поля)
    // 2.Действия, которые он может совершать (методы)
    String name;
    int age;
}
