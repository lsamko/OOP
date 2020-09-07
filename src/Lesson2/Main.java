package Lesson2;

public class Main {

    public static void main(String[] args) {
    Cat cat = new Cat(4, 6, true, "Milk", "Barsik", "Home cat");
        System.out.println(cat.getAge());
        System.out.println(cat.hashCode());

        cat.getVoice();
        System.out.println(cat);

        Animal an = null;
        an = cat;

        Animal [] zoo = new Animal[10];
        zoo[0] = cat;

        print(cat);
    }

    public static void  print(Animal an){
        System.out.println(an);
    }
}
