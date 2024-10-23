public class arrays {
    public static int power(int num, int n){
        if (n == 1){
            return num;
        }
        else if(n == 0){
            return 1;
        }
        else{
            return num * power(num, n-1);
        }

    }
    public static void main(String args[]){
        System.out.println(power(4,4));
    } 
}