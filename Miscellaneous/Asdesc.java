import java.util.Scanner;

public class Asdesc {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int checkCount = 1; //  to comapare at end with count
        int prev = scanner.nextInt();
        if (scanner.hasNext() && scanner.nextInt() != 0) {
            count++;
            checkCount++;
            int curr = scanner.nextInt();
            int step = (curr > prev) ? 1 : -1; //   1 for ascending and -1 for descending
            if (step == 1) {
                while (scanner.hasNext()) {
                    prev = curr;
                    curr = scanner.nextInt();
                    if (curr == 0) {
                        break;
                    }
                    count++;
                    checkCount += (curr >= prev) ? 1 : -1;
                }

                if (count == checkCount) {
                    System.out.print(true);
                } else {
                    System.out.print(false);
                }
            } else {
                while (scanner.hasNext()) {
                    prev = curr;
                    curr = scanner.nextInt();
                    if (curr == 0) {
                        break;
                    }
                    count++;
                    checkCount += (curr <= prev) ? 1 : -1;
                }

                if (count == checkCount) {
                    System.out.print(true);
                } else {
                    System.out.print(false);
                }
            }
        } else {
            System.out.print(true);
        }

        scanner.close();
    }
}