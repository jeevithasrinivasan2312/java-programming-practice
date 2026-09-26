package numbers;

import java.util.Scanner;

public class PalindromeNumber{
    static String checkPalindrome (int num){
        long number = Math.abs(num);
        long originalNumber = number;
        long result =0;
        while(number > 0){
            long i = number%10;
            result = result*10 + i;
            number/=10;
        }
        if(originalNumber == result){
            return "Palindrome";
        }else {
            return "Not Palindrome";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(checkPalindrome(a));
    }

}