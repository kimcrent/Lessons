package lessons;
public class Lesson_43 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        Animal137 animal137 = new Animal137(1);
        Animal137 animal1371 = new Animal137(1);
        System.out.println(animal1371 == animal137);  // Сравнивает ссылки объектов
        System.out.println(animal1371.equals(animal1371));  // Сравнивает значение объектов

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));

    }
}
class Animal137{
    private int id;
    public Animal137(int id ){
        this.id = id;
    }
}
