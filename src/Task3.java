import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмірність матриць (n <= 15): ");
        int n = scanner.nextInt();

        // Ініціалізація матриць A, B та X
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] X = new int[n][n];

        // Введення елементів матриць A та B
        System.out.println("Введіть елементи матриці A:");
        inputMatrix(A, scanner);

        System.out.println("Введіть елементи матриці B:");
        inputMatrix(B, scanner);

        // Обчислення матриці X
        for (int i = 0; i < n; i++) {
            int maxB = findMax(B[i]);
            for (int j = 0; j < n; j++) {
                X[i][j] = A[i][j] * maxB;
            }
        }

        // Виведення матриці X
        System.out.println("Матриця X:");
        printMatrix(X);
    }

    // Функція для введення елементів матриці
    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Функція для знаходження максимального елемента в рядку
    public static int findMax(int[] row) {
        int max = row[0];
        for (int i = 1; i < row.length; i++) {
            if (row[i] > max) {
                max = row[i];
            }
        }
        return max;
    }

    // Функція для виведення матриці
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}