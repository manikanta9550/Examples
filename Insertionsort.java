public class Insertionsort {
    public static void main(String[] args) {
        int [] arry = {2,1,4,2,6,8,3,9,16,86,90};
        int n = arry.length;
        for(int i =1;i<n;i++){
            
            int key = arry[i];
            int sorted=i-1;
            while(sorted>=0 && arry[sorted]>key){
                arry[sorted+1] = arry[sorted];
                sorted=sorted-1;
            }
            arry[sorted+1]=key;
        }
        for(int nums:arry){
            System.out.print(nums + " ");
        }
    }
    
}
