import java.util.*; 

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();
        int len = name.length(); 
        
        for (int i = 0; i < len; i++) {
            char ch = Character.toLowerCase(name.charAt(i)); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel");
            }
        }
        
        sc.close();
    }
}
