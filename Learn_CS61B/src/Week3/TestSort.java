package Week3;

import org.junit.Assert;
import org.junit.Test;

public class TestSort {

    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 2;
        int actual = Sort.findSmallest(input, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindSmallest1() {
        String[] input = {"i", "have", "an", "egg"};
        int expected = 1;
        int actual = Sort.findSmallest(input, 0);
        Assert.assertEquals(expected, actual);

        String[] input2 = {"there", "are", "many", "pigs"};
        int expected2 = 1;
        int actual2 = Sort.findSmallest(input, 0);
        Assert.assertEquals(expected2, actual2);
    }

    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        Sort.swap(input, a, b);
    }

    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an", "have", "i", "egg"};

        Sort.sort(input, 0);
    }

    public static void main(String[] args) {
        //testSort();
    }
}
