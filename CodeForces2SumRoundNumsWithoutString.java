import java.util.ArrayList;
import java.util.Scanner;

public class CodeForces2SumRoundNumsWithoutString {
    static void sumOfRoundNums(int num){
          ArrayList<Integer> arrList = new ArrayList<>();
          int currentSum =1;
          int count=0;
          while(num>0){
              int rem = num%10;
              if(rem!=0){
                  count++;
                  arrList.add(rem*currentSum);
              }
              num/=10;
              currentSum*=10;
          }
          System.out.println(count);
          for(Integer i:arrList){
              System.out.println(i);
          }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int num = sc.nextInt();
            sumOfRoundNums(num);
        }
    }
}
