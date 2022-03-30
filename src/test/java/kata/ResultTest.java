package kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

    @Test
    public void the37CorrespondsTo00() {
        Result result = new Result(37);

        assertEquals(result.number, "00");
    }

    @Test()
    public void theResultIsAlwaysBetween00and36() throws Exception {
        JavaRandomizer jr = new JavaRandomizer();
        Result result = new Result(jr.getRouletteResult());

        int current_result = Integer.parseInt(result.number);
        assertTrue(current_result >= 0 && current_result <= 36);
    }

    @Test
    public void theColorOf37and00IsGreen() throws Exception {
        Result result37 = new Result(37);
        Result result0 = new Result(0);

        assertTrue(result0.color == Result.Color.GREEN && result0.color == result37.color);
    }

    @Test
    public void theColorOfEvenNumbersIsBlack() throws Exception {
        for(int i = 2; i<=36; i += 2){
            Result r = new Result(i);
            assertTrue(r.color == Result.Color.BLACK);
        }
    }

    @Test
    public void theColorOfOddNumbersIsRed() throws Exception {
        for(int i = 1; i<=36; i += 2){
            Result r = new Result(i);
            assertTrue(r.color == Result.Color.RED);
        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsGreaterThan37()
            throws Exception {
        try {
            Result r = new Result(38);
            //Si on passe R alors il n'y a pas d'erreur oui c'est horrible ce que j'ai fait.
            fail("Cette ligne ne doit pas être exectué");
        } catch (Exception e) {

        }
    }

    @Test
    public void itThrowsExceptionWhenTheRandomizerIsLesserThan0()
            throws Exception {

        try {
            Result r = new Result(-1);

            fail("Cette ligne ne doit pas être exectué");
        } catch (Exception e) {

        }
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",
            "2, 2",
            "37, 0"
    })
    // Ne fonctionne pas mais c'est l'idée ..
    public void assertColorResult(int randomizerValue, Result.Color expectedColor) {
        Result r = new Result(randomizerValue);

        assertTrue(r.color == expectedColor);
    }

    public void assertNumberResult(int randomizerValue, String expectedNumber) {
    }
}