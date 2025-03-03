
import java.util.*;

class Rotated {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; 
        int[] temp = new int[n];

        int j = 0;
        
        
        for (int i = k; i < n; i++) {
            temp[j++] = nums[i];
        }
        
        
        for (int i = 0; i < k; i++) {
            temp[j++] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}

public class Leftrotatedarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rotated obj1 = new Rotated();
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] nums = new int[n];

      
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
        obj1.rotate(nums, d);

      
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
