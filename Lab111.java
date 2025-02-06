public class Lab111 {
    public static void main(String[] args) {
        double x = 2.0; // Задаем значение x
        int terms = 10; // Количество членов ряда

        double result = calculateExpMinusX(x, terms);
        System.out.println("Приближенное значение e^(-x) для x = " + x + " равно: " + result);
    }

    public static double calculateExpMinusX(double x, int terms) {
        double sum = 0;

        for (int n = 0; n < terms; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, n) / factorial(n);
            sum += term;
        }

        return sum;
    }

    public static double factorial(int n) {
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

