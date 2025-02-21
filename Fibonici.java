import java.util.Scanner;
public class Fibonici {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int num = scanner.nextInt();


        int first = 0;
        int second = 1;

        for (int i = 2 ; i<num;i++){
            System.out.print(first + " ");
            int third = first + second ;
            first = second ;
            second = third;
        }
    

    }
    
}
