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
public class Bai3 {
    
    public static void main(String[] args) {
        int SoDien;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện sử dụng: ");
            SoDien = scanner.nextInt();
    System.out.println(" ");
        
        int TienDien = 0;
        
        if (SoDien < 50 )    { TienDien = SoDien * 1000; }
        else    { TienDien = 50 * 1000 + (SoDien - 50) * 1200; }
        System.out.printf("Số tiền điện là: %s VNĐ ", TienDien);
        
    System.out.println(" ");
    }
}