public class ArrayList<E> implements List<E> {
    private Object[] items;
    private int size;
    private int capacity;

    public ArrayList() {
        size = 0;
        capacity = 10;
        items = new Object[capacity];
    }

    private void expand() {
        Object[] aux = new Object[capacity + 10];
        System.arraycopy(items, 0, aux, 0, size);
        capacity += 10;
        items = aux;
    }

    private boolean isFull() { return size == capacity; }

    @Override
    public void add(E e) {
        if (isFull()) expand();
        items[size++] = e;
    }

    @Override
    public void add(E e, int index) {
        if (index >= 0 && index <= size) {
            if (isFull()) expand();
            for (int i = size; i > index; i--) {
                items[i] = items[i - 1];
            }
            items[index] = e;
            size++;
        } else {
            System.out.println("Error: índice fuera de rango");
        }
    }

    @Override
    public E remove(int index) {
        if (index >= 0 && index < size) {
            E aux = (E) items[index];
            for (int i = index; i < size - 1; i++) {
                items[i] = items[i + 1];
            }
            size--;
            return aux;
        }
        System.out.println("Error: índice fuera de rango");
        return null;
    }

    @Override
    public E get(int index) {
        if (index >= 0 && index < size) {
            return (E) items[index];
        }
        System.out.println("Error: índice fuera de rango");
        return null;
    }

    @Override
    public int size() { return size; }

    @Override
    public void clear() {
        capacity = 10;
        items = new Object[capacity];
        size = 0;
    }

    @Override
    public boolean isEmpty() { return size == 0; }
}

