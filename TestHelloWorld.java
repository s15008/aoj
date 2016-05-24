import static java.lang.System.out;

class HelloWorld {
    public void run() {
        out.println( "Hello World");
    }
}

public class TestHelloWorld {
    public static void main( String... args) {
        HelloWorld test = new HelloWorld();
        test.run();
    }
}

