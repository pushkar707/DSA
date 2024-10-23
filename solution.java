public class solution {
    public static void main(String args[]) {
        int x = -12300;
        String num_str = String.valueOf(x);
        System.out.println(num_str);
        int start = 0;
        char first_char = num_str.charAt(0);

        if(first_char == '-'){
            start = 1;
        }
        int i = num_str.length()-1;
        
        for( ;i > start; i-- ){
            if(num_str.charAt(i) != '0'){                
                break;
            }
        }

        num_str = num_str.substring(start, i+1);
        System.out.println(num_str);
        
        String answer = "";

        for(i=num_str.length()-1; i >= 0; i--){
            answer += num_str.charAt(i);
        }

        // return 0;
    }
}