package Lesson4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsik", 4, "White");
        Cat cat2 = new Cat("Umka", 12, "Red");
        Cat cat3 = new Cat("Kuzia", 8, "Black");
        Cat cat4 = new Cat("Kulia", 5, "Brown");
        Cat cat5 = new Cat("Markiz", 3, "Gray");

        Cat[] cats = new Cat[]{cat1, cat2, null, cat3, cat4, cat5};

        Arrays.sort(cats, new CatNameComparator().reversed());
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();
    }
}
