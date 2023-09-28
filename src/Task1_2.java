import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть значення a (ціле): ");
        int a = scanner.nextInt();

        System.out.print("Введіть значення b (ціле): ");
        int b = scanner.nextInt();

        double result = a + ((a + b - 1) / (Math.pow(a, 2) + 2)) - Math.pow(a * b, 3);

        System.out.println("Результат: " + result);
    }
}