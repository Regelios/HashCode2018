import java.util.ArrayList;

public class Ride {

    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private int pickUp;
    private int dropOf;

    public Ride(int startX, int startY, int endX, int endY, int pickUp, int dropOf) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.pickUp = pickUp;
        this.dropOf = dropOf;
    }

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public int getPickUp() {
        return pickUp;
    }

    public void setPickUp(int pickUp) {
        this.pickUp = pickUp;
    }

    public int getDropOf() {
        return dropOf;
    }

    public void setDropOf(int dropOf) {
        this.dropOf = dropOf;
    }
}
