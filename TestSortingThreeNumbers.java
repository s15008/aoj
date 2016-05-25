import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.out;

class SortingThreeNumbers {

    public static int[] sorted( int[] inputs) {
        // deep copy
        int[] res = Arrays.copyOf( inputs, inputs.length );

        // bouble sort
        for ( int i = 0; i < res.length; i++ ) {
            for ( int j = 1; j < res.length - i; j++ ) {
                if ( res[j - 1] > res[j] ) {
                    int tmp = res[j - 1];
                    res[j - 1] = res[j];
                    res[j] = tmp;
                }
            }
        }

        return res;
    }

}

public class TestSortingThreeNumbers {
    public static void main( String... args) {
        // scan
        Scanner scan = new Scanner( System.in);
        int[] inputs = new int[3];
        int i = 0;
        while ( scan.hasNext() ) {
            inputs[i] = scan.nextInt();
            i++;
        }

        // format
        StringBuilder output = new StringBuilder();
        for ( int num : SortingThreeNumbers.sorted( inputs ) ) {
            output.append( String.valueOf( num ) + " ");
        }
        output.deleteCharAt( output.length() - 1 );

        // output
        out.println( output );

    }
}
