package Lesson4;

import java.util.Comparator;

public class CatAgeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 != null && o2 == null) {
            return 1;
        }
        if (o1 == null && o2 != null) {
            return -1;
        }
        if (o1 == null && o2 == null) {
            return 0;
        }

        Cat cat1 = (Cat) o1;
        Cat cat2 = (Cat) o2;
        int age1 = cat1.getAge();
        int age2 = cat2.getAge();

       // if (age1.compareTo(age2) > 0) {
            return 1;
        }
        //if (age1.compareTo(age2) < 0) {
//            return -1;
//        }
//        return 0;
//    }
}
