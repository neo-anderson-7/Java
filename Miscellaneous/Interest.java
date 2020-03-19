import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextFloat();
        float p = scanner.nextFloat();
        float k = scanner.nextFloat();
        int years = 0;
        
        if (m != k) {
            do {
                years++;
                m = m * (1 + (p / 100));
            } while (m < k);
        }
                
        System.out.print(years);
        scanner.close();
    }
}