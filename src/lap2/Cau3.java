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
public class Cau3 {
    
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số nguyên n có 3 chữ số: ");
            n = scanner.nextInt();
    System.out.println(" ");
       
        int a = n / 100;
        int b = (n % 100) / 10;
        int c = (n % 100) % 10;
        
        switch (a) {
            case 1: System.out.print("Một trăm ");    break;
            case 2: System.out.print("Hai trăm ");    break;
            case 3: System.out.print("Ba trăm ");     break;
            case 4: System.out.print("Bốn trăm ");    break;
            case 5: System.out.print("Năm trăm ");    break;
            case 6: System.out.print("Sáu trăm ");    break;
            case 7: System.out.print("Bảy trăm ");    break;
            case 8: System.out.print("Tám trăm ");    break;
            case 9: System.out.print("Chín trăm ");   break;
            default:    break;
        }
        switch (b) {
            case 0: System.out.print("lẻ ");          break;
            case 1: System.out.print("mười ");        break;
            case 2: System.out.print("Hai mươi ");    break;
            case 3: System.out.print("Ba mươi ");     break;
            case 4: System.out.print("Bốn mươi ");    break;
            case 5: System.out.print("Năm mươi ");    break;
            case 6: System.out.print("Sáu mươi ");    break;
            case 7: System.out.print("Bảy mươi ");    break;
            case 8: System.out.print("Tám mươi ");    break;
            case 9: System.out.print("Chín mươi ");   break;
            default:    break;
        }
        switch (c) {
            case 1: System.out.print("Một");    break;
            case 2: System.out.print("Hai");    break;
            case 3: System.out.print("Ba");     break;
            case 4: System.out.print("Bốn");    break;
            case 5: System.out.print("Lăm");    break;
            case 6: System.out.print("Sáu");    break;
            case 7: System.out.print("Bảy");    break;
            case 8: System.out.print("Tám");    break;
            case 9: System.out.print("Chín");   break;
            default:    break;
        }
        
    System.out.println(" ");
    }
}