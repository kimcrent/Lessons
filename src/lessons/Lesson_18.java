package lessons;

public class Lesson_18 {
    public static void main(String[] args) {
        Person4 person = new Person4();
        person.setName("");
        person.setAge(-1);
        person.speak();


    }
}
class Person4 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("Ты ввел пустое имя!");
        } else {
            this.name = name;
        }
    }

    public int getAge(int age) {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Возраст должен быть больше нуля");
        } else {
            this.age = age;
        }

    }

    void speak(){
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}
