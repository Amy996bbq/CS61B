package Week3;

public class flatten {

    public static int[] flatten(int[][] x) {
        int totallength = 0;

        for(int i = 0; i < x.length; i++) {
            totallength += x[i].length;
        }

        int[] a = new int[totallength];
        int aIndex = 0;

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                a[aIndex] = x[i][j];
                aIndex++;
            }
        }
        return a;
    }
}
