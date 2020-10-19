package Week3;
import org.junit.Test;

public class Testflatten {
    @Test
    public void Testflatten() {
        int[][] a = {{1, 2, 3}, {}, {7, 8},{},{}};
        int[] k = flatten.flatten(a);
        System.out.println(k.length);
    }
}
