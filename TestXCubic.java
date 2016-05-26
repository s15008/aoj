import static java.lang.System.out;
import java.util.Scanner;

class XCubic {
    private int volume;

    XCubic(int side) {
        this.volume = pow(side, 3);
    }

    private int pow(int base, int exponent) {
        if (exponent < 2) {
            return base;
        }
        return base * pow(base, exponent - 1);
    }

    @Override
    public String toString() {
        return String.valueOf(volume);
    }

}

public class TestXCubic {
    public static void main(String... args) {
        int x = new Scanner(System.in).nextInt();

        out.println(new XCubic(x));
    }
}

