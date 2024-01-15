//https://codeforces.com/contest/1352/problem/A

import java.util.ArrayList;
import java.util.Scanner;

//Traversing each digit from right to left
//Take a variable currentSum=1 and multiply it by 10 at each step
//Checking if the number is divisible by 10
//If not divisible, then multiply the number with currentSum, then multiply it by 10 . add result to ArrayList
//If divisible, then also just multiply it by 10, don't add anything to ArrayList
//Traverse the ArrayList and print the element at each index

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
