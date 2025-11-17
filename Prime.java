import java.util.*;
public class Prime {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean isPrime = true;
        for(int i=2; i<=input/2; i++){
            if(input % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime && input > 1){
            System.out.println(input + " is a prime number.");
        } else {
            System.out.println(input + " is not a prime number.");
        }
    }
}
