import java.util.Scanner;

public class vehinh {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        while (true) {
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            int a = x.nextInt();
            switch (a) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*" + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i < 6; i++) {
                        for (int j = 6; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }break;
                case 4:
                    for(int i=1;i<=6;i++){
                        for (int j=1;j<=6-i;j++){
                            System.out.print(" ");
                        }
                        for (int e=1;e<=2*i-1;e++){
                            System.out.print("*");
                        }
                        System.out.println(" ");
            }           break;
        }
    }
}}