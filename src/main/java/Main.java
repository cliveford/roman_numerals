import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int convertToNumber(String romanNumeral) {
        String[] numerals = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
        return Arrays.asList(numerals).indexOf(romanNumeral) +1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a Roman Numeral ");
        String numeral = scanner.nextLine();
        System.out.println(convertToNumber(numeral));

        scanner.close();

    }

}
