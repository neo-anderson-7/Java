import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print(x + " ");
        while (x != 1) {
            x = (x % 2 == 1) ? x / 2 : (3 * x) + 1;
            System.out.print(x + " ");
        }

        scanner.close();
    }
}