package selfeducation.unit05.lesson02;

import java.util.Random;

public class CatRandom {
    public Random name;

    public CatRandom(Random name) {
        this.name = name;

    }

    public Random getName() {
        return name;
    }

    @Override
    public String toString() {
        return "CatRandom{" +
                "name=" + name +
                '}';
    }
}
