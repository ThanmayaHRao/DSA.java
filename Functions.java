import java.util.*;


public class Functions {
//     public static void printMyName(String name){
//     System.out.println("Your entered name is :"+name);
//     return;
// }
    public static int calculateProduct(int a, int b){
      return a * b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = calculateProduct(a, b);
       System.out.println( "Your product is :"+calculateProduct(a, b));
    }
}
