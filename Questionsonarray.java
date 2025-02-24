public class Questionsonarray {
    public static void main(String[] args) {
        int [] arry1 = {0,1,0,1,1,0,1,0,1};
        int [] arry2 = {2,1,3,4,5,2,4,9,7};
        int zerocount = 0 ;
        int onecount = 0;
        int sum =0;
        int max = arry2[0];
        int min = arry2[0];
        int no = arry1.length;
        int secondlargest = 0;

        for(int i = 0 ; i<arry1.length;i++){      //sorting 0  and 1 
            if(arry1[i]==0){
                zerocount+=1;
            }
            else if (arry1[i]==1) {
                onecount = 1;
            }
        }

        // for(int i = 0;i<arry1.length;i++){
        //     int left =0 ;

        //     if(arry1[i]==0){
                
        //         int temp = arry1[i];
        //         arry1[i] = arry1[left];
        //         arry1[left] = temp;
        //         left++;

        //     }
            
        // }
        for(int i = 0;i<arry1.length;i++){
            if(i<zerocount){
                arry1[i]=0;

            }
            else{
                arry1[i]=1;

            }
 

        }

        for(int num:arry1){                                                     //    printing sorted array
         System.out.print(num + " ");

        }
        System.out.println();

        for(int i = 0;i<arry2.length;i++){                                      //caluclating mean and average
            sum+=arry2[i];

        }
        System.out.println("The mean is : " + sum/no);
        System.out.println("the average is : " + sum/2);  
        
        for(int i=0;i<arry2.length;i++){
            if(arry2[i]>max){
                max=arry2[i];
            }
            else if(arry2[i]<min){                                              // finding max an min 
                min=arry2[i];

            }
        }
        System.out.println("The maximum element : " + max);
        System.out.println("The minimum element : " + min);

        for(int i =0;i<arry2.length;i++){
            if(arry2[i]>max){
                max=arry2[i];
            }
            else if(arry2[i]>secondlargest && arry2[i]<max){                   // finding second largest 
                secondlargest = arry2[i];
            }
            else if (secondlargest == max){
                secondlargest = max;
            }
        }
        System.out.println("The second largest: " + secondlargest);
    
    }
}
