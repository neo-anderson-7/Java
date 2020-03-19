import java.util.Scanner;

public class Sumbreaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int x;
        while (scanner.hasNext()) {
            x = scanner.nextInt();
            if (x == 0 || sum >= 1000) {
                break;
            }
            sum += x;
        }

        if (sum < 1000) {
            System.out.print(sum);
        } else {
            System.out.print(sum - 1000);
        }

        scanner.close();
    }
}