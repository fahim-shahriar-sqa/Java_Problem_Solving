package fahim.shahriar;

import java.util.Scanner;

public class IntegerOrDecimalCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        double num = input.nextDouble();

        if(num == Math.floor(num)){
            System.out.println("The number is an integer");
        }else {
            System.out.println("The number is an Decimal");
        }
    }
}
