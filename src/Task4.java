import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String inputText = scanner.nextLine();

        // Розділити текст на слова
        String[] words = inputText.split("\\s+");

        // Ініціалізувати окремий рядок для слів з подвоєнням літер
        StringBuilder doubledWords = new StringBuilder();

        // Ініціалізувати окремий рядок для залишеного тексту
        StringBuilder remainingText = new StringBuilder();

        // Перевірити кожне слово на наявність подвоєних літер
        for (String word : words) {
            if (hasDoubledLetters(word)) {
                doubledWords.append(word).append(" ");
            } else {
                remainingText.append(word).append(" ");
            }
        }

        // Вивести окремі рядки
        System.out.println("Слова з подвоєнням літер: " + doubledWords.toString().trim());
        System.out.println("Текст, що залишився: " + remainingText.toString().trim());
    }

    // Функція для перевірки наявності подвоєних літер у слові
    public static boolean hasDoubledLetters(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}