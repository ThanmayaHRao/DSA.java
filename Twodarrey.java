import java.util.*;
public class Twodarrey {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter row , column size");
        int row = sc.nextInt();
        int col = sc.nextInt();
         System.out.println( "give the number whose index has to be found");
        int find = sc.nextInt();
        System.out.println( "give the row values");
        int [][] number = new int [row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("//////////////////////////");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(find == number[i][j])
            System.out.print("given  numbers indices were found in "+"("+i +","+j+") ");
        }
        System.out.println();


    }
}

}