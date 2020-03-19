import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This program takes input as a three digit number and returns its sum
        int number = scanner.nextInt();
        int unit = number % 10;
        int tens = (number % 100) / 10;
        int hund = number / 100; // This program works due to integer division

        System.out.print(unit + tens + hund);
        scanner.close(); // Closes the scanner
    }
}