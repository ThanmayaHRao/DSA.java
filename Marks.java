import java.util.*;
public class Marks {
    public static void main(String[] args){
         System.out.println("Enter your marks:");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
       
        
        if( marks >=90 && marks <=100){
            System.out.println("Grade A");
        }
        else if( marks >=70 && marks <89){
            System.out.println("Grade B");
        }
        else if( marks >=50 && marks <69){
            System.out.println("Grade C");
        }
        else if( marks >=35 && marks <49){
            System.out.println("Grade D");
        }
        else if( marks <= 34 && marks >=0){
            System.out.println("Failed");
        }
        
        else{
            System.out.println("Invalid Marks");

        }
        
        
    }
}
