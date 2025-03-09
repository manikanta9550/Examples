import java.util.*;
class Sorting{
    public static int Partition(int[] arry,int lwr,int upr){
        int pivot = arry[lwr];
        int start = lwr + 1;
        int end = upr;
        while(start<=end){
            while(start <= upr && arry[start]<=pivot){
                start++;

            }
            while(arry[end]>pivot){
                end--;
            }
            if(start<end){
                int temp = arry[start];
                arry[start]=arry[end];
                arry[end]=temp;
            }
        }
        int temp = arry[lwr];
        arry[lwr] = arry[end];
        arry[end] = temp; 
        return end;

    }
    public void Quicksort(int[] arry,int lwr,int upr){
        if(lwr<upr){
            int loc = Partition(arry, lwr, upr);
            Quicksort(arry, lwr, loc-1);
            Quicksort(arry, loc+1, upr);
        }
    }
    public void Printarray(int[] arry){
        for(int nums:arry){
            System.out.print(nums + " ");
        }
        System.out.println();
    }

}

public class Quicksort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sorting obj1 = new Sorting();
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int [] arry = new int[n];
        for(int i =0;i<arry.length;i++){
            System.out.print("Index "+i+" ");
            arry[i]=scanner.nextInt();
        }
        obj1.Printarray(arry);
        
        obj1.Quicksort(arry, 0, arry.length-1);  
        obj1.Printarray(arry);    
        
        
    }
    
}
