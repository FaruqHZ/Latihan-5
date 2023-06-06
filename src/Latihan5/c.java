package Latihan5;

public class c {
    public static void main(String[] args) {

        int[] dataArray = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Menampilkan angka ganjil");

        for (var indeks = 0; indeks < dataArray.length; indeks++) {
            if (dataArray[indeks] % 2 == 1)
                System.out.println("Angka ganjil yaitu, " + dataArray[indeks] + " terletak pada indeks ke-" + indeks);
        }

    }
}