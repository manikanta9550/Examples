import java.util.Scanner;

class Series {

    public void getseries(int num, int first, int second) {
        if (num <= 0) {
            return;
        }
        System.out.print(first + " ");
        getseries(num - 1, second, first + second);
    }

}

public class Fibonicirecursive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        scanner.close();

        Series obj1 = new Series();
        obj1.getseries(num, 0,1); 

    }
}
