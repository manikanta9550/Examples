class Sumofarray{
    public void GetSum(int[]arry1,int target){
        for(int i = 0;i<arry1.length-1;i++){
            for(int j = i +1;j<arry1.length;j++){
                if(arry1[i]+arry1[j] == target){
                    System.out.println(i + " " + j);
                }
            }
        }
        

    }
}
public class Arry{
    public static void main(String[] args){

        int[] arry1 = {1,4,2,5,3,10,7};

        int target = 17;

        Sumofarray obj1 = new Sumofarray();
        obj1.GetSum(arry1,target);


        

    }
}