package lessons;

public class Lesson_16 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.name = "Роман";
        person.age = 25;
        person.speak();
        person.seyHello();

        Person2 person1 = new Person2();
        person1.name = "Вова";
        person1.age = 60;
        person1.seyHello();
        person1.speak();

        int year = person.calculateYearsToRetirement();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии " + year);
        System.out.println("Второму человеку до пенсии " + year1);
    }
}
class Person2 {
    String name;
    int age;
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут" + name + ", мне " + age + " лет");
        }
    }
    void seyHello(){
        System.out.println("Hello");

    }
}
