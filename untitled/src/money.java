import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập lại suất");
        double laisuat;
        laisuat = sc.nextDouble();
        System.out.println("nhập tiền gửi");
        int tiengui = sc.nextInt();
        System.out.println("nhập số tháng");
        int sothang = sc.nextInt();
        int sum =0;
        for(int i=0;i<sothang;i++){
            sum +=(tiengui*laisuat)/12 * sothang;

        }
        System.out.println(sum);
    }
}
