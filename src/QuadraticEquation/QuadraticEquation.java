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
