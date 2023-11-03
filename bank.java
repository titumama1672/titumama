import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bank {
    String name = " ", address = " ", aadhar = " ";
    int choice = 0;

    public static void main(String[] args) {
        bank b1 = new bank();

        while (b1.choice < 5) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Display Balance");
            System.out.println("Please enter your choice: ");

            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                b1.choice = Integer.parseInt(in.readLine());

                switch (b1.choice) {
                    case 1:
                        b1.create(in);
                        break;
                    case 2:
                        b1.deposit();
                        break;
                    case 3:
                        b1.withdrawal();
                        break;
                    case 4:
                        b1.display();
                        break;
                    default:
                        System.out.println("Please enter a number from 1 to 4: ");
                        break;
                }
            } catch (IOException | NumberFormatException e) {
                System.out.println("Error: " + e);
            }
        }
        System.out.println("Out of the loop");
    }

    void create(BufferedReader in) {
        try {
            System.out.println("Please enter your name: ");
            name = in.readLine();
            System.out.println("Please enter the address: ");
            address = in.readLine();
            System.out.println("Please enter Aadhar card no. : ");
            aadhar = in.readLine();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    void deposit() {
        System.out.println("In Deposit");
    }

    void withdrawal() {
        System.out.println("In Withdrawal");
    }

    void display() {
        System.out.println("In Display");
    }
}
