//Print number from 1 to 5
import java.util.*;
public class Recurssion1 {

    public static void printNum(int n){
        if(n > 5)
            return;



        System.out.println(n);
        printNum(n+1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);

    }    
}
