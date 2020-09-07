package Lesson2;

public class Cat extends Animal {

    private String name;
    private String type;

    public Cat(int age, double weight, boolean sex, String ration, String name, String type) {
        super(age, weight, sex, ration);
        this.name = name;
        this.type = type;
    }

    public Cat(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void getVoice(){
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
            ", type='" + type + '\'' +
           '}' + super.toString();
    }
}
