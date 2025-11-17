import java.util.*;
public class Factors {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();
    for(int i = 2; i<input ; i++){
        if(input % i == 0){
            System.out.print(i);
        }
       
    }
  

    
   } 
}
