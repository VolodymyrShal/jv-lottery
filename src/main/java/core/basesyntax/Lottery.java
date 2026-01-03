package core.basesyntax;

import java.util.Random;

public class Lottery {

    public static final int MAX_NUMBER = 101;
    public final Random random = new Random();
    public final ColorSupplier supplier = new ColorSupplier();

    public Ball getRandomBall() {
        Colors color = supplier.getRandomColor();
        int number = random.nextInt(MAX_NUMBER);
        return new Ball(color, number);
    }
}
