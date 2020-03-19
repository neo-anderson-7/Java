import java.util.Scanner;

public class Cubic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        for (int x = 0, max = 0; x <= 1000 && max < 3; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
                max++;
            }
        }

        scanner.close();
    }
}