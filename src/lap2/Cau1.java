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
public class Cau1 {
    
    public static void main(String[] args) {
        int n;
        double x;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số nguyên n để kiểm tra: ");
            n = scanner.nextInt();
    System.out.println(" "); 
        
        x = Math.sqrt(n);
       
        if ( x - Math.round(x) == 0 )   { System.out.printf("n = %s là 1 số chính phương", n); }
        else    { System.out.printf("n = %s không phải là 1 số chính phương", n); }
        
    System.out.println(" ");
        System.out.printf("Căn số nguyên n là: %s", Math.sqrt(n));
    System.out.println(" ");
    }
}