import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("2 + 3 = " + Calculator.add(2, 3));
        System.out.println("100C = " + Converter.celsiusToFahrenheit(100) + "F");
    }
}