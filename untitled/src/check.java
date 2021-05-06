import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        System.out.println("nhập số");
        Scanner a = new Scanner(System.in);

        int num = a.nextInt();
        if (num < 2) {
            System.out.println("không là số nguyên tố");
        } else {
            boolean result = true;
            int i =2;
            for (;i<num;i++){
                if(num%i==0){
                        result = false;
                        break;
                }

            }
            if(result){
                System.out.println("là số nguyên tố");
            }else {
                System.out.println("không là số nguyên tố");
            }
        }
    }}