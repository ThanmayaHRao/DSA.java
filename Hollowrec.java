import java.util.*;
public class Hollowrec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int col= sc.nextInt();
        int row = sc.nextInt();
        for(int i = 1; i<=col; i++){
            for(int j = 1; j<=row; j++){
                if(i == 1 || j == 1 || i== col || j==row)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }    
                
            }
            System.out.println();
        }
    }
}
