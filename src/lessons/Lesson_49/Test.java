package lessons.Lesson_49;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.FROG;
        System.out.println(animal);


        switch (animal){
            case CAT -> System.out.println("It's a cat");
            case DOG -> System.out.println("It's a dog");
            case FROG -> System.out.println("It's a frog");
        }

        Season season = Season.SPRING;
        System.out.println(season.getTemperature());

        switch (season){
            case AUTUMN -> System.out.println("autumn");
            case WINTER -> System.out.println("winter");
            case SPRING -> System.out.println("spring");
            case SUMMER -> System.out.println("summer");
        }

        System.out.println(season.name());
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());


    }
}
