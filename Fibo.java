public class Fibo {
    public static void main(String[] args){
        int fn =0;
        int sn =1;
        int sum =0;
        for (int i =1 ;i <=5;i++){
            sum = fn + sn;
            fn =sn;
            sn =sum;
            System.out.println(sum);
        }
    }
}
