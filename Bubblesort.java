import java.util.*;
public class Bubblesort {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.print("Not sorted array: ");

        for(int nums:arr){
            System.out.print(nums + " ");
        }
        System.out.println();

        for(int i =0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
        }

        System.out.print("Sorted array: ");

        for(int nums: arr){
            System.out.print(nums + " ");
        }
        
    }
    
}
