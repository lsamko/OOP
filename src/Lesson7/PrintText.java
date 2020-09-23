package Lesson7;

public class PrintText extends Thread {

    private long[] threadId = new long[3];
    private int index = 0;

    public synchronized void printText(String text) {
        Thread thr = Thread.currentThread();
        long id = thr.getId();

        while (id != threadId[index]) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(text + " ");
        index = (index + 1) % threadId.length;
        notifyAll();
    }

    public void registerThread(Thread... threads) {
        threadId = new long[threads.length];
        for (int i = 0; i < threads.length; i++) {
            threadId[i] = threads[i].getId();
        }
    }
}

