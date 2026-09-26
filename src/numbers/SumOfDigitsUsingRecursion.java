package numbers;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {

    static int sumOfDigitsUsingRecursion(int num){
        long number = Math.abs((long) num);
        if(number == 0){
            return 0;
        }
        int i = (int) (number%10);

        return i + sumOfDigitsUsingRecursion((int)(number/10));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(sumOfDigitsUsingRecursion(num));
    }
}
