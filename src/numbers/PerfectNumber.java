package numbers;

import java.util.Scanner;

public class PerfectNumber {


    static String checkNumber(int num){
        int result = 0;
        if(num <= 0){
            return "Not a perfect number";
        }else {
            for (int i = 1; i <=num/2; i++) {
                if (num % i == 0) {
                    result += i;
                }
            }
        }
        if(result==num){
            return "Perfect Number";
        }
        return "Not a perfect number";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(checkNumber(a));
    }
}
