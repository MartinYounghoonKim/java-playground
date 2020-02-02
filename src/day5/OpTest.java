package day5;

class Test1 {

}
class Test2 {

}
public class OpTest {
    public static void main(String[] args) {
        try {
            throw new OutOfMemoryError("OOM Error");
        } catch (Error e) {
            System.out.println(e);
        }
        System.out.println("ene of Error");
    }
}
