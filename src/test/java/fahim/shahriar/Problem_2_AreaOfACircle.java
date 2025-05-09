package fahim.shahriar;

import java.util.Scanner;

public class Problem_2_AreaOfACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius : " );
        double r = input.nextDouble();
        double pie = 3.14;
        double area = pie * r * r;

        System.out.println("Area of the circle is : " + area );
    }
}
