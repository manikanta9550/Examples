class Array{

    public int[] arry1 = {0,1,0,0,1,0,1,0,0,0,1};

    public void PrintArray(){

        for(int num : arry1){
            System.out.print(num + " ");
        }
        System.out.println("");

    }
}

public class Sorting{
    public static void main(String[] args){
        
        Array obj1 = new Array();

        int zero = 0;
        int one = 0;

        for (int i = 0;i<obj1.arry1.length;i++){
            if (obj1.arry1[i]==0){
                zero+=1;
            }
            else{
                one+=1;
            }
        }


        for(int j = 0 ; j<zero;j++){
            obj1.arry1[j]=0;
        }

        for(int k = zero-1;k<obj1.arry1.length;k++){
            obj1.arry1[k]=1;
        }


    
        obj1.PrintArray();
    }
}