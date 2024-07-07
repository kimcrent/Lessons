package lessons;

public class Lesson_21 {
    public static void main(String[] args) {
        Human21 human21 = new Human21("Bob", 21);
        human21.printNumberOfPeople();
        Human21 human211 = new Human21("Stive", 40);
        human211.printNumberOfPeople();
        Human21 human212 = new Human21("Roma", 25);
        human212.printNumberOfPeople();
    }
}
class Human21 {
    private String name;
    private int age;
    private static int countPeople;


    public Human21(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printNumberOfPeople(){
        System.out.println("Number of people is " + countPeople);
    }
}
