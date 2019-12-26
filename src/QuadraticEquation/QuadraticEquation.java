package QuadraticEquation;

import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getA() {
        return a;
    }

    double getB() {
        return b;
    }

    double getC() {
        return c;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        return (-b + Math.sqrt(this.getDiscriminant())) / (2 * a);
    }

    double getRoot2() {
        return (-b - Math.sqrt(this.getDiscriminant())) / (2 * a);
    }
}

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