package Week3;

import org.junit.Test;

public class TestIntList {
    @Test
    public void Testskippfy() {
        IntList A = IntList.list(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //IntList B = IntList.list(9, 8, 7, 6, 5, 4, 3, 2, 1);

        A.skippify();
        //B.skippify();
    }

    @Test
    public void Testlist() {
        IntList A = IntList.list(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntList B = IntList.list(9, 8, 7, 6, 5, 4, 3, 2, 1);
    }
}
