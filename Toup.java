import java.util.*;
public class Toup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String small = sc.nextLine();
        int len = small.length();
        for(int i=0 ; i<len ; i++){
            char cap = Character.toUpperCase(small.charAt(i));
            System.out.print(cap);
        }
    }
}
