package Latihan5;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Mencari sebuah angka");
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dicari: ");
        var cariAngka = inputUser.nextInt();
        var angkaKetemu = false;
        var indeks = 0;
        for (; indeks < dataArray.length; indeks++) {

            if (dataArray[indeks] == cariAngka) {
                angkaKetemu = true;
                break;
            }
        }

        if (angkaKetemu) {
            System.out.println("Angka " + cariAngka + " ditemukan!, terletak pada indeks ke-" + indeks);
        } else {
            System.out.println("Angka tidak ada di dalam array!");
        }

    }
}