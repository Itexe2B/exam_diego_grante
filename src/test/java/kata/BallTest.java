package kata;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BallTest {

    @Test
    public void itRollsForAGivenAmountOfTime() throws Exception {
        Ball ball = new Ball(500);

        try{
            ball.roll();
        } catch (Exception e) {
            fail("Un problème est survenue.");
        }
    }
}
