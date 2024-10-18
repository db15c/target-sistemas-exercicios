import java.util.Scanner;

public class LetterACheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter a string: ");
        String input = scanner.nextLine();

        int count = countLetterA(input);

        if (count > 0) {
            System.out.println("The letter 'a' or 'A' appears " + count + " times.");
        } else {
            System.out.println("The letter 'a' or 'A' does not appear in the string.");
        }

        scanner.close();
    }

    public static int countLetterA(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'A') {
                count++;
            }
        }
        return count;
    }
}