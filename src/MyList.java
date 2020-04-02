public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {

    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (elements.length == index) ensureCapa(DEFAULT_CAPACITY);
        for (int i = this.size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        this.size++;
    }

    public E remove(int index) {
        E temp = (E) elements[index];
        for (int i = index; i < this.size; i++) {
            elements[i] = elements[i + 1];
        }
        this.size--;
        return temp;
    }

    public int size() {
        return this.size;
    }


    public Object clone() {
        MyList<E> myList = new MyList<E>();
        myList.elements = this.elements;
        myList.size = this.size;
        return myList;
    }

    public boolean contain(E o) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i] == o) return true;
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < this.size; i++) {
            if (elements[i] == o) return i;
        }
        return -1;
    }

    public boolean add(E e) {
        if (this.size < this.elements.length) {
            elements[size] = e;
            this.size++;
            return true;
        } else return false;
    }

    private void ensureCapa(int minCapacity) {
        int newSize = this.elements.length + minCapacity;
        Object[] arrTemp = new Object[newSize];
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] = arrTemp[i];
        }
        this.elements = arrTemp;
    }

    public E get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException("index : " + index);
        else return (E) elements[index];
    }

    public void clear() {
        this.size = 0;
        this.elements = null;
    }

    public void displayList() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(elements[i]);
        }
    }
}
