import java.util.*;
public class Arreys1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        
        int[] number = new int[size];
        System.out.println("------------------");
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the number thats index has to be found");
        int find = sc.nextInt();
        for(int i=0; i<size; i++){
            if(number[i] == find){
                System.out.println( "The given number"+find+"found at the index :" + i);
            }
        }
    }
}
