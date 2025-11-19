import java.util.*;
public class Triangle {
    public static void main(String[] args){
        int out = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }    
            for(int j=0; j<i;j++){
                
                System.out.print(out + " ");   
            }
            out++;
            System.out.println();
        
    }
}
}
