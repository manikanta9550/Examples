import java.util.Scanner;
class Tower{
    public int Getminimum(int n){
        if(n==1){
            return 1;
        }
        else{
            return 2 * Getminimum(n-1) + 1;
        }
    }
}

public class Hanoi{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of disks to get  minimun number of moves: ");
        int n = scanner.nextInt();
        Tower obj1 = new Tower();
        int result = obj1.Getminimum(n);

        System.out.println("The minimum moves are : " + result);
        
    }
    
}