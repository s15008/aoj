import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

class SortingThreeNumbers {

    private int[] data;

    SortingThreeNumbers(int... data) {
        this.data = Arrays.copyOf(data, data.length);
        sort(this.data);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int num : data) {
            str.append(String.format("%d ", num));
        }
        return str.toString().trim();
    }

    // 非破壊型ソート
    public static int[] sorted(int... data) {
        int[] copy = Arrays.copyOf(data, data.length); // 元のデータを壊さないようにコピーを取る
        sort(copy);

        return copy;
    }

    // 破壊型ソート
    private static void sort(int... data) {
        // bouble sort
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    int tmp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }
}

public class TestSortingThreeNumbers {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        out.println(new SortingThreeNumbers(a, b, c));

        /* sortedサンプル
        for (int num : SortingThreeNumbers.sorted(10, 2, 3, 4, 1, 2, 4, 67, 44, 8, 23, 12, 657, 43)) {
            out.println(num);
        }
        //*/
    }
}
