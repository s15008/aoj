import static java.lang.System.out;

class HelloWorld {
    private String msg;

    HelloWorld(String msg) {
        this.msg = msg;
    }

    HelloWorld() {
        this("Hello World");
    }

    @Override
    public String toString() {
        return msg;
    }
}

public class TestHelloWorld {
    public static void main( String... args) {
        out.println(new HelloWorld());
    }
}
