package Lesson7;

public class Song implements Runnable{
private String text;
private PrintText prt;

    public Song(String text, PrintText prt) {
        this.text = text;
        this.prt = prt;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            prt.printText(text);
        }
    }
}
