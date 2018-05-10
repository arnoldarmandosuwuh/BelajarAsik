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
public class KelilingPersegi {
    public int kelilingp(){
        int keliling, s;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Sisi : ");
        s = input.nextInt();
        keliling = 4 * s;
        return keliling;
    }
}
