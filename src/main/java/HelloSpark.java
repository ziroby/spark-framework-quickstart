import static spark.Spark.*;

/**
 * Simple hello class
 */
public class HelloSpark {
    public static void main(String[] args)  {
        get("/", (req, res) -> helloString());
    }
    public static String helloString() {
        return "Hello World!";
    }
}
