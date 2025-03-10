class Selection{

}
public class Selectionsort{
    public static void main(String[] args) {
        int[] arry = {5,2,7,1,9,22,4,10};
        int n = arry.length;
        for(int i =0;i<arry.length;i++){
            int minindex = i;

            for(int j = i+1;j<n;j++){
                if(arry[j]<arry[minindex]){
                    minindex = j;
                }
            }
            int temp = arry[i];
            arry[i]=arry[minindex];
            arry[minindex]=temp;
        }

        for(int nums:arry){
            System.out.print(nums + " ");
        }

     
    }
    
}
