package Session04;

import java.util.Scanner;

public class QuadraticEquation {
    double a,b,c;
    QuadraticEquation(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getA() {
        return this.a;
    }
    double getB () {
        return this.b;
    }
    double getC () {
        return  this.c;
    }
    double getDiscriminant() {
        return (Math.pow(b,2)-4*a*c) ;
    }
    double getRoot1 () {
        if (getDiscriminant() >= 0) {
            return (-b+Math.sqrt(getDiscriminant()))/2/a ;
        }
        else return 0;
    }
    double getRoot2 () {
        if (getDiscriminant() >= 0) {
            return (-b-Math.sqrt(getDiscriminant()))/2/a ;
        }
        else return 0;
    }
}
class testQuadratic {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Nhập a : ");
        double a = scaner.nextDouble();
        System.out.println("Nhập b : ");
        double b = scaner.nextDouble();
        System.out.println("Nhập c : ");
        double c = scaner.nextDouble();
        QuadraticEquation q = new QuadraticEquation(a,b,c);
        double delta = q.getDiscriminant();
        System.out.println(" Delta = " + delta);
        if (delta <0 ) {
            System.out.println("Phương trình vô nghiệm");
        }
        else if (delta ==0 ) {
            System.out.println("Phương trình có nghiệm kép : " + q.getRoot1() );
            }
        else {
        System.out.println("Phương trình có 2 nghiệm: " + q.getRoot1() + " và " + q.getRoot2());
        }
    }
}
