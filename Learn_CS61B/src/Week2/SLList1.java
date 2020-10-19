package Week2;

public class SLList1 {
    private IntNode Sentinel;
    private int size;

    public SLList1() {
        size = 0;
        Sentinel = new IntNode(1, null);
    }

    public SLList1(int x) {
        size = 1;
        Sentinel = new IntNode(1, null);
        Sentinel.next = new IntNode(x, null);
    }

    public void addFirst_S(int x) {
        Sentinel.next = new IntNode(x, Sentinel.next);
        size++;
    }

    public int getFirst_S() {
        return Sentinel.next.item;
    }

    public void addLast_S(int x) {
        IntNode p = Sentinel;
        size++;
        while(p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }
}
