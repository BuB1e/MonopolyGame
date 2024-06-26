// Harit Sombatsiri 6510451018

public class Die {
    private int faceValue;
    public void roll() {
        int max = 6;
        int min = 1;
        faceValue = (int) ((Math.random() * (max - min)) + min);
    }

    int getFaceValue() {
        return this.faceValue;
    }
}
