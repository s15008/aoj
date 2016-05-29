import java.util.Scanner;
import static java.lang.System.out;

class CircleInARectangle {
    private boolean isContain; // 矩形の中に円が完全に含まれているかをあらわす

    CircleInARectangle(int w, int h, int cx, int cy, int cr) {
        this.isContain = isCircleInRect(w, h, cx, cy, cr);
    }

    @Override
    public String toString() {
        return isContain ? "Yes" : "No";
    }

    // 線分aが線分bに完全に含まれているか
    public static boolean isLineInLine(int al, int ar, int bl, int br) {
        return al >= bl && ar <= br;
    }

    // 円が矩形に完全に含まれているか
    public static boolean isCircleInRect(int rw, int rh, int cx, int cy, int cr) {
        return isLineInLine(cx - cr, cx + cr, 0, rw) &&
                isLineInLine(cy - cr, cy + cr, 0, rh);
    }
}

public class TestCircleInARectangle {
    public static void main(String... args ) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int r = scan.nextInt();

        out.println(new CircleInARectangle(w, h, x, y, r));
    }
}
