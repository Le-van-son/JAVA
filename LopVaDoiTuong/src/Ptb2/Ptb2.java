package Ptb2;

import java.util.Scanner;

public class Ptb2 {
    private double a,b,c,d;

    public  Ptb2(){

    }
    public Ptb2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double delta(){
        return this.b*this.b-4*this.a*this.c;
    }
    public double Nghiem1(){
        return (-this.b+Math.pow(this.delta(),0.5))/(2*this.a);
    }
    public double Nghiem2(){
        return (-this.b-Math.pow(this.delta(),0.5))/(2*this.a);
    }

    @Override
    public String toString() {
        return "ANH SƠN ĐẠI CA";
    }

    public static void main(String[] args) {
        Ptb2 ptb2 = new Ptb2(1,2,8);
        System.out.println(ptb2.toString());
        if (ptb2.delta()>0){
            System.out.println("x1 = " +ptb2.Nghiem1()+" và x2 = "+ptb2.Nghiem2());
        }else if (ptb2.delta()==0){
            System.out.println(-ptb2.getB()/(2* ptb2.getA()));
        }else {
            System.out.println("Pt vô nghiệm");
        }
    }
}
