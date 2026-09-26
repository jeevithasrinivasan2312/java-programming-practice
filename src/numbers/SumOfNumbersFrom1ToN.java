package numbers;

import java.util.Scanner;

public class SumOfNumbersFrom1ToN {
    static long sumOfNumbers(int number){
        if(number <1){
            return 0;
        }
        return number+sumOfNumbers(number-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int a = sc.nextInt();
        System.out.println(sumOfNumbers(a));
    }

}
