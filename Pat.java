import java.util.*;
public class Pat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int out =1;
        for(int i=0; i<n; i++){
            for(int j=0;j<=i; j++){
                if(out%2 == 0)
                System.out.print("1 ");
                else{
                   System.out.print("0 "); 
                }
                out++;
            }
            System.out.println();
        }
    }
}
