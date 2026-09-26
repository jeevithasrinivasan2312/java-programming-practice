package numbers;

import java.util.Scanner;

public class CountOfDigitsUsingRecursion {
    static int countOfDigits(int num) {
        long number = Math.abs((long) num);
        if (number < 10) {
            return 1;
        }

        return 1 + countOfDigits((int)(number / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(countOfDigits(a));
    }

}
