import java.util.Scanner;

public class Numoccur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int count = 0;
        int critical = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (count == critical) {
                    break;
                }
                System.out.print(num + " ");
                count++;
            }

            if (count == critical) {
                break;
            }

            num++;
        }
        
        scanner.close();
    }
}