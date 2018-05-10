/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarasik;
import java.util.*;
/**
 *
 * @author Arnold
 */
public class LuasPersegi {
    public void hitung(){
        int luas, s;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Sisi : ");
        s = input.nextInt();
        luas = s * s;
        System.out.println("Luas Persegi = "+luas);
    }
}
