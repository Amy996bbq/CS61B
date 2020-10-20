package project1A;

//import edu.princeton.cs.algs4.In;

public class LinkedListDeque<T> {


    private IntNode sentinel;
    private int size;

    public LinkedListDeque() {
        int size = 0;
        sentinel = new IntNode();
        sentinel.item = null;
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
    }

    public void addFirst(T item) {
        IntNode firstNode = new IntNode(item, sentinel, sentinel.next);
        sentinel.next.prev = firstNode;
        sentinel.next = firstNode;
        size++;
    }

    public void addLast(T item) {
        IntNode lastNode = new IntNode(item, sentinel.prev, sentinel);
        sentinel.prev.next = lastNode;
        sentinel.prev = lastNode;
        size++;
    }

    public boolean isEmpty() {
        if(sentinel.prev == sentinel || sentinel.next == sentinel) {
            return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void printDeque() {
        IntNode temp = this.sentinel.next;
        while(temp != sentinel) {
            System.out.print(temp.item);
            temp = temp.next;
        }
    }

    public T removeFirst() {
        if(isEmpty() == true) {
            return null;
        }
        IntNode temp = sentinel.next;
        T item = (T) temp.item;
        sentinel.next = temp.next;
        sentinel.next.prev = sentinel;
        temp.item = null;
        temp.prev = null;
        temp.next = null;
        return item;
    }

    public T removeLast() {
        if(isEmpty() == true) {
            return null;
        }
        IntNode temp = sentinel.prev;
        T item = (T) temp.item;
        sentinel.prev = temp.prev;
        sentinel.prev.next = sentinel;
        //sentinel.prev.next = sentinel;
        temp.item = null;
        temp.prev = null;
        temp.next = null;
        return item;
    }

    public T get(int index) {
        IntNode aim = sentinel;
        for(int i = 0; i < index; i++) {
            aim = aim.next;
        }
        return (T) aim.item;
    }

    public T getRecursive(int index) {
        return (T) getRecursiveHelper(index, sentinel);
    }

    public T getRecursiveHelper(int index, IntNode aim) {
        if(index == 0) {
            return (T) aim.item;
        }
        return getRecursiveHelper(index-1, aim.next);
    }




}
