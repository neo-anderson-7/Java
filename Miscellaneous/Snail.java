import java.util.Scanner;
 
/* Typical job interview problem

Snail creeps up the vertical pole of height H feets. Per day it goes A feets up, and per night it goes B feets down. In which day the snail will reach the top of the pole?

Input data format:

On the input the program receives non-negative integers H, A, B, where H > B and A > B. Every integer does not exceed 100.

Sample Input 1:

10
3
2

Sample Output 1:

8

Sample Input 2:

20
7
3

Sample Output 2:

5

Allowed things: int datatype, String datatype, arithmetic and assignment operators (Only integer division allowed. No fractional division), print, inputs

*/
public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int height = scanner.nextInt();
        int day = scanner.nextInt();
        int night = scanner.nextInt();
        
        int result = (height - night - 1) / (day - night) + 1;
        
        System.out.println(result);
        scanner.close();
    }
}