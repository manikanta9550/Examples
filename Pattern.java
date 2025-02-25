import java.util.Scanner;
public class Pattern{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");

        int n = scanner.nextInt();
        int s = n+(n-1);
        int count = 1;

        while(s>=1){
            for(int i =1;i<=s;i++){
                System.out.print( count + " ");
                
            }
            System.out.println();
            s-=2;
            count++;
        }
        s += 4; 
        count -= 2;
        while (s <= n + (n - 1)) {                                        //pattern//
            for (int i = 1; i <= s; i++) {                               //for n =4  
                System.out.print(count + " ");                                        // 1 1 1 1 1 1 1
            }                                                                         // 2 2 2 2 2
            System.out.println();                                                     // 3 3 3
            s += 2;                                                                   // 4
                                                                                      // 3 3 3
                                                                                      // 2 2 2 2 2
                                                                                      // 1 1 1 1 1 1 1
            count--;
        }

    }
}
