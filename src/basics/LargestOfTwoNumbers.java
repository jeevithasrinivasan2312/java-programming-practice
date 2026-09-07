package basics;

import java.util.Scanner;
import java.lang.Integer;
public class LargestOfTwoNumbers {

    private static  int isLargest (int num1, int num2){
        int x = Integer.max(num1, num2);
        return x;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();

        System.out.println("Enter the second number");
        int y = sc.nextInt();

        System.out.println("Largest number is "+ isLargest(x, y));
        sc.close();
    }
}
