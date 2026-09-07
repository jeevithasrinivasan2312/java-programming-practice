package numbers;

import java.util.Scanner;

public class PrimeNumber {

    static String checkPrime(int number){
        boolean isPrime = true;
        if(number < 2){
            return  "Invalid Number";
        }
        for(int i=2; i<=(int)Math.sqrt(number); i++){
            if(number % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            return "Prime";
        }else {
            return "Not Prime";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(checkPrime(a));
    }
}
