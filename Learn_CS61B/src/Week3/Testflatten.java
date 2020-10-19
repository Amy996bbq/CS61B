package Week3;
import org.junit.Test;

public class TestDiscussion3_2 {
    @Test
    public void Testflatten() {
        int[][] a = {{1, 2, 3}, {}, {7, 8},{},{}};
        int[] k = Discussion3_2.flatten(a);
        System.out.println(k.length);
    }
}
