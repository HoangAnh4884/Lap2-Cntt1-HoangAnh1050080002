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
public class Cau2 {
    
    public static void main(String[] args) {
        double DTB;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điểm trung bình: ");
            DTB = scanner.nextDouble();
    System.out.println(" ");
            
        if (0<DTB && DTB<5)          { System.out.println("Học sinh xếp loại Kém"); }
        else if (5<=DTB && DTB<7)    { System.out.println("Học sinh xếp loại Trung Bình"); }
        else if (7<=DTB && DTB<8)    { System.out.println("Học sinh xếp loại Khá"); }
        else if (DTB<=10)            { System.out.println("Học sinh xếp loại Giỏi"); }
        else                         { System.out.println("Số điểm không hợp lệ, mời nhập lại"); }
        
    System.out.println(" ");
    } 
}