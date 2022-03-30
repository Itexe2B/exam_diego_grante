package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaRandomizerIT {

    @Test
    public void numbersAreNeverOutsideBoundsOf0And37() throws Exception {
        JavaRandomizer jr = new JavaRandomizer();

        int result = jr.getRouletteResult();

        assertTrue(result >= 0 && result <= 37);
    }

    @Test
    public void allNumbersOccur() throws Exception {

    }


}
