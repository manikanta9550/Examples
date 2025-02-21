
import java.util.Scanner;
class Mul{
    public int Getfact(int num){

        if(num==0){
            return 1;
        }else{
            return num * Getfact(num-1);
        }


    }
}

public class Factorialrecursion{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();
        Mul obj1 = new Mul();

        long result = obj1.Getfact(num);

        System.out.println(result);


        
    }
}