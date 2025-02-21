import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        long result = 1;

        if(num>1){
            for(int i =1;i<=num;i++){
                result*=i;
            }
            System.out.println("The factorial of num is : " + " " + result);

        }
        else{
            System.out.println("Enter number grater than 1");
        }

        
    }
}