//https://codeforces.com/problemset/problem/112/A
import java.util.Scanner;

public class CodeForcesStringProblem {
    static int stringCompare(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.compareTo(s2)==0){
            return 0;
        }else if(s1.compareTo(s2)<0){
            return -1;
        }else if(s1.compareTo(s2)>0){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(stringCompare(s1,s2));
    }
}
