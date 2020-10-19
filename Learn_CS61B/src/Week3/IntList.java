package Week3;

import edu.princeton.cs.algs4.In;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    //public boolean equals(Object o){...}
    public static IntList list(int...args) {
        IntList L = new IntList(args[args.length - 1], null);
        for(int i = args.length - 2; i >= 0; i--) {
            L = new IntList(args[i], L);
        }
        return L;
    }

    public IntList skippify() {
        IntList p = this;
        int n = 1;
        while(p != null) {
            IntList next = p.rest;
            for(int i = 0; i < n; i++) {
                if(next == null) {
                    break;
                }
                next = next.rest;
            }
            p.rest = next;
            p = p.rest;
            n++;
        }
        return p;
    }

    public static void removeDuplicates(IntList p) {
        if(p == null) {
            return;
        }
        IntList current = p.rest;
        IntList previous = p;
        while(current != null) {
            if(previous.first == current.first) {
                previous.rest = current.rest;
            } else {
                previous = current;
            }
            current = current.rest;
        }
    }
}
