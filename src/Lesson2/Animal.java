package Lesson2;

public class Animal {

    private int age;
    private double weight;
    private boolean sex;
    private String ration;

    public Animal(int age, double weight, boolean sex, String ration) {
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.ration = ration;
    }

    public Animal() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weigt) {
        this.weight = weigt;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public void getVoice() {
    }

    @Override
    public String toString() {
        return "Animal{" +
            "age=" + age +
            ", weight=" + weight +
            ", sex=" + sex +
            ", ration='" + ration + '\'' +
            '}';
    }
}
