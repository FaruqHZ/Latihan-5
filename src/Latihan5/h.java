package Latihan5;

public class h {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menghitung jumlah angka di dalam dataArray");
        var total = 0;
        for (int indeks = 0; indeks < dataArray.length; indeks++) {
            total += dataArray[indeks];
        }

        System.out.println("Total nilai di dalam dataArray adalah " + total);

    }
}