/**
 *
 * @author Amdzak
 */

package com.main.faktorial;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        //PEMBUATAN OBJEK SCANNER
        Scanner input = new Scanner(System.in);
        
        //TIPE DATA
        int bil_faktorial,awal = 1;
        
        //INPUT USER
        System.out.println("Program Faktorial");
        System.out.print("Masukan bilangan : ");
        bil_faktorial = input.nextInt();
        
        //RUMUS FAKTORIAL
        for(int i = 1; i <= bil_faktorial; i++){
            awal *= i;
        }
        System.out.println(bil_faktorial + "! = " + awal);
    }
}
