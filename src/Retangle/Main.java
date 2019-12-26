package Retangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height");
        double height = sc.nextDouble();
        System.out.println("enter the height");
        double width = sc.nextDouble();
        Retangle rec = new Retangle(height,width);
        System.out.println("Your Rectangle \n"+ rec.display());
        System.out.println("Perimeter of the Rectangle: "+ rec.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rec.getArea());
    }
}

