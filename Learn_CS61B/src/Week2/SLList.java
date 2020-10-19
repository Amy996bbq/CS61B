package Week2;

/**An SLList is a list of integers, which hides the terrible truth
 * of the nakedness within.*/
public class SLList {
    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Creates an empty SLList*/
    public SLList() {
        size = 0;
        first = null;
    }

    /** Adds x to the front of the list.*/
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Returns the first item in the list.*/
    public int getFirst() {
        return first.item;
    }

    /** Returns the size of the list that starts at IntNode p*/
    private static int size1(IntNode p) {
        if(p.next == null) {
            return 1;
        }
        return 1 + size1(p.next);
    }
    /**Not the best way.*/
    private static int size2(IntNode p) {
        int i = 0;
        while(p != null) {
            p = p.next;
            i++;
        }
        return i;
    }
    /** Specific for our need.*/
    public int size() {
        return size1(first);
    }

    /** Adds an item to the end of the List*/
    public void addLast1(int x) {
        IntNode p = first;

        if(p == null) {
            this.addFirst(x);
            return;
        }

        while(p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
    /** Not the best way.*/
    public void addLast(int x) {
        int i = this.size() - 1;
        IntNode k = this.first;

        while(i > 0) {
            k = k.next;
            i--;
        }
        IntNode k1 = new IntNode(x, null);
        k.next = k1;
        //System.out.println(k.next.item);
    }

    public void insert(int item, int position) {
        if(first == null || position == 0) {
            addFirst(item);
            return;
        }

        IntNode currentNode = first;
        while(position > 1 && currentNode.next != null) {
            position--;
            currentNode = currentNode.next;
        }
        IntNode newNode = new IntNode(item, currentNode.next);
        currentNode.next = newNode;
    }

    public void reverse() {
        if (first == null || first.next == null) {
            return;
        }

        IntNode ptr = first.next;
        first.next = null;
        while(ptr != null) {
            IntNode temp = ptr.next;
            ptr.next = first;
            first = ptr;
            ptr = temp;
        }
    }

    public void reverseExtra() {
        if (first == null || first.next == null) {
            return;
        }
        IntNode ptr = first.next;
        first.next = null;

    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addFirst(3);
        L.addFirst(2);
        L.addFirst(1);
        L.addFirst(0);
        L.addLast(100);

        System.out.println(L.size());
    }
}
