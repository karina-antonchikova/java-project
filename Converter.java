cat << 'EOF' > Converter.java
public class Converter {
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
EOF