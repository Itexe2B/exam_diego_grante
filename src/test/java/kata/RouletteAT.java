package kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RouletteAT {

    @Test
    public void itWaitsForTheBallToStop() {

    }

    @Test()
    public void itProvidesAResultWithColor() throws Exception {
        JavaRandomizer jr = new JavaRandomizer();
        Ball ball = new Ball(500);

        Roulette r = new Roulette(ball, jr);

        assertTrue(r.playGame().color instanceof Result.Color);
    }

}
