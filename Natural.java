import java.util.*;
public class Natural {
    public static void main(String[] args){
        System.out.println("Enter the range of sum");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul =0;
        // sum =(n*(n+1))/2;
        // System.out.println("The sum of First natural number is: "+ sum);
        for (int i = 1 ; i <= 20 ; i++){
            mul = n * i;
            System.out.println( n + " * " + i + " = " + mul);
        }
        
    }
}
