package Assignment;

import javax.swing.*;
import java.util.Scanner;

public class Banking {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        Customer cust = new Customer();
        Account acc = new Account();

        int status;
        double withdraw,total_withdraw = 0;

        do {
            System.out.print("Enter amount to withdraw >>> RM ");
            withdraw = inp.nextDouble();

            if(withdraw > acc.accountAmount){
                JOptionPane.showMessageDialog(null, "Insufficient Amount !");
            }else{
                total_withdraw += withdraw;
            }
            displaySummary(acc.accountNumber,cust.name, acc.checkBalance(total_withdraw));
            System.out.print("Withdraw again? 1-yes, 0-no >>>> ");

        }while(inp.nextInt() == 1);
    }

    static void displaySummary(String AccountDetails, String CustomerInfo, double sendWithdraw){
        System.out.println("\nAccount holder : " + AccountDetails +
                            "\nAccount number : " + CustomerInfo +
                            "\nBalance amount : " + sendWithdraw);
    }
}



