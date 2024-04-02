package Main.Java;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    int x;
    int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public List<Integer> getCoordinats(){
        List<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return list;
    }

//    public int getX() {
//        return x;
//    }
//
//    public int getY() {
//        return y;
//    }


    public double calculateDistance(Coordinates other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }
}
