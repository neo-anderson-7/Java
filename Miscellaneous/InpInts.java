import java.util.Scanner;

public class InpInts {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();

        System.out.println("The numbers you typed are " + one + " and " + two);
        scanner.close();
    }
}