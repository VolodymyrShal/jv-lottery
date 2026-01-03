package core.basesyntax;

import java.util.Random;

public class Lottery {
    public static Ball getRandomBall() {
        String color = String.valueOf(ColorSupplier.getRandomColor());
        int number = new Random().nextInt(101);
        return new Ball(color, number);
    }
}
