package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final int rundomNumber = new Random().nextInt(100);

    public Ball getRandomBall() {
        return new Ball(new ColorSupplier().getRandomColor(),rundomNumber);
    }
}
