import java.util.*;
public class Sum {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
       
        int rev =0;
        while (input>0) {
            
            rev = rev +input%10;  
            input = input/10;
        }
        System.out.println(rev);
        

    }
}
