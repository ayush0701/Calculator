package com.company;

import java.util.Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;

class Cannotworkwithsuchinput extends Exception{
    public void invalid(){
        System.out.println(" cannot take s 8 and 9 as input");
    }
}
class ZeroDivision extends Exception{
    public void zeroinput(){
        System.out.println("cannot divide by zero ");
    }
}
class Maxinput extends Exception{
    public void InvalidInputValue(){
        System.out.println("cannot work with such higher value");
    }
}
class MultiplyInput extends Exception{
    public void notvalid(){
        System.out.println(" the input of multiplication cannnot be greater than 7000 ");
    }
}
class Calculator{

    public void Add(double a, double b) throws Cannotworkwithsuchinput,Maxinput{
        if(a==8 ||a==9||b==8||b==9){
            throw new Cannotworkwithsuchinput();
        }
        if((a>10000)||(b>10000)){
            throw new Maxinput();
        }
        System.out.println("the result of the Addition of " + a + " + " + b + " = " + a+b);
    }
    public void Sub(double a,double b) throws Maxinput{
        if((a>10000)||(b>10000)){
            throw new Maxinput();
        }
        System.out.println("The result of the substraction of " + a +"-"+ b + " = "+ (a-b) );
    }

    public void division(double a,double b) throws ZeroDivision,Maxinput{
        if(b==0){
            throw  new ZeroDivision();
        }
        if((a>10000)||(b>10000)){
            throw new Maxinput();
        }
        System.out.println("the result of the Division of " + a + " % " + b + " = " + a%b);
    }
    public double multiply(double a,double b) throws Maxinput,MultiplyInput{
        if((a>10000)||(b>10000)){
            throw new Maxinput();
        }
        if((a>7000)||(b>7000)){
            throw new MultiplyInput();
        }
        System.out.println(" the result of th multiplication of " + a + " X " + b + " = " + a*b);
        return(0) ;
    }

}
public class Main {
            public static void main(String[] args) throws Cannotworkwithsuchinput, Maxinput, ZeroDivision, MultiplyInput {
                Scanner sc = new Scanner(System.in);
                int i=0;
                while(i<5) {
                    System.out.println("Enter the number you want to perform operation ");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(" Enter the choice of the operation you want to perform on input data" + "\n 1: Multiplication"+ "\n 2:Addition" + "\n 3: Subtraction" + "\n 4: Division");
                    int choice = sc.nextInt();
                    Calculator cus = new Calculator();
                    switch (choice) {
                        case 1:
                            System.out.println(" you select the Multiplication operation");
                            cus.multiply(x, y);
                            break;
                        case 2:
                            System.out.println(" you select the Addition operation");
                            cus.Add(x, y);
                            break;
                        case 3:
                            System.out.println(" you select the subtraction operation");
                            cus.Sub(x, y);
                            break;
                        case 4:
                            System.out.println(" you select the division operation");
                            cus.division(x, y);
                        default:
                            System.out.println(" Enter the valid input to perform the operation");

                    }i++;
                }
            }

        }


