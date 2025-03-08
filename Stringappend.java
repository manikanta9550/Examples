import java.util.*;
class StringQuestions {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String previous = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < previous.length(); i++) {
            if (previous.charAt(i) == previous.charAt(i - 1)) {
                count++;
            } else {
                result.append(count).append(previous.charAt(i - 1));
                count = 1;
            }
        }
        result.append(count).append(previous.charAt(previous.length() - 1));
        return result.toString();
        
    }
}
public class Stringappend{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scanner.nextInt();
        StringQuestions obj1 = new StringQuestions();
        String str1 = obj1.countAndSay(n);
       
        System.out.println(str1);
        
    }
}