import java.util.Scanner;

public class Homework {

    public static void main(String[] args) throws InterruptedException{
        Scanner sc1 = new Scanner(System.in);
        int test = 0;
        //
        while (test == 0){
            System.out.println("Press [1] to convert ₪ to $");
            System.out.println("Press [2] to convert $ to ₪");
            System.out.println("Press [3] to convert € to ₪");
            System.out.println("Press [4] to convert ₪ to €");
            System.out.println("Press [0] to exit");
            //
            int input1 = sc1.nextInt();
            Double amount;
            //
            switch (input1) {
                case 0:
                    test = 1;
                    System.out.println("Goodbye!");
                    break;
                case 1:
                    System.out.println("write amount in ₪");
                    amount = sc1.nextDouble();
                    System.out.println("₪" + amount + " in $ worth: " + "$" + amount / 3.5453);
                    break;
                case 2:
                    System.out.println("write amount in $");
                    amount = sc1.nextDouble();
                    System.out.println("$" + amount + " in ₪ worth: " + "₪" + amount * 3.5453);
                    break;
                case 3:
                    System.out.println("write amount in €");
                    amount = sc1.nextDouble();
                    System.out.println("€" + amount + " in ₪ worth: " + "₪" + amount * 3.5426);
                    break;
                case 4:
                    System.out.println("write amount in ₪ ");
                    amount = sc1.nextDouble();
                    System.out.println("₪" + amount + " in € worth: " + "€" + amount / 3.5426);
                    break;
                default:
                    break;
            }
            System.out.println("");
                Thread.sleep(700);
        }
    }
}

