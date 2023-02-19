/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap2;

import java.util.Scanner;

/**
 *
 * @author sonnlh
 */
public class Bai1 {

    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a = ");
            a = scanner.nextDouble();
        System.out.println("Nhập số b = ");
            b = scanner.nextDouble();
    System.out.println(" ");
        
        if (a == 0) {
            if (b == 0)    { System.out.println("Phương trình vô số nghiệm"); } 
            else    { System.out.println("Phương trình vô nghiệm"); } }
        
        else    { System.out.printf("Kết quả X = %s ", (-b / a)); }
        
    System.out.println(" ");        
    }
}