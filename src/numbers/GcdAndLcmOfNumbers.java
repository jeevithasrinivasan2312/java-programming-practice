package numbers;

import java.util.Scanner;

public class GcdAndLcmOfNumbers {

    static long findGCD (long a, long b){
     long c = Math.abs(a);
     long d = Math.abs(b);
        if(d ==0){
           return c;
        }
        long i = (c%d);
        if( i == 0){
            return d;
        }
        return findGCD(d, i);
    }

    static long findLCM(long a, long b){
        a = Math.abs(a);
        b= Math.abs(b);
        if(a==0 && b==0){
            return 0;
        }
        return (a*b/findGCD(a,b));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        long a = sc.nextLong();
        System.out.println("Enter the second number");
        long b= sc.nextLong();
        System.out.println("GCD = "+findGCD(a,b));
        System.out.println("LCM = "+findLCM(a,b));
    }

}
