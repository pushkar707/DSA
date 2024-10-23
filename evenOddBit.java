public class evenOddBit {
    public static void main(String args[]){
        int number = 10;
        Long start = System.nanoTime();

        if((number & 1) == 0){
        // if(number % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println(System.nanoTime() - start);

        System.out.println(String.valueOf(-10));
    }
}
