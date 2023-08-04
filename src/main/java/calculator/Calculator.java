package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {
        return (double) a / b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int power(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = this.multiply(result, a);
        }
        return result;
    }
}