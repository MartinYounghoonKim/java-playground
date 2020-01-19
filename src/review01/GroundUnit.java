package review01;

public class GroundUnit extends Unit {
    public GroundUnit() {
        super();
    }
    void walk (int x, int y) {
        this.move(x, y);
    }
}
