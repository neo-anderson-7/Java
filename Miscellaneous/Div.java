import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.print(num1 / num2);
        scanner.close();
    }
}