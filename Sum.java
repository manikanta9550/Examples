class Array{

    public int[] arry1 = {0,1,0,0,1,0,1,0,0,0,1};

    public void PrintArray(){

        for(int num : arry1){
            System.out.print(num + " ");
        }
        System.out.println("");

    }
}

public class Sum{
    public static void main(String[] args){
        
        Array obj1 = new Array();


        for(int i = 0;i<obj1.arry1.length - 1; i++){
            for(int j = i+1 ; j<obj1.arry1.length;j++){
                if(obj1.arry1[i]>obj1.arry1[j]){
                    int temp = obj1.arry1[i];
                    obj1.arry1[i] = obj1.arry1[j];
                    obj1.arry1[j] = temp;
                }
            }
            
        }
        obj1.PrintArray();
    }
}