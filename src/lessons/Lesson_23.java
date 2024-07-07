package lessons;

public class Lesson_23 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.toString());
        stringBuilder.append(" my");
        stringBuilder.append(" friend").append("!");
        System.out.println(stringBuilder.toString());
    }
}
