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

        do{
            System.out.print("\nEnter amount to withdraw >>> RM ");
            withdraw = inp.nextDouble();

            if(withdraw > acc.accountAmount){
                JOptionPane.showMessageDialog(null, "Insufficient Amount !");
                displaySummary(acc,cust, acc.accountAmount);
            }else{
                displaySummary(acc,cust, acc.checkBalance(withdraw));
            }System.out.print("\nWithdraw again? 1-yes, 0-no >>>> ");

        }while(inp.nextInt() == 1);
    }

    static void displaySummary(Account details, Customer info, double sendWithdraw){
        System.out.printf("\nAccount holder : %s\nAccount number : %s\nBalance amount : %.2f\n",
                details.accountNumber,info.name,sendWithdraw);
    }
}
