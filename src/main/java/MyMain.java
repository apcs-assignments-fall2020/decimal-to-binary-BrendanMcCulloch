import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int x = Integer.parseInt(binary);
        int dec_value = 0; 
  
        int base = 1; 
   
        while (x > 0) { 
            int last_digit = x % 10; 
            x = x / 10; 
  
            dec_value += last_digit * base; 
  
            base = base * 2; 
        } 
  
        return dec_value; 
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("binary number here");
        String btod = scan.nextLine();
        System.out.println("Your number in decimal form is: " );
        
        scan.close();

    }
}
