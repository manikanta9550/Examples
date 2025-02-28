import java.util.*;
class Sum{
    public void  Getsum(long n){
        long x = n;
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        long totalsum = x+n;
        System.out.println("The total Sum: "+totalsum);
        

    }

}
public class Sumlong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Sum obj1 = new Sum();

        System.out.print("Enter the number: ");

        long num = scanner.nextLong();
        obj1.Getsum(num);
        


    }
    
    
}
