package basics;

import java.util.Scanner;

public class ArmstrongNumber{
    static int countDigits(int number){
        if(number == 0){
            return 1;
        }
       int count =0;
        while(number >0){
            number/=10;
            count++;
        }
        return count;
    }

    static String checkArmstrong(int number){
        int result =0;
        int originalNumber = number;
        if(number >=0){
            int count = countDigits(number);
            while(number >0){
                int i = number%10;
                result = result + (int) Math.pow(i,count);
                number/=10;
            }
        }else{
            return "Invalid Number";
        }
        if(originalNumber == result){
            return "It is Armstrong";
        }else{
            return "It is not Armstrong";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(checkArmstrong(a));
    }
}