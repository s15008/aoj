import static java.lang.System.out;

class PrintManyHelloWorld {
    private StringBuilder str = new StringBuilder();

    PrintManyHelloWorld(String msg, int amount) {
        for (int i = 0; i < amount; i++) {
            str.append(msg);
        }
    }

    @Override
    public String toString(){
        return str.toString();
    }
}

public class TestPrintManyHelloWorld {
    public static void main(String... args) {
        out.print(new PrintManyHelloWorld("Hello World\n", 1000));
    }
}
