/*

Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order. Elements of the sequence must go one after another.

 

Input data format

The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

 

Example

The input array is 1 2 4 1 2 3 5 7 4 3. In this case, the length of the longest sequence in ascending order is 5. It includes the following elements: 1 2 3 5 7.

Sample Input 1:

10
1 2 4 1 2 3 5 7 4 3

Sample Output 1:

5

*/

import java.util.Scanner;

public class LongestAsc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int[] order = new int[l];
        
        for (int i = 0; i < l; i++) {
            order[i] = scan.nextInt();
        }
        
        int maxStreak = 1;
        int currentStreak = 1;

        for (int i = 0; i < l - 1; i++) {
            if (order[i + 1] < order[i]) {
                maxStreak = currentStreak > maxStreak ? currentStreak : maxStreak;
                currentStreak = 1;
            } else if (i == l - 2) {
                maxStreak = currentStreak + 1;
            } else {
                currentStreak++;
            }
        }

        System.out.print(maxStreak);

        scan.close();
    }
}