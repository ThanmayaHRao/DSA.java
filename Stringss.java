import java.util.*;
public class Stringss {
    public static void main(String[] args){
        // String str = "My name is tony";
        // String sub = "MonkeyDLuffy";
        // String name = str.substring(11,str.length());
        // String name2 = sub.substring(7);
        // System.out.println(name);
        // System.out.println(name2);
        // StringBuilder sb = new StringBuilder("Tony");
        // sb.delete(2,3);
        // sb.append(" Stark");
        // System.out.println(sb);
        // String str = "hello";
        // String out = "";
        // for (int i = str.length()-1 ; i>=0 ; i--){
        //     out = out + str.charAt(i);
           
        // }
        //  System.out.println(out);
       Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string to be reversed");
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        for (int i=0 ; i<str.length()/2 ; i++){
            int front = i;
            int back = str.length()-1-i; 

            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);

            str.setCharAt(front,backChar);
            str.setCharAt(back,frontChar);
        }
        System.out.println(str);

        


            


        }
    }

