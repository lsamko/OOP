package Lesson3;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double a;
        for (; ; ) {
            try {
                a = Double.parseDouble(JOptionPane.showInputDialog("Input double number"));
                if (a < 0) {
                    throw new MyException("Negative input");
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane
                    .showMessageDialog(null, "Error number format");
            } catch (NullPointerException e) {
                a = 0;
                JOptionPane.showMessageDialog(null, " Cancel");
                break;
            } catch (MyException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
                break;
            }
        }
        int[] c = new int[3];
        try {
            c[5] = 10;
        } catch (Exception e) {
            System.out.println("=)");
        }


        int[] b = new int[]{1, 2, 3};
        int t = getEl(b, 10);
        System.out.println(t);

        NullPointerException e = new NullPointerException("Hello World");
        System.err.println("Meow");
        throw new ArithmeticException();
        // throw (e);
    }

    public static int getEl(int[] arr, int index) {
        int temp = arr[index];
        return temp;
    }

}
