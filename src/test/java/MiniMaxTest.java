import org.junit.Test;

import static org.junit.Assert.*;

public class MiniMaxTest {
    @Test
    public void givenMiniMax_whenCheckWin_thenComputeOptimal() {
        MiniMax miniMax = new MiniMax();
        miniMax.constructTree(6);
        boolean result = miniMax.checkWin();

        assertTrue(result);

        miniMax.constructTree(8);
        result = miniMax.checkWin();

        assertFalse(result);
    }
}