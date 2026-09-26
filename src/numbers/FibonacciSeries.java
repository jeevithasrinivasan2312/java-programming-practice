package numbers;

import java.util.Scanner;

public class FibonacciSeries {

    static void fibonacciSeriesInARange(int numberOfTerms) {
        int a=0, b=1;
        for (int i = 1; i <= numberOfTerms; i++) {
            System.out.println(a);
          int c=a+b;
          a=b;
          b=c;


        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range value");
        int a = sc.nextInt();
        fibonacciSeriesInARange(a);
    }
}
