import java.util.*;
public class Prime100 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int count =0;
        for(int i= lower; i<upper; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " is a prime number.");
            }
            
        }
        System.out.println("Total prime numbers between " + lower + " and " + upper + " is: " + count);
    
    }
        static boolean isPrime(int n){
            if(n<2){
                return false;
            }
            for(int i=2;i<n;i++){
                if(n%i == 0)
                return false;
            }
            return true;
        }
    
}
