package Latihan5;

public class e {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka-angka, yang memiliki angka tertentu");
        for (var indeks = 0; indeks < dataArray.length; indeks++) {
            if (dataMengandungAngka(dataArray[indeks], 7)) {
                System.out.println("Angka " + dataArray[indeks] + " terletak pada indeks ke-" + indeks);
            }
        }
    }

    public static boolean dataMengandungAngka(int data, int angka) {
        while (data != 0) {
            int angkaTertentu = data % 10;
            if (angkaTertentu == angka) {
                return true;
            }
            data /= 10;
        }
        return false;
    }
}