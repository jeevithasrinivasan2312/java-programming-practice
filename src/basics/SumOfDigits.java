package basics;

import java.util.Scanner;

public class SumOfDigits {

    static int sumOfDigits(int number) {
        int num = Math.abs(number);
        int sum = 0;
        if (num == 0){
            return 0;
        }
        while(num > 0){
            sum = sum + num%10;
            num/=10;
        }
        return sum;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        System.out.println(sumOfDigits(a));

    }
}
