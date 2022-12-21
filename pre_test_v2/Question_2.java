package pre_test_v2;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int inp_;

        System.out.println("Which of the following do you prefer?\n[1]Shopping\n[2]Travel\n[3]Recreation\n");
        inp_ = scan.nextInt();
        scan.nextLine();

        switch (inp_) {
            case (1) -> {
                String input_ask1;
                System.out.println("Do you have money?");
                input_ask1 = scan.nextLine();
                if (input_ask1.toLowerCase().equals("yes")) {
                    System.out.println("Let's go shopping");
                }
            }
            case (2) -> {
                String input_ask2;
                System.out.println("Do you healthy?");
                input_ask2 = scan.nextLine();
                System.out.println((input_ask2.toLowerCase().equals("yes")) ? "Let's travel somewhere" : "Sorry, stay at home and be safe");
            }

            case (3) -> {
                System.out.println("Ready for exercise");
                for(int i = 0; i < 3; i++) {
                    System.out.println("Jump" + (i + 1));
                }
            }

            default -> {
                System.out.println("Invalid input");
            }
        }
    }
}
