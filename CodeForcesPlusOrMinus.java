import java.util.Scanner;

public class CodeForcesPlusOrMinus {
    static void plusOrMinus(int a,int b,int c){
        if((a+b)==c){
            System.out.println("+");
        }else if((a-b)==c){
            System.out.println("-");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            plusOrMinus(a,b,c);
        }

    }
}
