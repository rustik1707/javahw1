import java.util.Scanner;
 
  public class задача4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int end = in.nextInt();
        int result = 1;
        
        for ( int i = 1; i <= end; i++ ) {
            result *= i;
        }
        System.out.println(result);
    }
}