package QuadraticEquation;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" a = ");
        double a = sc.nextInt();
        System.out.print("b = ");
        double b = sc.nextInt();
        System.out.print("c = ");
        double c = sc.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("The equation has no real roots");
        } else if (delta == 0) {
            System.out.println("The equation has one root " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }

    }
}
