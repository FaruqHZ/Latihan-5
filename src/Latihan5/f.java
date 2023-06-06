package Latihan5;

public class f {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka-angka ganjil yang diapit oleh angka genap");
        for (var indeks = 1; indeks < dataArray.length - 1; indeks++) {

            if ((dataArray[indeks] % 2 == 1) && (dataArray[indeks - 1] % 2 == 0) && (dataArray[indeks + 1] % 2 == 0)) {
                System.out.println("Angka ganjil, yaitu " + dataArray[indeks] + " terletak pada indeks ke-" + indeks);
            }
        }
    }
}