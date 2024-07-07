package lessons;

public class Animal {
    private int id;

    public Animal(int id){
        this.id = id;
    }
    public Animal(){}
    public String toString(){
        return String.valueOf(id);
    }

    String name = "Some Animal";
    public void eat(){
        System.out.println("Animal is eating ... ");
    }
    public void sleep(){
        System.out.println("Animal am sleeping");
    }

    public void showName(){
        System.out.println(name);
    }
}
