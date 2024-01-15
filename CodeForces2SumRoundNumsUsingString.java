import java.util.ArrayList;
import java.util.Scanner;

public class CodeForces2SumRoundNumsUsingString {
    static void sumOfRoundNums(int num){
        String s = String.valueOf(num);
        int count=0;
        ArrayList<Integer> arrList = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='0'){
              count++;
              int digits_atRight = s.length()-i-1; //5009, d_atRight = 3, 5*1000(10 power 3)
              int result = (int)((s.charAt(i)-'0')*Math.pow(10,digits_atRight));
              arrList.add(result);
            }
        }
        System.out.println(count);
        for(Integer i:arrList){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number");
      int t = sc.nextInt();
      for(int i=0;i<t;i++){
          int num = sc.nextInt();
          sumOfRoundNums(num);
      }
    }
}
