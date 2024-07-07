package lessons.lesson36;


interface AbleToEat{
    public void eat();
}


public class Lesson_36 {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Someone is eating...");
            }
        };
    }
}