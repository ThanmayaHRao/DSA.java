// import java .util.*;
// public class Bubblesort {

//     //Function for printArrey
//     public static void printArrey(int arr[]){
//         for(int i=0; i <arr.length;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args){
//         int arr[] = {7,8,2,3,1};

//         //Bubble sort
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0; j<arr.length-1-i;j++){
//                 if(arr[j] > arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//        System.out.println(Arrays.toString(arr));
//       printArrey(arr);
//     }
// }
import java.util.*;
class Bubblesort{

    public static void printArrey(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int arr[] = {8,7,3,5,6,4,2,1};
        for(int i=0;i <arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        printArrey(arr);
    }
}