import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark("Shark"), new Shark("shark"), new Shark("Sh"),
                            new Turtle("Turtle"), new Turtle("turtle"),
                            new Eagle("eagle"), new Eagle("bird"), new Eagle("Eagle")};
        getMethods(animals);
        //создаем массив, разделяем элементов из Animal и положим их в свои массивы:
        Shark[] sharks = new Shark[animals.length]; //animals.length - кол-во
        Turtle[] turtles = new Turtle[animals.length];
        Eagle[] eagles = new Eagle[animals.length];
        int s=0, t=0, e=0; //счетчик
        for(Animal q : animals){
            if(q.getClass() == Shark.class){
                sharks[s++] = (Shark) q;
            } else if (q.getClass() == Turtle.class) {
                turtles[t++] = (Turtle) q;
            } else if (q.getClass() == (Eagle.class)) {
                eagles[e++] = (Eagle) q;
            }
        }
        System.out.println("\nResult 1: ");
        for (Shark shark : sharks) {
            System.out.println(shark);
        }
        System.out.println("\nResult 2: ");
        for (Turtle turtle : turtles) {
            System.out.println(turtle);
        }
        System.out.println("\nResult 3: ");
        for (Eagle eagle : eagles) {
            System.out.println(eagle);
        }
    }
    public static void getMethods(Animal[] animals){
        System.out.println("InstanceOf operator:");
        //оператор instanceof - используется для проверки, явл-ся ли объект экземпляром(или подклассом) определнного класса. Возвращает true/flase
        for(Animal a : animals){
            if(a.getName().equalsIgnoreCase("shark") && a instanceof Shark){ //является ли объект а экземпляром Shark
                ((Shark) a).attack();
            } else if (a.getName().equalsIgnoreCase("turtle") && a instanceof Turtle) {
                ((Turtle) a).swim();
            } else if (a.getName().equalsIgnoreCase("eagle") && a instanceof Eagle) {
                ((Eagle) a).fly();
            }
        }
        System.out.println("\nMethod getClass():");
        //getClass() - метод, к-рый показывает реальный(точный) тип класса, содержащую информацию о классе объекта.
        for(Animal b : animals){
            if(b.getClass() == Shark.class){
                ((Shark) b).attack();
            } else if (b.getClass() == Turtle.class) {
                ((Turtle) b).swim();
            } else if (b.getClass() == Eagle.class) {
                ((Eagle) b).fly();
            }
        }
    }
}
