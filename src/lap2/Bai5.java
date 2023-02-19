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
public class Bai5 {
    
    public static void main(String[] args) {
        Cau1 cau1=new Cau1();
        Cau2 cau2=new Cau2();
        Cau3 cau3=new Cau3();
        Cau4 cau4=new Cau4();
        Cau5 cau5=new Cau5();
        Cau6 cau6=new Cau6();
        
        Scanner scanner = new Scanner(System.in);
        int ChonMenu;
    System.out.println(" ");
        
    System.out.println("*+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+*");
        System.out.println("1. Kiểm tra số chính phương");
        System.out.println("2. Xếp loại học tập theo điểm trung bình");
        System.out.println("3. Đọc số nguyên có 3 chữ số");
        System.out.println("4. Tính giai thừa của số nguyên");
        System.out.println("5. Xóa X trong mảng 1 chiều, thứ tự tăng dần");
        System.out.println("6. Ma trận đối xứng cho đồ thị vô hướng");
        System.out.println("7. Kết thúc");
    System.out.println("*+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+*");
        System.out.print("Chọn chức năng: ");
        
            ChonMenu = scanner.nextInt();
        
        switch (ChonMenu) {
            case 1: cau1.main(args);    break;
            case 2: cau2.main(args);    break;
            case 3: cau3.main(args);    break;
            case 4: cau4.main(args);    break;
            case 5: cau5.main(args);    break;
            case 6: cau6.main(args);    break;
            default:    break;
        }
        
    System.out.println(" ");
    }
}