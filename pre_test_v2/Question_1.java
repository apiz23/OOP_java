package pre_test_v2;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int month_count,i;
        double discount,sum = 0;

        System.out.print("How long have been a member: ");
        month_count = scan.nextInt();

        i = 0;
        do{

            System.out.print("Price of item " + (i+1) + " : ");
            sum += scan.nextFloat();
            i++;
        }while(i < 10);

        discount = (month_count > 11)? 0.05*sum:(month_count > 5)? 0.03*sum:0.01*sum;
        System.out.println("\n-------------------------------------------------");
        System.out.println("Price before discount: " + sum);
        System.out.println("Price discount: " + (discount));
        System.out.println("Price after discount: " + (sum - discount));
    }
}
