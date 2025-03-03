import java.util.*;

class Gcd {
    public int Getgcd(int a, int b) {
        while (b != 0) {
            int temp = b; 
            b = a % b;  
            a = temp;  
        }
        return a;
    }
}

public class Maximumsqares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gcd obj1 = new Gcd();
        int n = scanner.nextInt();
        
        for(int i =0 ; i<n ; i ++){
            int l = scanner.nextInt();
            int b = scanner.nextInt();
            int result = obj1.Getgcd(l, b);
            int totalSquares = (l * b) / (result * result);
            System.out.println(totalSquares);
                
        }
        
        
        scanner.close();
    }
}
