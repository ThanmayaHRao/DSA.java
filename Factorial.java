import java.util.*;

public class Factorial {
    public static void fctorials(int n) {
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int out = 1;
        for (int i = 1; i <= n; i++) {
            out= out*i; 
            
        }
        System.out.println(out);
        return ;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fctorials(n);
    }
}
