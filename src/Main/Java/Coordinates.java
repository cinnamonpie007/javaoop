package Main.Java;

import Main.Java.characters.Person;

import java.util.List;

public class Coordinates {
    int x;
    int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateDistance(Coordinates other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public void moveTowards(int dX, int dY) {
        int newX = getX() + Integer.signum(dX);
        int newY = getY() + Integer.signum(dY);
        setX(newX);
        setY(newY);
    }
}
