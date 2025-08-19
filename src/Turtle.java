public class Turtle extends Animal{
    public Turtle(){};
    public Turtle(String name){ super(name); }
    void swim(){
        System.out.println("The " + getName() + " is swimming");
    }
}
