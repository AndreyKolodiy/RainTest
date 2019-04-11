import static org.junit.Assert.*;
import org.junit.Test;

public class RainCounterTest {
    @Test
    public void puddleMeter() {

        RainCounter rainCounter = new RainCounter();

        final int[] wallTest_1 = {2, 6, 1, 2, 3, 4, 7, 7, 6};
        int actualTest_1 = rainCounter.puddleMeter(wallTest_1);
        int expectedTest_1 = 14;

        final int[] wallTest_2 = {2, 4, 1, 2, 3, 4, 5, 7, 6};
        int actualTest_2 = rainCounter.puddleMeter(wallTest_2);
        int expectedTest_2 = 6;

        final int[] wallTest_3 = {6, 1, 1, 2, 3, 4, 6, 7, 6};
        int actualTest_3 = rainCounter.puddleMeter(wallTest_3);
        int expectedTest_3 = 19;

        assertEquals(expectedTest_1, actualTest_1);
        assertEquals(expectedTest_2, actualTest_2);
        assertEquals(expectedTest_3, actualTest_3);
    }
}