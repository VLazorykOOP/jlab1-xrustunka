import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення значень a та b
        System.out.print("Введіть значення a (дійсне): ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b (дійсне, більше a): ");
        double b = scanner.nextDouble();

        // Введення кількості елементів масиву
        System.out.print("Введіть кількість елементів n (ціле, n<=200): ");
        int n = scanner.nextInt();

        // Ініціалізація масиву X
        double[] X = new double[n];

        // Введення елементів масиву
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть X(" + (i+1) + "): ");
            X[i] = scanner.nextDouble();
        }

        // Ініціалізація змінних для обчислень
        double sumLessThanA = 0;
        double productGreaterThanB = 1;
        double maxX = X[0];
        double minX = X[0];

        // Обчислення суми, добутку, max та min
        for (int i = 0; i < n; i++) {
            if (X[i] < a) {
                sumLessThanA += X[i];
            }
            if (X[i] > b) {
                productGreaterThanB *= X[i];
            }
            if (X[i] >= a && X[i] <= b) {
                if (X[i] > maxX) {
                    maxX = X[i];
                }
                if (X[i] < minX) {
                    minX = X[i];
                }
            }
        }

        // Виведення результатів
        System.out.println("Сума X(i) < a: " + sumLessThanA);
        System.out.println("Добуток X(i) > b: " + productGreaterThanB);
        System.out.println("max X(i): " + maxX);
        System.out.println("min X(i) серед [a, b]: " + minX);
    }
}