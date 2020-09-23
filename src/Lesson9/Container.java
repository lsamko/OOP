package Lesson9;

public class Container<E> {

    private Object element;

    public Container(E element) {
        this.element = element;
    }

    public Container() {
    }

    public E getElement() {
        return (E) element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Container{" +
            "element=" + element +
            '}';
    }
}
