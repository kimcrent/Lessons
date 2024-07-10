package lessons.Lesson_49;

public enum Season {
    SUMMER(30), WINTER(-30), AUTUMN(5), SPRING(10);

    private int temperature;
    Season(int temperature){
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
