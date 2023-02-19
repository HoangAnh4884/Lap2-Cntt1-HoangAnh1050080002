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
public class Cau4 {
    
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số nguyên n: ");
            n = scanner.nextInt();
    System.out.println(" ");
            
        int i = 1;
        int KQ = 1;
        while (i <= n) {    
            KQ *= i;       
            i++; 
        }
        System.out.printf("Kết quả của %s! là: %s", n, KQ);
        
    System.out.println(" ");
    }
}
