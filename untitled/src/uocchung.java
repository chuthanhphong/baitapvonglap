import java.util.Scanner;

public class uocchung {
    public static void main(String[] args) {
        int a ;
        int b ;
        Scanner input = new Scanner(System.in);
        System.out.println("input a");
        a = input.nextInt();
        System.out.println("input b");
        b= input.nextInt();
        a = Math.abs(a);
        b= Math.abs(b);
        if(a==0|| b ==0){
            System.out.println("không có giá trị");
        }else {
            while (a!=b){
                if(a>b){
                    a=a -b;
                }else {
                    b=b-a;
                }
            }
            System.out.println("Greatest common factor:" + a);
        }
    }
}
