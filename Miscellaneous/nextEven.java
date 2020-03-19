import java.util.Scanner;

//  Prints the next even number

public class nextEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n + 2 - (n % 2)); // If num is even then two is added and one added if odd => Add 2 - Mod
        scanner.close();
    }
}