
import java.util.*;

/**
 * 
 */
@Getter
@Setter
public class Location {
    private int x;
    private int y;
    /**
     * Default constructor
     */
    public Location() {
        this.x = 0;
        this.y = 0;
    }
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * 
     */
    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    //private <int, int> location;

}