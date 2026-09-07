package numbers;

import java.util.Scanner;

public class PrimeNumberInARange {
  static void printPrimeNumbersInRange(int rangeStart, int rangeEnd){
      if(rangeStart < 2){
          System.out.println("Invalid Range");

      }
      for(int i = rangeStart; i<=rangeEnd; i++){
          boolean isPrime = true;
          int k = (int)Math.sqrt(i);
          for (int j=2; j<=k; j++){
              if(i %j == 0){
                  isPrime = false;
                  break;
              }
          }
          if(isPrime) {
           System.out.println(i);
          }
      }

  }

  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the start range");
      int a = sc.nextInt();
      System.out.println("Enter the end range");
      int b = sc.nextInt();
      System.out.println("Prime Number in range " + a + " and "+b);
      printPrimeNumbersInRange(a,b);
  }

}
