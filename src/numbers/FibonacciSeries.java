package numbers;

import java.util.Scanner;

public class FibonacciSeries {

    static void fibonacciSeriesInARange(int number) {
        int a=0, b=1;
        for (int i = 1; i <= number; i++) {
          int c=a+b;
          a=b;
          b=c;

            System.out.println(a);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range value");
        int a = sc.nextInt();
        fibonacciSeriesInARange(a);
    }
}
