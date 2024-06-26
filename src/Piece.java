// Harit Sombatsiri 6510451018

public class Piece {
    private Square location;
    private Square oldLocation;

    public Piece() {
        location = new Square("S1");
        oldLocation = location;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getOldLocation() {
        return oldLocation;
    }

    public void setOldLocation(Square oldLocation) {
        this.oldLocation = oldLocation;
    }
}
