package Week3;

public class Discussion3_2 {

    public static int[] flatten(int[][] x) {
        int totallength = 0;

        for(int i = 0; i < x.length; i++) {
            totallength += x[i].length;
        }

        int[] a = new int[totallength];
        int aIndex = 0;

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                if(x.length != 0) {
                    a[aIndex] = x[i][j];
                    aIndex++;
                }
            }
        }
        return a;
    }

}
