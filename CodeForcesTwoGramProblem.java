import java.util.Scanner;

//https://codeforces.com/problemset/problem/977/B
public class CodeForcesTwoGramProblem {

    static String maxFreqSubString(String s){

        int maxFreq = 0;
        int freq;
        String maxStr = "";
        String str="";
        for(int i=0;i<s.length()-2;i++){//ABACABA
          str = s.substring(i,i+2);
          freq=1;
          for(int j=i+1;j<s.length()-1;j++){
              if(s.substring(j,j+2).contains(str)){
                  freq+=1;
                  if(freq>maxFreq){
                      maxFreq = freq;
                      maxStr = s.substring(j,j+2);
                  }
              }
          }
        }
        return maxStr;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String str = sc.next();
       String maxStr = maxFreqSubString(str);
       System.out.println(maxStr);
    }
}
