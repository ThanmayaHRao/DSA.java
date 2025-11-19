import java.util.*;

public class Arreys {
    public static void main(String[] args) {
        System.out.println("Please enter the size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int marks[] = new int[size];
        System.out.println("please enter the marks");
        for (int i = 0; i < size; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("------------------------------");
        System.out.println("-------------------------------");
        for (int i = 0; i < size; i++) {
            System.out.println(marks[i]);
        }

    }
}
