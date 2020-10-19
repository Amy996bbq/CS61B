package project1A;


public class IntNode<T> {

    public T item;
    public IntNode prev;
    public IntNode next;


    public IntNode(){
    }

    public IntNode(T i, IntNode p, IntNode n) {
        item = i;
        prev = p;
        next = n;
    }
}