package belajarasik;

import java.util.*;

public class BelajarAsik {
public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int pil;
        do {
            System.out.println("Pilih Menu :");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Keliling Persegi");
            System.out.println("3. Volume Kubus");
            System.out.println("4. Exit");
            System.out.print("Masukkan Pilihan Anda : ");
            pil = input.nextInt();

            if (pil == 1) {
                LuasPersegi luasp = new LuasPersegi();
                luasp.hitung();
            } else if (pil == 2) {
                KelilingPersegi kelilingpe = new KelilingPersegi();
                int keliling = kelilingpe.kelilingp();
                System.out.println("Keliling Persegi = " + keliling);
            } else if (pil == 3) {
               System.out.println("Volume Kubus = " + volumekubus());
            } 
        }
        while(pil!=4);
    }
    public static int volumekubus (){
        int volume, s;
        System.out.print("Masukkan Sisi : ");
        s = input.nextInt();
        volume = s * s * s;
        return volume;
    }

}
