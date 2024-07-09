package lessons.Lesson_44;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar();
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery();
        battery.charge();
    }
}
