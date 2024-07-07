package lessons;

public class Lesson_17 {
    public static void main(String[] args) {
        Person3 person = new Person3();
        person.setNameAndAge("Роман",25);
        person.speak();

        String s1 = "Вова";
        int t = 60;
        Person3 person1 = new Person3();
        person1.setNameAndAge(s1,t);
        person1.speak();
    }
}

class Person3 {
    String name;
    int age;

    void setNameAndAge(String userName, int userAge){
        name = userName;
        age = userAge;
    }

    int calculateYearsToRetirement(){
        int year = 65 - age;
        return year;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
