package Week2;
import java.util.Collection;
import java.util.Iterator;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    public int iterativeSize() {
        IntList L = this;
        int totalSize= 0;
        while(L != null) {
            totalSize += 1;
            L = L.rest;
        }
        return totalSize;
    }

    public int get(int i) {
        int totalSize = this.size();
        IntList p = this;
        int result = 0;

        if(i > totalSize) {
            System.out.println("Error, overSize.");
            return -1;
        } else {
            for(int j = 0; j < i; j++) {
                result = p.first;
                p = p.rest;
            }
            return result;
        }
    }

    public int get2(int i) {
        if(i == 0) {
            return first;
        }
        return rest.get2(i - 1);
    }

    public IntList addFirst(int x) {
        //System.out.println(this.get2(0));
        IntList L1 = new IntList(x, this);
        return L1;
    }

    public static void main(String[] args) {
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L);
        L = L.addFirst(3);

        System.out.println(L.get2(0));
        System.out.println(L.get2(1));
        System.out.println(L.get2(2));
        System.out.println(L.get2(3));
    }
}
