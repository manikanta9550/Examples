import java.util.Arrays;
public class Mergetwosortedarray {
    public static void main(String[] args) {
        int [] num1 = {1,2,3,4,5,6};
        int [] num2 = {3,4,6,7,8};
        int [] num3 = new int [num1.length+num2.length];
        for(int i =0;i<num1.length;i++){
            num3[i] = num1[i];
            
        }
        for(int i =0;i<num2.length;i++){
            num3[num1.length+i] = num2[i];
        }
        Arrays.sort(num3);

        for(int nums:num3){
            System.out.print(nums + " ");
        }


    }
    
}
