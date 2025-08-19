public class Shark extends Animal {
    public Shark(){}
    public Shark(String name){ super(name); }
    void attack(){
        System.out.println("The " + getName() + " attacked!");
    }
}
