import java.util.*;


public class Perfect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum =0;
        for(int i=1;i < input;i++){
            if(input % i == 0){
                sum = sum +i;
            }
        }
        if (sum == input){
            System.out.println(input + " is a perfect number.");
        } else {
            System.out.println(input + " is not a perfect number.");
       
        }
    }

    }

// prime number between 1 to 100