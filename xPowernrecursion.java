public class xPowernrecursion {

    public static int calPower(int x, int n){
        if(n == 0){
            return 1;
        }else{
            return x * calPower(x, n-1);
        }
    }

    public static void main(String args[]){
        int x = 10;
        int n = 1;

        // int result = x;

        // for(int i=1;i<n;i++){
        //     System.out.println(x);
        //     result *= x;
        // }

        // System.out.println(result);
        System.out.println(calPower(x,n));

    }
}
