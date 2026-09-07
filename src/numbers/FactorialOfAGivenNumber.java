package numbers;

import java.util.Scanner;

public class FactorialOfAGivenNumber {
    static String findFactorial (int number){
        long result =1;

        if(number < 0){
            return "Invalid Number";
        }else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }

        return Long.toString(result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(findFactorial(a));
    }
}
