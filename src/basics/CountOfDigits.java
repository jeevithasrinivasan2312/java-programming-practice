package basics;

public class CountOfDigits{
    static int countOfDigits(int number){
        int count = 0;
        long l = number;
        l = Math.abs(l);
        if(l == 0){
            return 1;
        }
        while(l>0){
            l/=10;
            count ++;
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(countOfDigits(Integer.MIN_VALUE));
    }
}
