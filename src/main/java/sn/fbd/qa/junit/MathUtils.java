package sn.fbd.qa.junit;

public class MathUtils {
    public static int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division par zéro !");
        return a / b;
    }
}