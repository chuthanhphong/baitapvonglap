public class menu {
    public static void main(String[] args) {
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 6; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println(" ");

                    }
                    break;
                case 2:
                    System.out.println("draw the square");
                    for (int i = 0; i < 6; i++) {
                                for(int j =0; j<6;j++){
                                    System.out.print("*" +" ");
                                }
                        System.out.println("");

                    }
                    break;
                case 3 :
                    System.out.println("Draw the rectangle");
                    for(int i=0;i<3;i++){
                        for(int j =0;j<6;j++){
                            System.out.print("*" +" ");
                        }
                        System.out.println("");
                }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("none");
            }
        }
    }
}