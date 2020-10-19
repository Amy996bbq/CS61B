package project1A;

public class ArrayDeque<T> {
    public T[] items;
    public int size;
    private double usageRatio;
    private int nextFirst;
    private int nextLast;

    public ArrayDeque() {
        items = (T[]) new Object[8];
        size = 0;
        nextFirst = 7;
        nextLast = 0;
    }
    public int plusOne(int index) {
        int i = index + 1;
        if(i == items.length) {
            return 0;
        }
        return i;
    }

    public int minusOne(int index) {
        int j = index - 1;
        if(j == -1) {
            return items.length + j;
        } else {
            return j;
        }
    }

    public void biggerResize(int newsize) {
        T[] a = (T[]) new Object[newsize];
        int first = plusOne(nextFirst);
        System.arraycopy(items, 0, a, 0, nextLast);
        System.arraycopy(items, first, a, first + size, size - first);
        items = a;
        nextFirst = minusOne(first + size);
    }

    public void smallerResize(int newsize) {
        T[] a = (T[]) new Object[newsize];
        int first = nextFirst + 1;
        if(nextFirst > nextLast) {
            System.arraycopy(items, 0, a, 0, nextLast);
            System.arraycopy(items, first, a, first - items.length / 2, items.length - first);
            items = a;
            nextFirst = minusOne(first - items.length / 2);
        } else {
            System.arraycopy(items, nextFirst, a, 0, nextLast - nextFirst + 1);
            items = a;
            nextLast = nextLast - nextFirst;
            nextFirst = 0;
        }
    }

    public void addFirst(T x) {
        if(size == items.length) {
            biggerResize(size * 2);
        }
        items[nextFirst] = x;
        nextFirst = minusOne(nextFirst);
        size = size + 1;
    }

    public void addLast(T x) {
        if(size == items.length){
            biggerResize(size * 2);
        }
        items[nextLast] = x;
        nextLast = plusOne(nextLast);
        size = size + 1;
    }

    private T getfirst() {
        return items[plusOne(nextFirst)];
    }

    private T getLast() {
        return items[minusOne(nextLast)];
    }

    public T removeFirst() {
        if(isEmpty()) {
            return null;
        } else {
            T item = getfirst();
            nextFirst = plusOne(nextFirst);
            size = size - 1;
            if(size == 0) {
                nextFirst = 7;
                nextLast = 0;
            }
            usageRatio = (double) size / (double) items.length;
            if(items.length > 16 && usageRatio < 0.25) {
                smallerResize(items.length/2);
            }
            return item;
        }
    }

    public T removeLast() {
        if(isEmpty()) {
            return null;
        } else {
            T item = getLast();
            nextLast = minusOne(nextLast);
            size = size - 1;
            if(size == 0) {
                nextFirst = 7;
                nextLast = 0;
            }
            usageRatio = (double) size / (double) items.length;
            if(items.length > 16 && usageRatio < 0.25) {
                smallerResize(items.length / 2);
            }
            return item;
        }
    }

    public T get(int index) {
        index = plusOne(nextFirst) + index;
        if(index >= items.length) {
            index = index - items.length;
        }
        return items[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printDeque() {
        if(isEmpty()){
            System.out.println("null.");
        } else {
            for (int i = 0; i < size; i = i + 1) {
                T item = get(i);
                System.out.print(item);
                System.out.print(" ");
            }
        }
    }


}

