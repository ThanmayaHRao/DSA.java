import java.util.*;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int rem =1;
        for(int i=1;i<=input;i++){
            rem = rem*i;
        }
        System.out.println(rem);
    }
}
