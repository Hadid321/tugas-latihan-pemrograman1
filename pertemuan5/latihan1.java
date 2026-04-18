/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Hadid Riansyah
 */
public class latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah kehadiran: ");
        int kehadiran = input.nextInt();

        System.out.print("Masukkan total nilai: ");
        double nilai = input.nextDouble();
        
        double validasi = 21 * 75 / 100.0;
        
        String grade;

        if (nilai > 80){
            grade = "A";
        } else if (nilai >= 70){
            grade = "B";
        } else if (nilai >= 60){
            grade = "C";
        } else if (nilai >= 55){
            grade = "D";
        } else {
            grade = "E";
        }
        
        if (kehadiran >= validasi) {
            System.out.println("Nilai: " + nilai);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Kehadiran tidak memenuhi syarat");
            System.out.println("Grade: E");
        }
    }
}