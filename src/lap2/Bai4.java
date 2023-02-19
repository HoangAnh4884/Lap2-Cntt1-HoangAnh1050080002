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
public class Bai4 {
    
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        Bai2 bai2 = new Bai2();
        Bai3 bai3 = new Bai3();
        
        Scanner scanner = new Scanner(System.in);
        int ChonMenu;
    System.out.println(" ");
        
    System.out.println("*+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+*");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
    System.out.println("*+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+*");
        System.out.print("Chọn chức năng: ");
        
            ChonMenu = scanner.nextInt();
        
        switch (ChonMenu) {
            case 1: bai1.main(args);    break;
            case 2: bai2.main(args);    break;
            case 3: bai3.main(args);    break;
            default:    break;
        }
        
           System.out.println(" ");
    }
}