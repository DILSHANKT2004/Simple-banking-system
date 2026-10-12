import java.util.Scanner;
public class Main {
    static double balance=100.0;
    static boolean isrunning=true;
    static String username = "THARUKADILSHAN";
    static String password = "DarkFlag4367";

        public static void main (String[]args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("*****************");
            System.out.println("BANKING SYSTEM");
            System.out.println("****************");

            System.out.println("Enter Username:");
            String uname = sc.nextLine();
            System.out.println("Enter Password:");
            String passwordHash = sc.nextLine();
            while (isrunning) {


                if (!(uname.equals(username) && passwordHash.equals(password))) {
                    System.out.println("Invalid Credentials!");
                    return;
                }
                System.out.println("1-Check Balance");
                System.out.println("2-Cash Withdraw");
                System.out.println("3-Cash Deposit");
                System.out.println("4-EXIT");

                System.out.print("Enter an option:");
                if (!sc.hasNextInt()) {
                    System.out.println("Invalid Option!");
                    return;
                }
                int choice = sc.nextInt();

                switch (choice) {
                    case 1 -> showbalance();
                    case 2 -> withdraw();
                    case 3 -> deposit();
                    case 4 -> isrunning = false;
                    default -> System.out.println("Invalid Option!");
                }
            }
        }

    static void showbalance(){
        System.out.printf("Your available balance is $ %.2f\n",balance);
    }
    static void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to withdraw($):");
        int amt=sc.nextInt();
        if(amt>=balance){
            System.out.println("The amount you entered is higher than your balance!");
            return;
        }
        System.out.println("Please take your cash");
        balance-=amt;
    }
    static void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to deposit:");
        int amt=sc.nextInt();
        balance+=amt;
        System.out.println("You have deposited "+amt+"\nThank you!");
    }

}
