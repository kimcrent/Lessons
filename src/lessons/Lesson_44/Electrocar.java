package lessons.Lesson_44;

public class Electrocar {
    private final int id;
    private class Motor{
        public void startMotor(){
            System.out.println("Motor" + id + "is starting");
        }
    }

    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }
    public void start(){
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;
        class SomeClass{
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }
        SomeClass someClass = new SomeClass();



        System.out.println("Electrocar " + id + " is starting");
    }
}
