//Sum of N natural numbers
import java.util.*;
public class Recurssion2 {

    public static void printSum(int i,int n,int sum){
        if(i == n){
            sum+=i;
            System.out.println("So total sum of N number is:-"+sum);
            return;
        }

        sum +=i;
        System.out.println(i);
        printSum(i+1, n, sum);

    }

    public static void main(String[] args){
        printSum(1,5, 0);

    }
}
   