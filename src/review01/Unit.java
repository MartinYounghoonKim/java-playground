package review01;

import java.sql.SQLDataException;

public class Unit {
    Point point = new Point();
    /**
     * 오버로딩
     * @description
     * 하나의 클래스에 같은 이름의 메소드를 여러개 선언하는 것
     * @condition
     * 1. 메소드의 이름이 같아야 한다.
     * 2. 매개 변수의 개수 혹은 타입이 달라야 한다.
     * 3. 매개변수가 같고, return 타입이 다른 경우 오버로딩은 성립하지 않는다. (return 타입은 오버로딩의 조건에 아무런 영향을 미치지 않는다.)
     */
    public void move () {
        point.setX(0);
        point.setY(0);
    }
    public void move (int x, int y) {
        point.setX(x);
        point.setY(y);
    }
    public int position () {
        int x = point.getX();
        int y = point.getY();

        return x*x + y*y;
    }
}
