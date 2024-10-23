public class decimalToBinary {
    public static void main(String args[]){
        String binary = "";
        int number = 10;
        while(number > 0){
            int remainder = number%2;
            number = number/2;
            binary = String.valueOf(remainder) + binary; 
        }

        System.out.println(binary);
    }
}