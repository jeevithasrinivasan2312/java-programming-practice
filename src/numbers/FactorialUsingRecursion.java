package numbers;

import java.util.Scanner;

public class FactorialUsingRecursion {

    static String factorialUsingRecursion(int num){
        if(num < 0){
            return "Invalid Input";
        } else if (num == 0) {
            return "1";
        }

        return Long.toString(num * Long.parseLong(factorialUsingRecursion(num-1)));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Increments needed");
        int num = sc.nextInt();
        System.out.println(factorialUsingRecursion(num));
    }
}
