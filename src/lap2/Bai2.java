/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lap2;

import java.util.Scanner;

/**
 *
 * @author sonnlh
 */
public class Bai2 {
 
    public static void main(String[] args) {
        double a, b, c, d;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số a = ");
            a = scanner.nextDouble();
        System.out.println("Nhập số b = ");
            b = scanner.nextDouble();
        System.out.println("Nhập số c = ");
            c = scanner.nextDouble();
    System.out.println(" ");
        
        if (a==0) {
            if (b==0)    { if (c==0) { System.out.println("Phương trình vô số nghiệm"); }
                           else    { System.out.println("Phương trình vô nghiệm"); } }
            else { System.out.printf("X có nghiệm là: %s", ( - c / b)); } }
        
        else {
            d = (b*b) - (4*a*c);
            if (d<0)    { System.out.printf("Phương trình vô nghiệm"); }
            else {
                if (d==0)    { System.out.printf("Phương trình có nghiệm kép, X = %s", -b/(2*a)); }
                else    { double X1 = (-b + Math.sqrt(d)) / (2*a); 
                          double X2 = (-b - Math.sqrt(d)) / (2*a);
                          System.out.printf("Phương trình có 2 nghiệm phân biệt, X1 = %s, X2 = %s", X1, X2); }
            }
            
    System.out.println(" ");    
        }
    }
}