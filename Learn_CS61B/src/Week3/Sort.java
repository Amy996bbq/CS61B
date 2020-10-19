package Week3;

public class Sort {

    public static int findSmallest(String[] x, int start) {
        int smallest_index = start;
        for(int i = start; i < x.length; i++) {
            int cmp = x[i].compareTo(x[smallest_index]);
            if(cmp < 0) {
                smallest_index = i;
            }
        }
        return smallest_index;
    }

    public static void swap(String[] x, int a, int b) {
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;

    }

    /** Sorts x starting at position start.*/
    public static void sort(String[] x, int start) {
        if(start == x.length) {
            return;
        }
        int smallest_index = findSmallest(x, start);
        swap(x, start, smallest_index);
        //get sort rolling-->sort the entire array.
        sort(x, start + 1);
    }

//    public String[] recursive(String[] x, int k) {
//        String[] trans;
//        trans[k] =
//    }
}
