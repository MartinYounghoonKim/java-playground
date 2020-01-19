package review01;

import java.io.IOException;
import java.sql.SQLDataException;

public class AirUnit extends Unit {
    public AirUnit() {
        super();
    }

    void fly (int x, int y){
        this.move(x, y);
    }
    public boolean move (String x) {
        return true;
    }
}
