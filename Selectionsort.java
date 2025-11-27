public class Selectionsort {

  public static void printArrey(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }

    public static void main(String[] args){
        int num[] = {7,8,3,1,2};
        
        //Selection sort
        
        printArrey(num);
    }
}
