import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a (дійсне): ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення b (дійсне): ");
        double b = scanner.nextDouble();

        double result = a + ((a + b - 1) / (Math.pow(a, 2) + 2)) - Math.pow(a * b, 3);

        System.out.println("Результат: " + result);
    }
}