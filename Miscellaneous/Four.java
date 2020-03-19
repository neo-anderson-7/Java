import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 0;
        int temp = 0;
        int x = 0;
        while (i < num) {
            x = scanner.nextInt();
            
            if (x % 4 == 0 && x > temp) {
                temp = x;
            }
            
            i++;
        }
        
        System.out.print(temp);
        scanner.close();
    }
}
