public class Eagle extends Animal{
    public Eagle(){}
    public Eagle(String name){ super(name); }
    void fly(){
        System.out.println("The " + getName() + " always flies");
    }
}
