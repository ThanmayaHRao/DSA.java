import java.util.*;
public class Count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count=0;
        int rev =0;
        while (input>0) {
            count++;
            rev = input%10;
            System.out.print(rev);
            input=input/10;
        }
        System.out.println(count);
        

    }
}
